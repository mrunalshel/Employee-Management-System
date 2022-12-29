package empdao;

import java.util.List;

import com.emp.employee;

public interface employeedao {
	public int insert(employee st);
	public int change(employee st);
	public int delete(int sid);
	public employee getemployee(int sid);
	public List<employee> getallemployee();
	

}
