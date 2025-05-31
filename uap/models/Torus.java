package models;

// Mengimpor kelas induk dan interface yang diperlukan
import bases.Shape;
import interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    // Variabel untuk menyimpan radius besar (major) dan kecil (minor)
    private double majorRadius;
    private double minorRadius;

    // Konstruktor untuk inisialisasi majorRadius dan minorRadius
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // Menghitung volume torus
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    // Menghitung luas permukaan torus
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    // Menghitung massa torus berdasarkan luas permukaan, ketebalan, dan densitas
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
