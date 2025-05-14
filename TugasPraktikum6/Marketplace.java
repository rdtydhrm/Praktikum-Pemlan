public class Marketplace {
    public static void main(String[] args) {
        // Membuat instance ProductManager untuk mengelola produk
        ProductManager manager = new ProductManager();

        // Membuat beberapa produk dengan ID, nama, kategori, dan harga
        Product<String> p1 = new Product<>(1, "Laptop", "Elektronik", 15000000);
        Product<String> p2 = new Product<>(2, "Topi", "Fashion", 250000);
        Product<String> p3 = new Product<>(3, "TWS", "Elektronik", 500000);

        // Menambahkan produk ke dalam manajer produk
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        // Menampilkan semua produk
        System.out.println("\n-- Semua Produk --");
        manager.showAllProducts();

        // Mencari produk berdasarkan nama dan kategori
        System.out.println("\n-- Cari Produk --");
        manager.searchByNameAndCategory("Laptop", "Elektronik");

        // Menghapus produk berdasarkan ID
        System.out.println("\n-- Hapus Produk dengan ID 2 --");
        manager.removeProductById(2);

        // Menampilkan semua produk setelah penghapusan
        System.out.println("\n-- Semua Produk Setelah Dihapus --");
        manager.showAllProducts();

        // Menampilkan semua kategori unik
        System.out.println("\n-- Kategori Unik --");
        manager.showAllCategories();

        // Memfilter produk berdasarkan rentang harga
        System.out.println("\n-- Filter Produk Berdasarkan Harga --");
        manager.filterByPrice(400000, 1000000);

        // Menambahkan produk ke dalam antrian yang diproses
        System.out.println("\n-- Tambahkan ke Antrian Diproses --");
        manager.addToProcessed(p1);
        manager.addToProcessed(p3);

        // Menampilkan antrian produk yang sedang diproses
        manager.showProcessedQueue();
    }
}
