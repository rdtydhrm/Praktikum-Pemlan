package praktic.inheritance.transportation;

// Kelas induk untuk transportasi
public class Vehicle {
    // Atribut dasar buat semua kendaraan
    protected String name; // Nama kendaraan
    protected int capacity; // Kapasitas maksimal penumpang
    protected int currentPassengers; // Jumlah penumpang saat ini
    protected String route; // Rute kendaraan

    // Konstruktor buat inisialisasi kendaraan
    public Vehicle(String name, int capacity, String route, int currentPassengers) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = currentPassengers;
    }

    // Metode buat mulai perjalanan
    public void startTrip() {
        System.out.println(name + " memulai perjalanan pada rute " + route);
    }

    // Metode buat berhenti perjalanan
    public void stopTrip() {
        System.out.println(name + " telah mencapai tujuan dan berhenti.");
    }

    // Metode buat nambahin penumpang
    public void addPassenger(int count) {
        // Cek apakah kapasitas cukup
        if (currentPassengers + count <= capacity) {
            currentPassengers += count;
            System.out.println(count + " penumpang naik. Jumlah penumpang saat ini: " + currentPassengers);
        } else {
            System.out.println("Tidak bisa menambahkan penumpang, kapasitas penuh!");
        }
    }

    // Metode buat nurunin penumpang
    public void removePassenger(int count) {
        // Cek apakah jumlah penumpang tidak negatif
        if (currentPassengers - count >= 0) {
            currentPassengers -= count;
            System.out.println(count + " penumpang turun. Jumlah penumpang saat ini: " + currentPassengers);
        } else {
            System.out.println("Jumlah penumpang tidak bisa negatif!");
        }
    }
}
