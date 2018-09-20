package poo.actividad4.helpers;

import poo.actividad4.modelos.Company;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyInfo {
    public static void showInfo(ArrayList<Company> listCompany){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una empresa:");
        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println((i + 1) + ".\t" + listCompany.get(i).getName());
        }
        int numberId = (sc.nextInt() - 1);
        System.out.println(listCompany.get(numberId).toString());

    }
}
