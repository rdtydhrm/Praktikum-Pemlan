package TugasPraktikum2;

public class BankAccount {
    String noRek;
    String namaPemilik;
    double saldo = 0;

    BankAccount(String noRek, String namaPemilik, double saldo){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    BankAccount(String noRek, String namaPemilik){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
    }

    public void displayInfo(){
        System.out.println("nomor rekening: " + noRek + "\n" + 
        "nama pemilik: " + namaPemilik +"\n" +
        "saldo: " + saldo);
    }

    public void deposit(double nominal){
        if (nominal <= 0){
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Juamlah yang berhassil di depositkan: " + nominal);
        }
    }

    public void withdraw(double nominal){
        if (nominal <= 0){
           System.out.println( "nominal penarikan harus lebih dari 0!");
        } else if (saldo < nominal){
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("jumlah yang berhsail di tarik: "+ nominal);
        }
    } 
}
