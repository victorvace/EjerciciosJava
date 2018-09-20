package poo.actividad4.controlador;

import poo.actividad4.helpers.*;
import poo.actividad4.modelos.Company;
import poo.actividad4.modelos.Employee;
import poo.actividad4.vistas.ViewMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {
    public void menuSelector() {

        ViewMenu viewMenu = new ViewMenu();
        Scanner sc = new Scanner(System.in);
        int selector = 0;

        ArrayList<Company> listCompany = new  ArrayList<>();
        ArrayList<Employee> listEmployees = new  ArrayList<>();

        do {
            viewMenu.show();
            selector = sc.nextInt();
            // sc.nextLine();
            switch (selector) {
                case 1:
                    CreateCompany createCompany = new CreateCompany();
                    Company company = createCompany.createCompany();
                    listCompany.add(company);
                    break;
                case 2:
                    AddEmployee addEmployee = new AddEmployee();
                    addEmployee.addingEmployee(listCompany, listEmployees);
                    break;
                case 3:
                    ShowListCompany showListCompany = new ShowListCompany();
                    showListCompany.showList(listCompany);
                    break;
                case 4:
                    CompanyInfo companyInfo = new CompanyInfo();
                    companyInfo.showInfo(listCompany);
                    break;
                case 5:
                    CreateEmployee createEmployee = new CreateEmployee();
                    listEmployees.add(createEmployee.createEmployee());
                    break;
                case 6:
                    ShowListEmployees showListEmployees = new ShowListEmployees();
                    showListEmployees.showList(listEmployees);
                    break;
                case 7:
                    EmployeeInfo employeeInfo = new EmployeeInfo();
                    employeeInfo.showInfo(listEmployees);
                    break;
                case 8:
                    sc.close();
                    break;
                default:
                    break;
            }

        } while (selector != 8);

    }
}
