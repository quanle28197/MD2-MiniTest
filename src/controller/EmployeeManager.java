package controller;

import model.Employee;
import storage.IEployeeData;

import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManager {
    public static IEployeeData emloyeeData = new EmployeeFromFileBinary();
    public static ArrayList<Employee> employeeList = emloyeeData.readFile();

    public static void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        try {
            emloyeeData.writeFile(employeeList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getEmployeeById(String employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.getEmployeeID().equals(employeeId)) {
                return i;
            }
        }
        return -1;
    }

    public static void editEmployeeByIndex(int index, Employee employee) {
        employeeList.set(index, employee);
        try {
            emloyeeData.writeFile(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
