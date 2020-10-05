import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("---SISTEMA GERENCIADOR DE PORTFÓLIO (SYSTEM-PROTOTYPE)---");

        System.out.print("\nName: ");
        String name = sc.nextLine();

        System.out.print("\nHeadline: ");
        String headline = sc.nextLine();

        System.out.print("\nAbout: ");
        String about = sc.nextLine();

        System.out.print("\nEducation:");
        System.out.print("\nSchool: ");
        String school = sc.nextLine();
        System.out.print("Degree: ");
        String degree = sc.nextLine();
        System.out.print("Field: ");
        String field = sc.nextLine();
        System.out.print("Year start: ");
        Integer yearStart = sc.nextInt();
        System.out.print("Year end: ");
        Integer yearEnd = sc.nextInt();

        Curriculum curriculum = new Curriculum(
                new Name(name),
                new Headline(headline),
                new About(about),
                new Education(school, degree, field, yearStart, yearEnd)
        );

        System.out.println("\n" + curriculum);

        sc.close();

    }

}
