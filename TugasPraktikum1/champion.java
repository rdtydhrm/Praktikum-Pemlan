package TugasPraktikum1;

// deklarasi kelas
public class champion {
    // field mengenai atribut dari champion Mortal Kombat
    public String weapons; // senjata yang digunakan 
    public String clothColor; // warna dari skin/warna baju
    public String powers; // kekuatan dari champion atau hero

    // method
    public void victroySound(){
        System.out.println("Fatality!"); //menampilkan sebuah kata pada saat champion memenangkan pertandingan
    }
    public String introSound(){
        return "Any idea who I am?"; // sebuah kalimat yang dikatakan para champion saat memulai pertandingan
    }
    
}
