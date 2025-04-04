package praktic.inheritance.transportation;

// Subclass buat taksi
public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000; // Tarif per kilometer

    // Konstruktor buat inisialisasi taksi
    public Taxi(String route) {
        super("Taksi", 4, route, 0); // Set nama, kapasitas, rute, dan jumlah penumpang awal
    }

    // Metode buat hitung tarif taksi berdasarkan jarak
    public double calculateTaxiFare(int km) {
        return km * FARE_PER_KM; // Jarak dikali tarif per kilometer
    }
}