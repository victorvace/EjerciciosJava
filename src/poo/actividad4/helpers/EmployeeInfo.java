package poo.actividad4.helpers;

import poo.actividad4.modelos.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInfo {
    public static void showInfo(ArrayList<Employee> listEmployee){
        System.out.println("Selecciona un empleado:");
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println((i + 1) + ". " + listEmployee.get(i).getName());
        }
        Scanner sc = new Scanner(System.in);
        int idEmployee = (sc.nextInt() - 1);
        System.out.println(listEmployee.get(idEmployee).toString());
    }
}
