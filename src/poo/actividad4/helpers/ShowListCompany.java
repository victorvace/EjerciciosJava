package poo.actividad4.helpers;

import poo.actividad4.modelos.Company;

import java.util.ArrayList;

public class ShowListCompany {
    public static void showList(ArrayList<Company> listCompany){
        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println((i + 1) + ".\t" + listCompany.get(i).getName());
        }
    }

}
