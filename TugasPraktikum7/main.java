// Gede Raditya Dharma Putra Ayudia
// 245150700111028 / TI-C

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    // Method ini melempar InputMismatchException jika input bukan angka
    // dan IllegalArgumentException jika indeks di luar rentang array
    public static int getFilmIndex(Scanner scanner, int arrayLength)
            throws InputMismatchException, IllegalArgumentException {
        // Meminta user memasukkan indeks film yang ingin dilihat
        System.out.print("\nMasukkan indeks film yang ingin Anda lihat: ");

        // Membaca input user, akan melempar InputMismatchException jika input bukan
        // integer
        int indeks = scanner.nextInt();

        // Mengecek apakah indeks valid (dalam rentang array)
        // Jika tidak valid, melempar IllegalArgumentException dengan pesan yang sesuai
        if (indeks < 0 || indeks >= arrayLength) {
            throw new IllegalArgumentException(
                    "Indeks film tidak tersedia. Silakan masukkan nomor di antara 0 sampai " + (arrayLength - 1));
        }

        // Mengembalikan indeks yang valid
        return indeks;
    }

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // Array berisi daftar judul film
        String[] film = {
                "Transformers One",
                "Final Destination: Bloodlines",
                "Ready Player One",
                "Ready Or Not",
                "Bullet Train"
        };

        // Menampilkan daftar film ke layar
        System.out.println("<<<=== Daftar Film ===>>>");
        for (int i = 0; i < film.length; i++) {
            // Menampilkan indeks dan judul film
            System.out.println(i + ". " + film[i]);
        }

        // Blok try-catch untuk menangani berbagai kemungkinan error saat input
        try {
            // Memanggil method getFilmIndex untuk mendapatkan indeks film dari user
            int indeks = getFilmIndex(scanner, film.length);
            // Menampilkan judul film yang dipilih user
            System.out.println("Anda memilih: " + film[indeks]);
        } catch (InputMismatchException e) {
            // Menangani jika input user bukan angka/integer
            System.out.println("Terjadi kesalahan: Input harus berupa angka.");
        } catch (IllegalArgumentException e) {
            // Menangani jika indeks di luar rentang array
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            // Menangani error lain yang tidak terduga
            System.out.println("Kesalahan tak terduga: " + e.getMessage());
        }

        // Pesan penutup aplikasi
        System.out.println("\nTerima kasih telah menggunakan aplikasi daftar film!");
        // Menutup Scanner
        scanner.close();
    }
}
