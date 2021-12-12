package com.nasir.hello;

public class SuperDepartment {
	//class SuperDepartment() {  
		void departmentName() {System.out.println("Super Department...");}  
		void getTodaysWork(){ System.out.println("getTodaysWork."); }
		void getWorkDeadline(){ System.out.println("getWorkDeadline."); }
		void isTodayAHoliday() { System.out.println("isTodayAHoliday"); }

class AdminDepartment extends SuperDepartment {  
		void departmentName(){System.out.println("Welcome to Admin Department...");}  
		void getTodaysWork1() { System.out.println("Complete your documents Submission."); }
		void getWorkDeadline1() { System.out.println("Complete by EOD."); }
}
class HrDepartment extends SuperDepartment {  
		void departmentNamehr() { System.out.println("Welcome to Hr Department."); }
		void getTodaysWorkhr() { System.out.println("Fill today’s timesheet and mark your attendance"); }
		void getWorkDeadlinehr() { System.out.println("Complete by EOD."); }
		void doActivityhr() { System.out.println("team Lunch."); }
		}
class TechDepartment extends SuperDepartment {
		void departmentName() { System.out.println("Welcome toTech Department."); }
		void getTodaysWork() { System.out.println("Complete coding of module 1"); }
		void getWorkDeadline() { System.out.println("Complete by EOD."); }
		void doActivity() { System.out.println("core Java."); }
}
}

		  


