package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_table")
public class Projects {

	@Id
	private int pid;
	private String projectName;

	@ManyToMany(mappedBy = "projectsList")
	List<Emp> empList = new ArrayList<Emp>();

	public Projects() {
		super();
	}

	public Projects(int pid, String projectName, List<Emp> empList) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.empList = empList;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	
	

}
