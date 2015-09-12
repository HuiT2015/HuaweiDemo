package com.test.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.test.pojo.Student;

public class PersonAction {
	private static final String ADD="add";
	private static final String LIST="list";
	private String action;
	private Student student;
	private List<Student> stusList;
	
    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private String execute() throws Exception
    {
    	if (action.equals(ADD)) {
		  return addPerson();	
		}
    	return listPerson();
    }
    
    private String addPerson()
    {
    	if (student.isEmpty()==true) {
			return ADD;
		}
    	stusList.add(student);
    	return listPerson();
    }
    
    private String listPerson() {
    	HttpServletRequest request=ServletActionContext.getRequest();
    	request.setAttribute("stusList",stusList);
		return LIST;
	}
    
}
