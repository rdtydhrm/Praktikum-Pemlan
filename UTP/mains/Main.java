// Gede Raditya Dharma Putra Ayudia - 245150700111028
// __ \  |                                
// |   | __ \   _` |  __| __ `__ \   _` | 
// |   | | | | (   | |    |   |   | (   | 
// ____/ _| |_|\__,_|_|   _|  _|  _|\__,_| 

package UTP.mains;

import java.util.Scanner;
import UTP.shapes.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("GEDE RADITYA DHARMA PUTRA AYUDIA");
        System.out.println("245150700111028");
        System.out.println("=============================================");

        // Prisma
        System.out.println("\nPrisma Segitiga Sama Kaki");
        System.out.print("Isikan alas : ");
        double alas = sc.nextDouble();
        System.out.print("Isikan kaki : ");
        double kaki = sc.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiPrisma = sc.nextDouble();
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        prisma.printInfo();

        // Limas
        System.out.println("\n=============================================");
        System.out.println("Limas Persegi");
        System.out.print("Isikan sisi : ");
        double sisi = sc.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiLimas = sc.nextDouble();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        limas.printInfo();

        // Tabung
        System.out.println("\n=============================================");
        System.out.println("Tabung");
        System.out.print("Isikan radius : ");
        double radius = sc.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiTabung = sc.nextDouble();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        tabung.printInfo();

        System.out.println("\n=============================================");
    }
}
