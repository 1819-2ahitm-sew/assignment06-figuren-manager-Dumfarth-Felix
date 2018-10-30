package figuresManager;
import figuresManager.Figure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure[] figures= new Figure[10];
        int count = 0;
        boolean end = false;
        int auswahl = 0;
        while (!end) {
            if (count != 10){
            System.out.println("Welche Figur soll berechnet werden (Zahl eingeben): ");
            System.out.println("1. Dreieck");
            System.out.println("2. Rechteck");
            System.out.println("3. Quadrat");
            System.out.println("4. Ellipse");
            System.out.println("5. Kreis");
            System.out.println("6. Programm Beenden");
            System.out.println("Es sind maximal 10 Berechnungen möglich, danach Programm Ende!!!");
            System.out.println("Ergebnisse werden nach Programm Ende augegeben!!");
            System.out.print("Auswahl: ");
            auswahl = scanner.nextInt();
            if (auswahl == 1) {
                figures[count] = new Triangle();
                System.out.print("Seite 1: ");
                figures[count].setA(scanner.nextInt());
                System.out.print("Seite 2: ");
                figures[count].setB(scanner.nextInt());
                System.out.print("eingeschlossener Winkel: ");
                figures[count].setAngle(scanner.nextInt());
            } else if (auswahl == 2) {
                figures[count] = new Rectangle();
                System.out.print("Länge: ");
                figures[count].setA(scanner.nextInt());
                System.out.print("Breite: ");
                figures[count].setB(scanner.nextInt());

            } else if (auswahl == 3) {
                figures[count] = new Square();
                System.out.print("Seite: ");
                figures[count].setA(scanner.nextInt());
            } else if (auswahl == 4) {
                figures[count] = new Ellipse();
                System.out.print("Hauptachse: ");
                figures[count].setA(scanner.nextInt());
                System.out.print("Nebenachse: ");
                figures[count].setB(scanner.nextInt());
            } else if (auswahl == 5) {
                figures[count] = new Circle();
                System.out.print("Radius: ");
                figures[count].setA(scanner.nextInt());
            } else if (auswahl == 6) {
                end = true;
            }}else {
                end = true;
            }
            System.out.println("");
            if (end){
            System.out.println("Datenanzeige:");
            System.out.println("-------------");
                for (int i = 0; i < count; i++) {
                    System.out.println(figures[i].output());
                }
            }
            count = count + 1;
            System.out.println("");

        }
    }
}
