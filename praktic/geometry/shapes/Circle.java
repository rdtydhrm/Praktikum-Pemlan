package geometry.shapes;

import geometry.interfaces.TwoDimensional;
import geometry.bases.CircularShape;

// Kelas Circle merepresentasikan lingkaran sebagai bentuk dua dimensi
// dan mengimplementasikan interface TwoDimensional.
public class Circle extends CircularShape implements TwoDimensional {

    // Konstruktor default, menginisialisasi nama lingkaran sebagai "2D Circle".
    public Circle() {
        setName("2D Circle");
    }
    
    // Konstruktor dengan parameter untuk mengatur jari-jari lingkaran.
    public Circle(double radius) {
        setRadius(radius);
        setName("Circle");
    }

    // Menghitung luas lingkaran menggunakan rumus πr².
    @Override
    public double getArea() {
        return (PI_NUMERATOR * getRadius() * getRadius()) / (double) PI_DENOMINATOR;
    }

    // Menghitung keliling lingkaran menggunakan rumus 2πr.
    @Override
    public double getPerimeter() {
        return (2 * PI_NUMERATOR * getRadius()) / (double) PI_DENOMINATOR;
    }

    // Menampilkan informasi tentang lingkaran, termasuk nama, luas, dan keliling.
    @Override
    public void printInfo() {
        this.setName("Circle");
        System.out.println("Name            : " + getName());
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}
