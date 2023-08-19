package Common;
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Identificacion;
    private String Telefono;


    public Cliente(){
        Nombre = "";
        Apellido = "";
        Identificacion = "";
        Telefono = "";
    }
    public Cliente(String nombre, String apellido, String identificacion, String telefono) {
        Nombre = nombre;
        Apellido = apellido;
        Identificacion = identificacion;
        Telefono = telefono;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getIdentificacion() {
        return Identificacion;
    }
    public void setIndentificacion(String identificacion) {
        Identificacion = identificacion;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getInformacion() {

        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Identificacion: " + getIdentificacion() + " Telefono: " + getTelefono();

    }



}
