package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Train;
import praktic.inheritance.transportation.Taxi;

public class Main {
    public static void main(String[] args) {
        // Bikin objek buat masing-masing jenis kendaraan
        Bus bus = new Bus("Terminal A - Terminal B");
        Train train = new Train("Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Bandara - Hotel");

        // Simulasi perjalanan bus
        bus.startTrip(); // Mulai perjalanan
        bus.addPassenger(30); // Tambah penumpang
        System.out.println("Tarif perjalanan bus: Rp" + bus.calculateBusFare(5)); // Hitung dan tampilkan tarif
        bus.removePassenger(10); // Kurangi penumpang
        bus.stopTrip(); // Akhiri perjalanan

        System.out.println("===================================");
        System.out.println();

        // Simulasi perjalanan kereta
        train.startTrip(); // Mulai perjalanan
        train.addPassenger(150); // Tambah penumpang
        System.out.println("Tarif perjalanan kereta: Rp" + train.calculateTrainFare()); // Hitung dan tampilkan tarif
        train.removePassenger(50); // Kurangi penumpang
        train.stopTrip(); // Akhiri perjalanan

        System.out.println("===================================");
        System.out.println();

        // Simulasi perjalanan taksi
        taxi.startTrip(); // Mulai perjalanan
        taxi.addPassenger(3); // Tambah penumpang
        System.out.println("Tarif perjalanan taksi: Rp" + taxi.calculateTaxiFare(10)); // Hitung dan tampilkan tarif
        taxi.removePassenger(3); // Kurangi penumpang
        taxi.stopTrip(); // Akhiri perjalanan
    }
}