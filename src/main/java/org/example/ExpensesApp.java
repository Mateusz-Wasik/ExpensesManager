package org.example;

import java.util.Scanner;

public class ExpensesApp {
    public void start(){
        Scanner scanner=new Scanner(System.in);
        while (true) {

            System.out.println("1. Wyswietl wszystkie wydatki");
            System.out.println("2. Wyswietl wydatki z wybranego miesiąca");
            System.out.println("3. Dodaj wydatek");
            System.out.println("4. Zakończ aplikacje");
            System.out.println("Wybierz opcje(1-4):");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1 -> System.out.println("wyswietl wydatki");
                case 2-> System.out.println("wydatki z danego miesiąca");
                case 3 -> System.out.println("dodaj wydatek");
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
