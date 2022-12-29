package empdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.emp.employee;

public class rowmapper implements RowMapper<employee> {

	public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		employee ey=new employee();
		ey.setId(rs.getInt(1));
		ey.setFirstname(rs.getString(4));
		ey.setCity(rs.getString(2));
		ey.setLastname(rs.getString(3));
		return ey;
	}
	

}
