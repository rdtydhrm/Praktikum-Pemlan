package praktic.inheritance.transportation;

// Subclass buat bus
public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000; // Tarif per halte

    // Konstruktor buat inisialisasi bus
    public Bus(String route) {
        super("Bus", 50, route, 0); // Set nama, kapasitas, rute, dan jumlah penumpang awal
    }

    // Metode buat hitung tarif bus berdasarkan jumlah halte
    public double calculateBusFare(int stops) {
        return stops * FARE_PER_STOP * currentPassengers; // Halte dikali tarif per halte dikali jumlah penumpang
    }
}