package lesson.patten.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 * @author :lujia
 * @date :2019/4/29  14:09
 */
public interface RowMapper<T> {
    T rowMap(ResultSet resultSet,int rowNum);
}
