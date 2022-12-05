import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        afficherMenu();
        Scanner scan = new Scanner(System.in);
        String choix = scan.nextLine();
        while (true) {
            switch (choix) {
                case "1":
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
