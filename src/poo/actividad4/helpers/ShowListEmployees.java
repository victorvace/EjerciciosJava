package poo.actividad4.helpers;

import poo.actividad4.modelos.Employee;

import java.util.ArrayList;

public class ShowListEmployees {
    public static void showList(ArrayList<Employee> listEmployees){
        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println((i + 1) + ".\t" + listEmployees.get(i).getName());
        }
    }
}
