package poo.actividad4.controlador;

import poo.actividad4.modelos.Company;
import poo.actividad4.modelos.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyController {
    public void addingEmployee(ArrayList<Company> listCompany, ArrayList<Employee> listEmployee) {

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

    public Company createCompany() {

        Company company = new Company();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la compañia nueva: ");
        String name = sc.nextLine();
        company.setName(name);
        System.out.println("Año de fundación de la compañia: ");
        String year = sc.nextLine();
        company.setFoundationYear(year);
        return company;

    }

    public void showInfo(ArrayList<Company> listCompany) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una empresa:");
        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println((i + 1) + ".\t" + listCompany.get(i).getName());
        }
        int numberId = (sc.nextInt() - 1);
        System.out.println(listCompany.get(numberId).toString());

    }

    public void showList(ArrayList<Company> listCompany) {

        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println((i + 1) + ".\t" + listCompany.get(i).getName());
        }

    }
}
