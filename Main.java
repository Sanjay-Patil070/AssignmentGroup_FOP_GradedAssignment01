package driverMain;

import java.util.Scanner;

import adminDepartment.Admin_Department;
import hrDepartment.Hr_Department;
import techDepartment.Tech_Department;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter the Department Number from Below Choices\n"+"1.Admin Department\n"+"2.Hr Department\n"+"3.Tech Department\n"+"0.Exit");
		Scanner sc=new Scanner(System.in);
		int key;
		do {

			key=sc.nextInt();

			switch (key) {
			case 0:
				System.out.println("Exited successfully");
				break;
			case 1:
				Admin_Department obj1=new Admin_Department();
				System.out.println(obj1.departmentName());
				System.out.println(obj1.getTodaysWork());
				System.out.println(obj1.getWorkDeadline());
				System.out.println(obj1.isTodayAHoliday());

				break;

			case 2:
				Hr_Department obj2=new Hr_Department();
				System.out.println(obj2.departmentName());
				System.out.println(obj2.getTodaysWork());
				System.out.println(obj2.getWorkDeadline());
				System.out.println(obj2.doActivity());
				System.out.println(obj2.isTodayAHoliday());

				break;

			case 3:
				Tech_Department obj3=new Tech_Department();
				System.out.println(obj3.departmentName());
				System.out.println(obj3.getWorkDeadline());
				System.out.println(obj3.getTodaysWork());
				System.out.println(obj3.getTechStackInformation());
				System.out.println(obj3.isTodayAHoliday());

				break;

			default:
				System.out.println("Enter Valid Choices 1 to 3");
				break;
			}
		} while (key!=0);
		sc.close();
	}
}
