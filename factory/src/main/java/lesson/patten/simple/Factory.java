package lesson.patten.simple;

import lesson.patten.IPhone;
import lesson.patten.Mobile;

/**
 * 简单工厂
 * @author :lujia
 * @date :2019/4/23  22:30
 */
public class Factory {

    public Mobile create(String type){
        if ("IPhone".equals(type)){
            return new IPhone();
        }else {
            return null;
        }
    }

    public Mobile createByClassName(String className){
        if (className==null||"".equals(className)){
            return null;
        }else {
            try {
                return (Mobile)Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Mobile createByClass(Class clazz){
        try {
            Object o = clazz.newInstance();
            if (o instanceof Mobile){
                return (Mobile) o;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
