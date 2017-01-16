package edu.ecjtu.Actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import edu.ecjtu.Service.PersonService;

public class PersonAction extends ActionSupport {
	@Autowired
	private PersonService service;

	public String execute() {
		System.out.println("execute。。。。。。。。。。。。。。。。。。。。。");
		service.save();
		return SUCCESS;
	}
}
