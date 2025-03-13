package TugasPraktikum3;

public class Shape {

    private int id;
    private Double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    public Shape(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setRad(double radius){
        this.radius = radius;
    }

    public double getKLL(){
        return 2 * ((double) pembilang / penyebut) * radius;
    }

    public double getLuas(){
        return ((double)pembilang / penyebut) * (radius * radius);
    }

    public void printInfoShape(){
        System.out.println(Main.BLUE + "ID: " + id + "\n"  + Main.GREEN + "Radius: " + radius + "\n"  + "Keliling: " + getKLL() + "\n" + "Luas: " + getLuas());
    }
    
}
