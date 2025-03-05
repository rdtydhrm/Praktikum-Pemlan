package TugasPraktikum1;

public class Main {
    public static void main(String[] args) {
    // deklarasi variabel
    champion Kabal, SubZero;

    // instansiasi Kabal
    Kabal = new champion();
    Kabal.weapons = "Hook Blade"; //senjata Kabal
    Kabal.clothColor = "Black & Grey"; //warna baju/skin Kabal
    Kabal.powers = "Super Speed"; //kekuatan Kabal

    // instansiasi Subzero
    SubZero = new champion();
    SubZero.weapons = "Axe"; //senjata Sub Zero
    SubZero.clothColor = "Dark Blue"; //warna baju/skin Sub Zero
    SubZero.powers = "Ice Manipulation"; //kekuatan Sub Zero

    //Menampilkan atribut dari champion Kabal sesuai dengan variabel yang sudah di instansiasi
    System.out.println("Champion Attribute: ");
    System.out.println("Name: " + "Kabal");
    System.out.println("Power: " + Kabal.powers);
    System.out.println("Weapons: " + Kabal.weapons);
    System.out.println("Skin Color: " + Kabal.clothColor);
    System.out.println("Intro Line: " + Kabal.introSound());
    System.out.println("Fight Over"); //menampilkan kalimat pertandingan berakhir
    Kabal.victroySound(); //dan menampilkan kata saat champion menang
    System.out.println(); //memberi jeda antar atribut dari champion yang ditampilkan
    

    //Menampilkan atribut dari champion Sub Zero sesuai dengan variabel yang sudah di instansiasi
    System.out.println("Champion Attribute: ");
    System.out.println("Name: " + "Sub-Zero");
    System.out.println("Power: " + SubZero.powers);
    System.out.println("Weapons: " + SubZero.weapons);
    System.out.println("Skin Color: " + SubZero.clothColor);
    System.out.println("Intro Line: " + SubZero.introSound());
    System.out.println("Fight Over"); //menampilkan kalimat pertandingan berakhir
    SubZero.victroySound(); //dan menampilkan kata saat champion menang
    

    }
}
