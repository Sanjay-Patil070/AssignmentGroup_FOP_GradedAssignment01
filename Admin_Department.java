package adminDepartment;

import superDepartment.Super_Department;

public class Admin_Department extends Super_Department{

	public String departmentName() {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
