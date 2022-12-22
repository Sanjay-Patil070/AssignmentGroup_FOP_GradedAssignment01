package hrDepartment;

import superDepartment.Super_Department;

public class Hr_Department extends Super_Department{
	public String departmentName() {
		return "Welcome to Hr Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "Team Lunch ";
	}
}
