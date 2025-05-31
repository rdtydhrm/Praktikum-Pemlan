package interfaces;

// Interface untuk menghitung biaya pengiriman
public interface ShippingCostCalculator {
    // Harga per kilogram
    int PRICE_PER_KG = 2000;
    // Method untuk menghitung biaya kirim
    double calculateCost();
}
