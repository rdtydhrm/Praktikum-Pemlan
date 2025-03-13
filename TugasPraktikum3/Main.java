package TugasPraktikum3;

import java.util.Scanner;

public class Main {
   static String WHITE = "\u001B[0m";
    static String GREEN = "\u001B[32m";
   static  String YELLOW = "\u001B[33m";
    static String BLUE = "\u001B[94m";

    static void printGaris(){
        System.out.println("=========================");
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        printGaris();
        System.out.println("Nama; GEde RAditya Dharma Putra Ayudia");
        System.out.println("NIm: 245150700111028");
        printGaris();
        System.out.println("Circle");
        printGaris();

        System.out.println(BLUE + "Masukkan id: " + WHITE);
        shape.setId(sc.nextInt());
        System.out.println(GREEN + "Masukkan Radius: " + WHITE);
        shape.setRad(sc.nextDouble());
        printGaris();
        shape.printInfoShape();

    }


}



