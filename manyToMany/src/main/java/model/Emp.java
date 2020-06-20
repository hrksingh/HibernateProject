package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Emp {

	@Id
	private int eid;
	private String empName;

	@ManyToMany()
	@JoinTable(name = "emp_to_projects_table", 
	   joinColumns = { @JoinColumn (name ="eid")},
	   inverseJoinColumns = {@JoinColumn(name = "pid")})
	List<Projects> projectsList = new ArrayList<Projects>();

	public Emp() {
		super();
	}

	public Emp(int eid, String empName, List<Projects> projectsList) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.projectsList = projectsList;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Projects> getProjectsList() {
		return projectsList;
	}

	public void setProjectsList(List<Projects> projectsList) {
		this.projectsList = projectsList;
	}

}
