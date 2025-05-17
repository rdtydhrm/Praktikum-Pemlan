// Gede Raditya Dharma Putra Ayudia
// 245150700111028 / TI-C

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Setiap elemen array merepresentasikan judul film yang tersedia bertipe String
        String[] film = {
                "Transformers One",
                "Final Destination: Bloodlines",
                "Ready Player One",
                "Ready Or Not",
                "Bullet Train"
        };

        // Menggunakan perulangan for untuk menampilkan setiap film beserta indeksnya
        System.out.println("<<<=== Daftar Film ===>>>");
        for (int i = 0; i < film.length; i++) {
            // Menampilkan indeks dan judul film
            System.out.println(i + ". " + film[i]);
        }

        // Pengguna diminta memasukkan angka sesuai indeks film yang ingin dipilih
        System.out.print("\nMasukkan indeks film yang ingin Anda lihat: ");
        int indeks = scanner.nextInt();

        // Jika pengguna memasukkan indeks di luar rentang array, maka akan terjadi
        // exception dengan penanganan Try Catch
        try {
            // Menampilkan judul film yang dipilih berdasarkan indeks yang dimasukkan
            // pengguna
            System.out.println("Anda memilih: " + film[indeks]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangani jika indeks yang dimasukkan tidak tersedia dalam array
            System.out.println("Terjadi kesalahan: Indeks film tidak tersedia.");
            System.out.println("Silakan masukkan nomor di antara 0 sampai " + (film.length - 1));
        }

        // Pesan penutup aplikasi
        System.out.println("\nTerima kasih telah menggunakan aplikasi daftar film!");

        // Tutup Scanner
        scanner.close();
    }
}
