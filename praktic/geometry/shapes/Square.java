package geometry.shapes;

import geometry.interfaces.TwoDimensional;
import geometry.bases.Shape;

// Kelas Square merepresentasikan persegi sebagai bentuk dua dimensi
// dan mengimplementasikan interface TwoDimensional.
public class Square extends Shape implements TwoDimensional {
    private double side; // Panjang sisi persegi

    // Konstruktor default, menginisialisasi nama persegi sebagai "2D Square".
    public Square() {
        setName("2D Square");
    }
    
    // Konstruktor dengan parameter untuk mengatur panjang sisi persegi.
    public Square(double side) {
        this.side = side;
        setName("Square");
    }

    // Menghitung luas persegi (sisi * sisi).
    @Override
    public double getArea() {
        return side * side;
    }

    // Menghitung keliling persegi (4 * sisi).
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Menampilkan informasi tentang persegi, termasuk nama, luas, dan keliling.
    @Override
    public void printInfo() {
        this.setName("Square");
        System.out.println("Name            : " + getName());
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}
