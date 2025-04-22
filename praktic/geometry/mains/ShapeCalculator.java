package geometry.mains;

// GEDE RADITYA DHARMA PUTRA AYUDIA
// 245150700111028                                                                                                                                                                                                                          
// DDDDDDDDDDDDD      HHHHHHHHH     HHHHHHHHH               AAA               RRRRRRRRRRRRRRRRR   MMMMMMMM               MMMMMMMM               AAA               
// D::::::::::::DDD   H:::::::H     H:::::::H              A:::A              R::::::::::::::::R  M:::::::M             M:::::::M              A:::A              
// D:::::::::::::::DD H:::::::H     H:::::::H             A:::::A             R::::::RRRRRR:::::R M::::::::M           M::::::::M             A:::::A             
// DDD:::::DDDDD:::::DHH::::::H     H::::::HH            A:::::::A            RR:::::R     R:::::RM:::::::::M         M:::::::::M            A:::::::A            
//   D:::::D    D:::::D H:::::H     H:::::H             A:::::::::A             R::::R     R:::::RM::::::::::M       M::::::::::M           A:::::::::A           
//   D:::::D     D:::::DH:::::H     H:::::H            A:::::A:::::A            R::::R     R:::::RM:::::::::::M     M:::::::::::M          A:::::A:::::A          
//   D:::::D     D:::::DH::::::HHHHH::::::H           A:::::A A:::::A           R::::RRRRRR:::::R M:::::::M::::M   M::::M:::::::M         A:::::A A:::::A         
//   D:::::D     D:::::DH:::::::::::::::::H          A:::::A   A:::::A          R:::::::::::::RR  M::::::M M::::M M::::M M::::::M        A:::::A   A:::::A        
//   D:::::D     D:::::DH:::::::::::::::::H         A:::::A     A:::::A         R::::RRRRRR:::::R M::::::M  M::::M::::M  M::::::M       A:::::A     A:::::A       
//   D:::::D     D:::::DH::::::HHHHH::::::H        A:::::AAAAAAAAA:::::A        R::::R     R:::::RM::::::M   M:::::::M   M::::::M      A:::::AAAAAAAAA:::::A      
//   D:::::D     D:::::DH:::::H     H:::::H       A:::::::::::::::::::::A       R::::R     R:::::RM::::::M    M:::::M    M::::::M     A:::::::::::::::::::::A     
//   D:::::D    D:::::D H:::::H     H:::::H      A:::::AAAAAAAAAAAAA:::::A      R::::R     R:::::RM::::::M     MMMMM     M::::::M    A:::::AAAAAAAAAAAAA:::::A    
// DDD:::::DDDDD:::::DHH::::::H     H::::::HH   A:::::A             A:::::A   RR:::::R     R:::::RM::::::M               M::::::M   A:::::A             A:::::A   
// D:::::::::::::::DD H:::::::H     H:::::::H  A:::::A               A:::::A  R::::::R     R:::::RM::::::M               M::::::M  A:::::A               A:::::A  
// D::::::::::::DDD   H:::::::H     H:::::::H A:::::A                 A:::::A R::::::R     R:::::RM::::::M               M::::::M A:::::A                 A:::::A 
// DDDDDDDDDDDDD      HHHHHHHHH     HHHHHHHHHAAAAAAA                   AAAAAAARRRRRRRR     RRRRRRRMMMMMMMM               MMMMMMMMAAAAAAA                   AAAAAAA

import java.util.Scanner;
import geometry.bases.*;
import geometry.shapes.*;
import geometry.interfaces.*;

// Kelas utama untuk menjalankan kalkulator bentuk geometris.
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan informasi pembuka
        System.out.println("======================================");
        System.out.println("Shape Calculator");
        System.out.println("GEDE RADITYA DHARMA PUTRA AYUDIA");
        System.out.println("245150700111028");

        // ---------------- Circle ----------------
        // Membuat objek lingkaran default dan menampilkan informasi
        Shape defaultCircle = new Circle(); // Constructor tanpa parameter

        System.out.println("\u001B[32m======================================");
        System.out.println(defaultCircle.getName());
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double r1 = input.nextDouble();
        CircularShape circle = new Circle(r1); // Constructor dengan parameter
        System.out.println("======================================\u001B[0m");
        circle.printInfo();

        // ---------------- Square ----------------
        // Membuat objek persegi default dan menampilkan informasi
        Shape defaultSquare = new Square(); // Constructor tanpa parameter

        System.out.println("\u001B[33m======================================");
        System.out.println(defaultSquare.getName());
        System.out.println("======================================");
        System.out.print("Enter side      : ");
        double side = input.nextDouble();
        Square square = new Square(side); // Constructor dengan parameter
        System.out.println("======================================\u001B[0m");
        square.printInfo();

        // ---------------- Cube ----------------
        // Membuat objek kubus default dan menampilkan informasi
        Shape defaultCube = new Cube(); // Constructor tanpa parameter

        System.out.println("\u001B[34m======================================");
        System.out.println(defaultCube.getName());
        System.out.println("======================================");
        System.out.print("Enter edge      : ");
        double edge = input.nextDouble();
        System.out.print("Enter mass      : ");
        double massCube = input.nextDouble();
        Cube cube = new Cube(edge, massCube); // Constructor dengan parameter
        System.out.println("======================================\u001B[0m");
        cube.printInfo();

        // ---------------- Sphere ----------------
        // Membuat objek bola default dan menampilkan informasi
        Shape defaultSphere = new Sphere(); // Constructor tanpa parameter

        System.out.println("\u001B[35m======================================");
        System.out.println(defaultSphere.getName());
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double r2 = input.nextDouble();
        System.out.print("Enter mass      : ");
        double massSphere = input.nextDouble();
        Sphere sphere = new Sphere(r2, massSphere); // Constructor dengan parameter
        System.out.println("======================================\u001B[0m");
        sphere.printInfo();

        // ---------------- Polymorphism & Interface ----------------
        // Menunjukkan penggunaan polimorfisme dengan interface
        System.out.println("\u001B[36m======================================");
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println("======================================");

        System.out.print("Enter edge      : ");
        double edge2 = input.nextDouble();
        System.out.print("Enter radius    : ");
        double radius2 = input.nextDouble();
        System.out.print("Enter mass      : ");
        double mass2 = input.nextDouble();

        ThreeDimensional cubePoly = new Cube(edge2, mass2);
        ThreeDimensional spherePoly = new Sphere(radius2, mass2);
        Weightable weightablePoly = new Sphere(radius2, mass2);

        System.out.println("======================================");
        System.out.println("Cube's volume   : " + cubePoly.getVolume());
        System.out.println("Sphere's volume : " + spherePoly.getVolume());
        System.out.println("Weight          : " + weightablePoly.getWeight());
        System.out.println("======================================\u001B[0m");

        input.close(); // Menutup scanner
    }
}
