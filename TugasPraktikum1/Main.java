package TugasPraktikum1;

import TugasPraktikum1.champion;

public class Main {
    public static void main(String[] args) {
    // deklarasi variabel
    champion Kabal, SubZero;

    // instansiasi Kabal
    Kabal = new champion();
    Kabal.weapons = "Hook Blade";
    Kabal.clothColor = "Black & Grey";
    Kabal.powers = "Super Speed";

    // instansiasi Subzero
    SubZero = new champion();
    SubZero.weapons = "Axe";
    SubZero.clothColor = "Dark Blue";
    SubZero.powers = "Ice Manipulation"; 

    System.out.println("Champion Attribute: ");
    System.out.println("Name: " + "Kabal");
    System.out.println("Power: " + Kabal.powers);
    System.out.println("Weapons: " + Kabal.weapons);
    System.out.println("Skin Color: " + Kabal.clothColor);
    System.out.println("Intro Line: " + Kabal.introSound());
    System.out.println("Fight Over");
    Kabal.victroySound();
    System.out.println();

    System.out.println("Champion Attribute: ");
    System.out.println("Name: " + "Sub-Zero");
    System.out.println("Power: " + SubZero.powers);
    System.out.println("Weapons: " + SubZero.weapons);
    System.out.println("Skin Color: " + SubZero.clothColor);
    System.out.println("Intro Line: " + SubZero.introSound());
    System.out.println("Fight Over");
    SubZero.victroySound();
    

    }
}
