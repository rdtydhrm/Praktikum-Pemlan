package TugasPraktikum1;

// deklarasi kelas
public class champion {
    // field mengenai atribut dari champion Mortal Kombat
    public String nama;// nama champion
    public String weapons; // senjata yang digunakan 
    public String powers; // kekuatan dari champion atau hero

    champion(String nama, String weapons, String powers){
        this.nama=nama; //mengambil variable nama dari class champion
        this.weapons=weapons; //mengambil vairable weapons dari class champion
        this.powers=powers; // mengambil variable powers dari kelas champion
    }

    // method
    public void victroySound(){
        System.out.println("Fatality!"); //menampilkan sebuah kata pada saat champion memenangkan pertandingan
    }

    public void attribut(){
    System.out.println("Champion Attribute: ");
    System.out.println("Name: " + nama); //menampilkan nama dari champion yang sudah di instansiasi
    System.out.println("Power: " + powers); //menampilkan kekuatan dari champion yang sudah di instansiasi
    System.out.println("Weapons: " + weapons); //menampilkan senjata yang digunakan champion yang sudah di instansiasi
    System.out.println("Fight Over"); //menampilkan kalimat pertandingan berakhir
    
}
}