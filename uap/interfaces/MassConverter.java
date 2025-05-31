package interfaces;

// Interface untuk konversi massa dari gram ke kilogram
public interface MassConverter {
    // Konstanta pembagi untuk konversi gram ke kilogram
    int DENOMINATOR = 1000;
    // Method untuk konversi massa
    double gramToKilogram();
}
