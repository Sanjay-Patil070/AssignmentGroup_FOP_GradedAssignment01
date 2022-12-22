package techDepartment;

import superDepartment.Super_Department;

public class Tech_Department extends Super_Department{
	public String departmentName() {
		return "Welcome to Tech Department";
	}
	public String getWorkDeadline() {
		return "Complete coding of module 1";
	}
	public String getTodaysWork() {
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "core Java";
	}
}
