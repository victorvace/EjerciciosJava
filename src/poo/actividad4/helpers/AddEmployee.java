package poo.actividad4.helpers;

import poo.actividad4.modelos.Company;
import poo.actividad4.modelos.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class AddEmployee {
    public static void addingEmployee(ArrayList<Company> listCompany, ArrayList<Employee> listEmployee) {

        ArrayList<Employee> tempListEmployees;

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona un empleado:");
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println((i + 1) + ". " + listEmployee.get(i).getName());
        }
        int idEmployee = (sc.nextInt() - 1);

        System.out.println("Selecciona una empresa:");
        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println((i + 1) + ".\t" + listCompany.get(i).getName());
        }
        int idCompany = (sc.nextInt() - 1);

        tempListEmployees = listCompany.get(idCompany).getEmployees();
        Employee user = listEmployee.get(idEmployee);
        tempListEmployees.add(user);
        listCompany.get(idCompany).setEmployees(tempListEmployees);

    }

}
