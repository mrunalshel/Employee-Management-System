package empdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.emp.employee;



public class emp1 implements employeedao{
	private JdbcTemplate jdtd;

	public int insert(employee st) {
		String query="insert into employee(id,city,firstname,lastname) values(?,?,?,?)";
		int r = this.jdtd.update(query,st.getId(),st.getCity(),
				st.getFirstname(),st.getLastname());
		return r;
	}
	

	public int change(employee st) {
		// TODO Auto-generated method stub
		String query="update employee set city=?,firstname=?,lastname=? where id=?"; 
		int s = this.jdtd.update(query,st.getCity(),st.getFirstname(),
				st.getLastname(),st.getId());
		return s;
	}


	public int delete(int sid) {
		// TODO Auto-generated method stub
		String query="delete from employee where id=?";
		int t=this.jdtd.update(query,sid);
		return t;
	}

	

	public employee getemployee(int sid) {
		// TODO Auto-generated method stub
		String query = "select * from employee where id=?";
		RowMapper <employee>rmp=new rowmapper();
		this.jdtd.queryForObject(query,rmp,sid);
		employee emp=this.jdtd.queryForObject(query,rmp,sid);
		
		return emp;
	}

	public List<employee> getallemployee() {
		// TODO Auto-generated method stub
		String query = "select*from employee";
List<employee> st1=this.jdtd.query(query,new rowmapper());
		return st1;
	}


	
		


		
	
	public JdbcTemplate getJdtd() {
		return jdtd;
	}

	public void setJdtd(JdbcTemplate jdtd) {
		this.jdtd = jdtd;
	}


	
	
	

}
