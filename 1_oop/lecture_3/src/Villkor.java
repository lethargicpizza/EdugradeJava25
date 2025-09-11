import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Villkor {
    public static void main(String[] args) {

        // Uppgift 1.1
        int tal = 1;

        if (tal % 2 == 0) {
            System.out.println("Talet är jämnt");
        } else {
            System.out.println("Talet är udda");
        }

        System.out.println("-------");

       // Uppgift 1.2
        Scanner sc = new Scanner(System.in);
        System.out.println("Ge mig ett tal: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Minderårig");
        } else if (age >= 18 && age < 65) {
            System.out.println("Vuxen");
        } else  {
            System.out.println("Senior");
        }

        System.out.println("-------");

        // Uppgift 1.3
        int a = 50, b = 20, c = 65;

        if (a >= b && a >= c) {
            System.out.println("a är störst");
        }else if (b >= a && b >= c) {
            System.out.println("b är störst");
        }
        else {
            System.out.println("c är störst");
        }

        System.out.println("-------");

        // Uppgift 2.2
        int score = 2;

        switch (score) {
            case 0: System.out.println("Betyg: F"); break;
            case 1: System.out.println("Betyg: E"); break;
            case 2: System.out.println("Betyg: D"); break;
            case 3: System.out.println("Betyg: C"); break;
            case 4: System.out.println("Betyg: B"); break;
            case 5: System.out.println("Betyg: A"); break;
        }

        System.out.println("-------");

        // Uppgift 2.2
        String måltid = "middag";

        switch (måltid) {
            case "frukost":
                System.out.println("Cafe complet med äggröra och cava");
                break;
            case "lunch":
                System.out.println("Varm tonfisksmörgås med sallad");
                break;
            case "middag":
                System.out.println("Entrecote med klyftpotatis");
                break;
        }
    }
}