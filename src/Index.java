import entities.About;
import entities.Curriculum;
import entities.Headline;
import entities.Name;

import java.util.Locale;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("---SISTEMA GERENCIADOR DE PORTFÓLIO (SYSTEM-PROTOTYPE)---");

        System.out.print("\nName: ");
        String name = sc.nextLine();

        System.out.print("Headline: ");
        String headline = sc.nextLine();

        System.out.print("About: ");
        String about = sc.nextLine();

        Curriculum curriculum = new Curriculum(
                new Name(name),
                new Headline(headline),
                new About(about)
        );

        System.out.println("\n" + curriculum);

        sc.close();

    }

}
