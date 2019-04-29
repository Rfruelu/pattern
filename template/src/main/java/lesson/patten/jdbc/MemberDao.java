package lesson.patten.jdbc;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author :lujia
 * @date :2019/4/29  14:25
 */
public class MemberDao extends JdbcTemplate{



    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List selectAll(){
        String sql="select * from member";
        return this.executeQuery(sql,( resultSet,rowNum)->{
            Member member=new Member();
            try {
                member.setId(resultSet.getString("id"));
                member.setName(resultSet.getString("name"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return member;
        },null);
    }
}
