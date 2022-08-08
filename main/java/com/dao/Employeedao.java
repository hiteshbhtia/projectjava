package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.Employeebean;
import com.util.Dbconnection;

public class Employeedao {
	public void insertEmployee(Employeebean bean) {
		try {
			Connection con = Dbconnection.getConnection();
			PreparedStatement st = con
					.prepareStatement("insert into employees (name,surname,salary,position,email) values(?,?,?,?,?)");
//			Employeebean bean=new Employeebean();
			st.setString(1, bean.getName());
			st.setString(2, bean.getSurname());
			st.setInt(3, bean.getSalary());
			st.setString(4, bean.getPosition());
			st.setString(5, bean.getEmail());
			int record = st.executeUpdate();

			System.out.println(record + " book inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	
	public Employeebean getEmployee(int id) {
		Employeebean bean = new Employeebean();

		try {
			Connection con = Dbconnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employees where id=?");
			pstmt.setInt(1,id);
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				bean.setName(rs.getString("name"));
				bean.setSurname(rs.getString("surname"));
				bean.setSalary(rs.getInt("salary"));
				bean.setPosition(rs.getString("position"));
				bean.setEmail(rs.getString("email"));
				bean.setId(rs.getInt("id"));
				}
			
			System.out.print(bean.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;

		
	}
	public ArrayList<Employeebean> getAllEmployees() {
		ArrayList<Employeebean> list = new ArrayList();
		try {
			Connection con = Dbconnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employees");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employeebean bean = new Employeebean();
				bean.setName(rs.getString("name"));
				bean.setSurname(rs.getString("surname"));
				bean.setSalary(rs.getInt("salary"));
				bean.setPosition(rs.getString("position"));
				bean.setEmail(rs.getString("email"));
				bean.setId(rs.getInt("id"));
				list.add(bean);
			}
			System.out.print(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public void deleteEmployee(int projectId) {
		try {
			Connection con = Dbconnection.getConnection();
		
				PreparedStatement pstmt = con.prepareStatement("delete from employees where id = ? ");
						


			pstmt.setInt(1, projectId);
			int r = pstmt.executeUpdate();
			System.out.println(r + " record deleted....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void UpdateEmployee(Employeebean bean) {
	try {
		Connection con=Dbconnection.getConnection();
		PreparedStatement pstmt=con.prepareStatement("Update employees set name=?,surname=?,salary=?,email=?,position=? where id=?");
		pstmt.setString(1,bean.getName());
		pstmt.setString(2,bean.getSurname());
		pstmt.setInt(3,bean.getSalary());
		pstmt.setString(4,bean.getEmail());
		pstmt.setString(5,bean.getPosition());
		pstmt.setInt(6, bean.getId());
		pstmt.executeUpdate();
		
				
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}