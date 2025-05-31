package bases;

// Kelas abstrak dasar untuk semua bentuk
public abstract class Shape {
    // Nama bentuk (opsional)
    protected String name;

    // Konstruktor default
    public Shape() {}

    // Setter untuk nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Getter untuk nama bentuk
    public String getName() {
        return name;
    }

    // Method abstrak untuk menampilkan informasi bentuk
    public abstract void printInfo();
}
