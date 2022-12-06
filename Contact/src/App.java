import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import model.Contact;

public class App {
    public static void main(String[] args) throws Exception {

        afficherMenu();
        Scanner scan = new Scanner(System.in);
        String choix = scan.nextLine();
        while (true) {
            switch (choix) {
                case "1":
                    ajouterContact();
                    break;
                case "2":
                    break;
                case "q":
                    return;
                default:
                    System.out.println("Boulet!!!!");
                    break;
            }
            afficherMenu();
            choix = scan.nextLine();
        }

    }

    private static void ajouterContact() {
        Scanner scan = new Scanner(System.in);
        Contact c = new Contact();
        System.out.println("Saisir le nom:");
        c.setNom(scan.nextLine());
        System.out.println("Saisir le prénom:");
        c.setPrenom(scan.nextLine());
        System.out.println("Saisir le téléphone:");
        c.setNumero(scan.nextLine());
        System.out.println("Saisir le mail:");
        c.setMail(scan.nextLine());

        SimpleDateFormat dtf = new SimpleDateFormat();
        do {
            try {
                System.out.println("Saisir la date de naissance:");
                c.setDateNaissance(dtf.parse(scan.nextLine()));
                break;
            } catch (ParseException e) {
                System.out.println("Error, try again!");
            }
        } while (true);

        System.out.println(c.toString());

        c.enregistrer();
    }

    public static void afficherMenu() {
        // 1
        /*
         * System.out.println("-- MENU --");
         * System.out.println("1- Ajouter un contact");
         * System.out.println("2- Lister les contacts");
         * System.out.println("q- Quitter");
         */
        // 2
        ArrayList<String> menus = new ArrayList<>();
        menus.add("-- MENU --");
        menus.add("1- Ajouter un contact");
        menus.add("2- Lister les contacts");
        menus.add("q- Quitter");
        for (String s : menus) {
            System.out.println(s);
        }
    }
}
