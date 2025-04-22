package geometry.bases;

// Kelas abstrak CircularShape mendefinisikan atribut dasar untuk bentuk lingkaran.
public abstract class CircularShape extends Shape {
    private double radius; // Jari-jari lingkaran
    protected final int PI_NUMERATOR = 22; // Pembilang nilai π
    protected final int PI_DENOMINATOR = 7; // Penyebut nilai π

    public CircularShape() {}

    // Mengatur jari-jari lingkaran
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // Mengambil jari-jari lingkaran
    public double getRadius() {
        return this.radius;
    }
}