package Common;

public class Mesa {
    private int numeroDeMesa;
    private int numeroDeSillas;

    private String Estado;
    private Cliente Cliente;
    private String fecha; 
    private String hora;

    public String getEstado() {
        return Estado;
    }


    public void setEstado(String estado) {
        Estado = estado;
    }


    public Cliente getCliente() {
        return Cliente;
    }


    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }





    public Mesa(int tableNumber, int numberOfChairs){
        numeroDeMesa = tableNumber;
        numeroDeSillas= numberOfChairs;
        Estado = "Disponible";
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
