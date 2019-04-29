package lesson.patten.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujia
 * @date :2019/4/29  14:07
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper rowMapper, Object[] objects) {

        try {
            //1获取连接
            Connection connection = this.getConnection();
            //2创建语句集
            PreparedStatement preparedStatement = this.createPreparedStatement(sql, connection);
            //3执行语句集
            ResultSet resultSet = this.executeQuery(preparedStatement, objects);
            //4.解析结果集
            List list = this.parseResultSet(resultSet, rowMapper);
            //关闭连接
            this.close(connection,preparedStatement,resultSet);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭资源
     * @param connection
     * @param preparedStatement
     * @param resultSet
     * @throws SQLException
     */
    private void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    /**
     * 处理结果集
     * @param resultSet
     * @param rowMapper
     * @return
     * @throws SQLException
     */
    private List parseResultSet(ResultSet resultSet, RowMapper rowMapper) throws SQLException {

        List list = new ArrayList();

        int num = 1;
        while (resultSet.next()) {
            list.add(rowMapper.rowMap(resultSet, num++));
        }
        return list;
    }

    /**
     * 设置参数，执行查询
     * @param preparedStatement
     * @param objects
     * @return
     * @throws SQLException
     */
    private ResultSet executeQuery(PreparedStatement preparedStatement, Object[] objects) throws SQLException {
        for (int i = 0; i < objects.length; i++) {
            preparedStatement.setObject(i, objects[i]);
        }
        return preparedStatement.executeQuery();
    }

    /**
     * 创建语句集
     * @param sql
     * @param connection
     * @return
     * @throws SQLException
     */
    private PreparedStatement createPreparedStatement(String sql, Connection connection) throws SQLException {
        return connection.prepareStatement(sql);
    }

    /**
     * 通过dataSource获取连接
     * @return
     * @throws Exception
     */
    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }

}
