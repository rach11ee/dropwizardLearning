package com.rach.corpDirDropwizard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/corpDirectory")
@Produces(MediaType.APPLICATION_JSON)

public class CorpDirResource {
	private final String packages;
	private final String url;
	private final String user;
	private final String password;
	
	public CorpDirResource(String packages, String url, String user, String password) {
		this.packages = packages;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/employee/{id}")
	@GET
	@Timed
	
	//public Employee getEmpById(@QueryParam("id") int id)
	public Employee getEmpById(@PathParam(value = "id") int id)
	{
		Connection con = null;
		try {
			System.out.println(packages);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			Class.forName(packages);
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("SQL Exception: "+e.getMessage());
		}
		Services serv = new Services(con);
		return serv.getEmployeeById(id);

	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/employees")
	@GET
	@Timed
	
	public List<Employee> getEmployees()
	{
		Connection con = null;
		try {
			System.out.println(packages);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			Class.forName(packages);
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("SQL Exception: "+e.getMessage());
		}
		Services serv = new Services(con);
		return serv.getEmployees();
	}

	/*
	@Path("/addEmployee")
	@PUT 
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee insertNewEmployee(Employee employee) {
		Connection con = null;
		try {
			System.out.println(packages);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			Class.forName(packages);
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("SQL Exception: "+e.getMessage());
		}
		Services serv = new Services(con);
		return serv.insertEmployee(employee);
 
	}
	*/
	
	
}
