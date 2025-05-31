package models;

// Mengimpor kelas induk dan interface yang diperlukan
import bases.Shape;
import interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    // Variabel untuk menyimpan nilai radius bola
    private double radius;

    // Konstruktor untuk inisialisasi radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Menghitung volume bola
    @Override
    public double getVolume() {
        return (4.0 / 3) * PI * radius * radius * radius;
    }

    // Menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    // Menghitung massa bola berdasarkan luas permukaan, ketebalan, dan densitas
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    // Mengonversi massa dari gram ke kilogram
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // Menghitung biaya kirim berdasarkan massa dalam kilogram
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // Menampilkan informasi hasil perhitungan
    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f%n", getSurfaceArea());
        System.out.printf("Massa           : %.2f%n", getMass());
        System.out.printf("Massa dalam kg  : %.2f%n", gramToKilogram());
        System.out.printf("Biaya kirim     : Rp.%.0f%n", calculateCost());
    }
}
