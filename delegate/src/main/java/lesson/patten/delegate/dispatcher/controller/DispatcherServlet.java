package lesson.patten.delegate.dispatcher.controller;

import lombok.Data;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * DispatcherServlet 做任务的分发，委派给具体的controller执行
 * @author :lujia
 * @date :2019/4/29  10:53
 */
public class DispatcherServlet extends HttpServlet {


    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        try {
            //初始化逻辑，扫描所有的controller对象。注册到handlerMapping里面
            Class clazz = OrderController.class;
            Handler handler = new Handler();
            handler.setController(clazz.newInstance());
            handler.setMethod(clazz.getMethod("getOrder", new Class[]{String.class}));
            handler.setUrl("getOrder");
            handlerMapping.add(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            doDispatcher(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   /* private void doDispatcher(HttpServletRequest req,  HttpServletResponse resp) throws IOException {

        String requestURI = req.getRequestURI();
        if ("getOrder".equals(requestURI)){
            String order = new OrderController().getOrder("123");
            resp.getWriter().write(order);
        }else if ("queryMember".equals(requestURI)){
            String s = new MemberController().queryMember();
            resp.getWriter().write(s);
        }else {
            resp.getWriter().write("404 not found");
        }
    }*/


    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException, InvocationTargetException, IllegalAccessException {

        String requestURI = req.getRequestURI();
        Handler handler=null;
        for (Handler h : handlerMapping) {
            if (handler.getUrl().equals(requestURI)) {
                handler=h;
                break;
            }
        }
        if (handler!=null){
            Object orderId = handler.getMethod().invoke(handler.getController(), req.getParameter("orderId"));
            resp.getWriter().write(orderId.toString());
        }
    }
}

@Data
class Handler {
    /**
     * 具体的controller对象
     */
    private Object controller;
    /**
     * controller里面对应的方法
     */
    private Method method;
    /**
     * 请求映射路径
     * @RequestMapping
     *
     */
    private String url;


}
