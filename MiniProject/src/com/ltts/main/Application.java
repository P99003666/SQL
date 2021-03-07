package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

//List<Employee> ls = empDao.getEmployees();
//for (Employee allEmp : ls) {
//	System.out.println(allEmp);
//}
import com.ltts.dao.PlayerDaoImplementation;
import com.ltts.model.Player;

public class Application {

	public static void main(String[] args) throws SQLException, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String empName, empAddress;
		String continueKey;
		int empId;
		int updateField;
		Player emp = new Player();

		PlayerDaoImplementation empDao = new PlayerDaoImplementation();


		do {
			System.out.println("Select One Option from Below Menu \n");
			System.out.println("1: Insert Data");
			System.out.println("2: Get Data");
			System.out.println("3: Update Data");
			System.out.println("4: Delete Data");
			int choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter Employee Name \n");
				empName = br.readLine();
				System.out.println("Enter Employee Addess \n");
				empAddress = br.readLine();
				emp.setPlayer_name(empName);
				emp.setPlayer_address(empAddress);
				empDao.add(emp);
				System.out.println("Data Added Successfully");
				break;
			case 2:
				System.out.println("Enter Id to be searched \n");
				empId = Integer.parseInt(br.readLine());
				System.out.println("Data Fetched");
				Player e = empDao.getPlayer(empId);
				System.out.println(e.getPlayer_id() + " " + e.getPlayer_name() + " " + e.getPlayer_address());
				break;
			case 3:
				System.out.println("Enter Employee Id");
				empId = Integer.parseInt(br.readLine());
				System.out.println("Enter Field to be updated \n");
				System.out.println("Enter 1 for Name updation \n");
				System.out.println("Enter 2 for address updation \n");
				updateField = Integer.parseInt(br.readLine());
				if (updateField == 1) {
					System.out.println("Enter Emp Name");
					empName = br.readLine();
					Player tempEmployee = empDao.getPlayer(empId);
					tempEmployee.setPlayer_name(empName);
					empDao.update(tempEmployee);

				} else {
					System.out.println("Enter Emp Address");
					empAddress = br.readLine();
					Player tempEmployee = empDao.getPlayer(empId);
					tempEmployee.setPlayer_address(empAddress);
					empDao.update(tempEmployee);
				}
				break;
			case 4:
				System.out.println("Enter Id to delete \n");
				empId = Integer.parseInt(br.readLine());
				empDao.delete(empId);
				System.out.println("Deleted Successfully");
				break;
			default:
				System.out.println("Entered Wrong Input");
				break;
			}
			System.out.println("Enter Y to Continue \n");

			continueKey = br.readLine();

			if (continueKey.equals('Y')) {
				System.out.println("Selected To Continue \n");
			}
		} while (continueKey.equals('Y'));
		System.out.println("Exited ");

	}
}
