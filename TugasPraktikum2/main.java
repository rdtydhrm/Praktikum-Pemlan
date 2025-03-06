package TugasPraktikum2;

public class main {
    public static void main(String[] args) {
        
        BankAccount bni = new BankAccount("7654321", "mr x", 100000);
        BankAccount bri = new BankAccount("1234567", "mrs y");

        bni.displayInfo();
        bni.deposit(30000);
        bni.withdraw(40000);
        bni.deposit(-1);
        bni.withdraw(-1);
        bni.withdraw(500000);
        System.out.println();

        bri.displayInfo();
        bri.deposit(30000);
        bri.withdraw(40000);
        bri.deposit(-1);
        bri.withdraw(-1);
        bri.withdraw(500000);
        

    }
}
