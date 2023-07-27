package Common;

public class Mesa {
    private int numeroDeMesa;
    private int numeroDeSillas;

    private String Estado;
    private Cliente Cliente;
    private String fecha; 
    private String hora;


    public Mesa(int tableNumber, int numberOfChairs){
        numeroDeMesa = tableNumber = 0;
        numeroDeSillas= numberOfChairs=0;
    }


    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }


    public void setNumeroDeMesa(int tableNumber) {
        this.numeroDeMesa = tableNumber;
    }


    public int getNumeroDeSillas() {
        return numeroDeSillas;
    }


    public void setNumeroDeSillas(int numerOfChairs) {
        this.numeroDeSillas = numerOfChairs;
    }

}
