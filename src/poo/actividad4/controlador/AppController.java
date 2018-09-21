package poo.actividad4.controlador;

import poo.actividad4.modelos.Company;
import poo.actividad4.modelos.Employee;
import poo.actividad4.vistas.ViewMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    public void menuSelector() {

        ViewMenu viewMenu = new ViewMenu();
        Scanner sc = new Scanner(System.in);
        int selector;

        ArrayList<Company> listCompany = new ArrayList<>();
        ArrayList<Employee> listEmployees = new ArrayList<>();

        CompanyController companyController = new CompanyController();
        EmployeeController employeeController = new EmployeeController();

        do {
            viewMenu.show();
            selector = sc.nextInt();
            switch (selector) {
                case 1:
                    Company company = companyController.createCompany();
                    listCompany.add(company);
                    break;
                case 2:
                    companyController.addingEmployee(listCompany, listEmployees);
                    break;
                case 3:
                    companyController.showList(listCompany);
                    break;
                case 4:
                    companyController.showInfo(listCompany);
                    break;
                case 5:
                    listEmployees.add(employeeController.createEmployee());
                    break;
                case 6:
                    employeeController.showList(listEmployees);
                    break;
                case 7:
                    employeeController.showInfo(listEmployees);
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
