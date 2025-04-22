package geometry.shapes;

import geometry.interfaces.ThreeDimensional;
import geometry.bases.Shape;
import geometry.interfaces.Weightable;

// Kelas Cube merepresentasikan kubus sebagai bentuk tiga dimensi
// dan mengimplementasikan interface ThreeDimensional dan Weightable.
public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge; // Panjang sisi kubus
    private double mass; // Massa kubus

    // Konstruktor default, menginisialisasi nama kubus sebagai "3D Weightable Cube".
    public Cube() {
        setName("3D Weightable Cube");
    }
    
    // Konstruktor dengan parameter untuk mengatur panjang sisi dan massa kubus.
    public Cube(double edge, double mass) {
        this.edge = edge;
        this.mass = mass;
        setName("Cube");
    }

    // Menghitung luas permukaan kubus menggunakan rumus 6 * sisi².
    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // Menghitung volume kubus menggunakan rumus sisi³.
    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    // Menghitung berat kubus menggunakan rumus massa * gravitasi.
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Menampilkan informasi tentang kubus, termasuk nama, luas permukaan, volume, dan berat.
    @Override
    public void printInfo() {
        this.setName("Cube");
        System.out.println("Name            : " + getName());
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
    }
}
