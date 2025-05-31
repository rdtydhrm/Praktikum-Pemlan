package interfaces;

// Interface untuk perhitungan massa
public interface MassCalculable {
    // Densitas material
    int DENSITY = 8;
    // Ketebalan material
    double THICKNESS = 0.5;
    // Method untuk menghitung massa
    double getMass();
}
