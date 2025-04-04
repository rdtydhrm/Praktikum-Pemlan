package praktic.inheritance.transportation;

// Subclass buat kereta
public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000; // Tarif tetap per penumpang

    // Konstruktor buat inisialisasi kereta
    public Train(String route) {
        super("Kereta", 200, route, 0); // Set nama, kapasitas, rute, dan jumlah penumpang awal
    }

    // Metode buat hitung tarif total kereta
    public double calculateTrainFare() {
        return FIXED_FARE * currentPassengers; // Tarif tetap dikali jumlah penumpang
    }
}