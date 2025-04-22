package geometry.bases;

// Kelas abstrak Shape mendefinisikan atribut dasar untuk semua bentuk.
public abstract class Shape {
    private String name; // Nama bentuk

    public Shape() {}

    // Mengatur nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Mengambil nama bentuk
    public String getName() {
        return this.name;
    }

    // Metode abstrak untuk mencetak informasi bentuk
    public abstract void printInfo();
}
