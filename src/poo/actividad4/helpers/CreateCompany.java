package poo.actividad4.helpers;

import poo.actividad4.modelos.Company;

import java.util.Scanner;

public class CreateCompany {
    public static Company createCompany() {

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
}
