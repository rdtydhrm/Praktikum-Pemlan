public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    // Deklarasi atribut produk
    private int id; // ID produk
    private String name; // Nama produk
    private T category; // Kategori produk
    private double price; // Harga produk

    // Konstruktor untuk inisialisasi atribut produk
    public Product(int id, String name, T category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter untuk ID produk
    public int getId() {
        return id;
    }

    // Getter untuk nama produk
    public String getName() {
        return name;
    }

    // Getter untuk kategori produk
    public T getCategory() {
        return category;
    }

    // Getter untuk harga produk
    public double getPrice() {
        return price;
    }

    // Implementasi metode compareTo untuk membandingkan kategori produk
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category);
    }

    // Override metode toString untuk menampilkan informasi produk
    @Override
    public String toString() {
        return String.format("ID: %d | Nama: %s | Kategori: %s | Harga: %.2f", id, name, category.toString(), price);
    }
}
