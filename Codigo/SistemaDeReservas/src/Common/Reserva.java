package Common;

public class Reserva {
    private int numeroDeReserva;
    private int numeroMesa;

    private String reservaEstado;
    private int diaDeReserva;

    public Reserva(int reserveNumber, int tableNumber){
        numeroDeReserva = reserveNumber;
        numeroMesa= tableNumber;
        reservaEstado = "Disponible";
    }

    public int getNumeroDeReserva() {
        return numeroDeReserva;
    }

    public void setNumeroDeReserva(int numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getReservaEstado() {
        return reservaEstado;
    }

    public void setReservaEstado(String reservaEstado) {
        this.reservaEstado = reservaEstado;
    }

    public int getDiaDeReserva() {
        return diaDeReserva;
    }

    public void setDiaDeReserva(int diaDeReserva) {
        this.diaDeReserva = diaDeReserva;
    }
    

    
}
