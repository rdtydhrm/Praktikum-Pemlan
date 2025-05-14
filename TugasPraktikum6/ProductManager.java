import java.util.*;

public class ProductManager {
    // Deklarasi atribut untuk menyimpan produk, kategori, dan antrian produk yang diproses
    private List<Product<?>> products = new ArrayList<>(); // Daftar produk
    private Set<String> categories = new HashSet<>(); // Set kategori unik
    private Queue<Product<?>> processedQueue = new LinkedList<>(); // Antrian produk yang diproses

    // Menambahkan produk ke daftar dan kategori
    public void addProduct(Product<?> product) {
        products.add(product);
        categories.add(product.getCategory().toString());
    }

    // Menghapus produk berdasarkan ID
    public void removeProductById(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Mencari produk berdasarkan nama dan kategori
    public void searchByNameAndCategory(String name, String category) {
        for (Product<?> p : products) {
            if (p.getName().equalsIgnoreCase(name) && p.getCategory().toString().equalsIgnoreCase(category)) {
                System.out.println("Ditemukan: " + p);
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }

    // Menampilkan semua produk yang diurutkan berdasarkan kategori
    public void showAllProducts() {
        List<Product<?>> sortedList = new ArrayList<>(products);
        sortedList.sort((p1, p2) -> p1.getCategory().toString().compareTo(p2.getCategory().toString()));
        for (Product<?> p : sortedList) {
            System.out.println(p);
        }
    }

    // Menampilkan semua kategori unik
    public void showAllCategories() {
        System.out.println("Kategori Unik:");
        for (String cat : categories) {
            System.out.println("- " + cat);
        }
    }

    // Menambahkan produk ke dalam antrian yang diproses
    public void addToProcessed(Product<?> product) {
        processedQueue.offer(product);
    }

    // Menampilkan antrian produk yang sedang diproses
    public void showProcessedQueue() {
        System.out.println("Antrian Produk yang Diproses:");
        for (Product<?> p : processedQueue) {
            System.out.println(p);
        }
    }

    // Memfilter produk berdasarkan rentang harga
    public void filterByPrice(double min, double max) {
        System.out.printf("Produk dengan harga antara %.2f dan %.2f:\n", min, max);
        for (Product<?> p : products) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                System.out.println(p);
            }
        }
    }
}
