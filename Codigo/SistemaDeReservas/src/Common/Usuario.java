package Common;

public class Usuario {
    public String nombreUsuario;
    public String contraseña;

    public Usuario(){
        nombreUsuario =" ";
        contraseña = " ";

    }
    public Usuario( String userName, String password){
    nombreUsuario = userName;
    contraseña = password;
}
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String userName) {
        nombreUsuario = userName;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String password) {
        this.contraseña = password;
    }
    
}
