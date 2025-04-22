package geometry.shapes;

import geometry.interfaces.ThreeDimensional;
import geometry.interfaces.Weightable;
import geometry.bases.CircularShape;

// Kelas Sphere merepresentasikan bola sebagai bentuk tiga dimensi
// dan mengimplementasikan interface ThreeDimensional dan Weightable.
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass; // Massa bola

    // Konstruktor default, menginisialisasi nama bola sebagai "3D Weightable Sphere".
    public Sphere() {
        setName("3D Weigthable Sphere");
    }
    
    // Konstruktor dengan parameter untuk mengatur jari-jari dan massa bola.
    public Sphere(double radius, double mass) {
        setRadius(radius);
        this.mass = mass;
        setName("Sphere");
    }

    // Menghitung luas permukaan bola menggunakan rumus 4πr².
    @Override
    public double getSurfaceArea() {
        return (4 * PI_NUMERATOR * getRadius() * getRadius()) / (double) PI_DENOMINATOR;
    }

    // Menghitung volume bola menggunakan rumus 4/3πr³.
    @Override
    public double getVolume() {
        return (4 * PI_NUMERATOR * getRadius() * getRadius() * getRadius()) / (3.0 * PI_DENOMINATOR);
    }

    // Menghitung berat bola menggunakan rumus massa * gravitasi.
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Menampilkan informasi tentang bola, termasuk nama, luas permukaan, volume, dan berat.
    @Override
    public void printInfo() {
        this.setName("Sphere");
        System.out.println("Nama            : " + getName());
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
    }
}
