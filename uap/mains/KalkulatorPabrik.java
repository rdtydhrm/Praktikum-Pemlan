package mains;

// Import Scanner untuk input dari user
import java.util.Scanner;
// Import kelas Torus dan Sphere dari package models
import models.Torus;
import models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // Menampilkan header aplikasi
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Gede Raditya Dharma Putra Ayudia");
        System.out.println("245150700111028");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        // Meminta input radius besar (R) dari user
        System.out.print("Isikan Radius   : ");
        double R = scanner.nextDouble(); 
        // Meminta input radius kecil (r) dari user
        System.out.print("Isikan radius   : ");
        double r = scanner.nextDouble(); 

        // Membuat objek Torus dengan parameter R dan r
        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        // Menampilkan informasi hasil perhitungan Torus
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        // Meminta input radius untuk Sphere
        System.out.print("Isikan radius   : ");
        double radius = scanner.nextDouble(); 

        // Membuat objek Sphere dengan parameter radius
        Sphere sphere = new Sphere(radius);
        System.out.println("=============================================");
        // Menampilkan informasi hasil perhitungan Sphere
        sphere.printInfo();
        System.out.println("=============================================");

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
