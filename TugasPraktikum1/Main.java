package TugasPraktikum1;

public class Main {
    public static void main(String[] args) {
    // instansiasi Kabal
    champion Kabal = new champion("Kabal", "Hook Blade", "Super Speed");
    
    // instansiasi Subzero
    champion SubZero = new champion("Sub-Zero", "Axe","Ice Manipulation");

    // menggunakan method dari class champion
    Kabal.attribut(); // menampilkan atribut dari kabal
    Kabal.victroySound(); // menampilkan sebuah kata saat berakhirnya pertandingan
    System.out.println(); // memberi jeda saat menampilkan atribut dari champion

    SubZero.attribut(); // menampilkan atribut dari sub zero
    SubZero.victroySound(); // menampilkan sebuah kata saat berakhirnya pertandingan
    }
}
