package com.nasir.hello;
import com.nasir.hello.AdminDepartment;
import com.nasir.hello.HrDepartment;
import com.nasir.hello.SuperDepartment;
import com.nasir.hello.TechDepartment;

public class Main {
	public static void main(String args[]){  
			//new HrDepartment(); 
			//SuperDepartment c1=new SuperDepartment();
			//c1.departmentName();
			//c1.isTodayAHoliday();
		AdminDepartment a=new AdminDepartment();
		a.departmentName();
		a.getTodaysWork1();
		a.getWorkDeadline1();
		a.isTodayAHoliday();
		System.out.println("-----------");
		
		HrDepartment b =new HrDepartment();
		b.departmentNamehr();
		b.getTodaysWorkhr();
		b.getWorkDeadlinehr();
		b.doActivityhr();
		a.isTodayAHoliday();
		System.out.println("-----------");
		
		TechDepartment d =new TechDepartment();
		d.departmentName();
		d.getTodaysWork();
		d.getWorkDeadline();
		d.getTechStackInformation();
		d.isTodayAHoliday();
		
		System.out.println("-----------");
		}
	}



