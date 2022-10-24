package pl.zadanko_czworokat;

import java.util.*;


public class Main {
    public static void main(String args[]) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("podaj dwa boki:");
        System.out.println("bok pierwszy");
        double boka= scanner.nextDouble();
        System.out.println("bok drugi");
        double bokb= scanner.nextDouble();

        Kwadrat kwadracik = new Kwadrat(boka);
        Prostokat prostokacik = new Prostokat(boka, bokb);
        System.out.println("pole kwadratu");
        System.out.println(kwadracik.pole());
        System.out.println("pole prostokatu");
        System.out.println(prostokacik.pole());



        }

    }