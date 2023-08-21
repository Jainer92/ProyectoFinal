package BusinessLogic;

import Common.Usuario;

public class Seguridad {

    public Seguridad(){
        registroDeUsuarios();
    }
    public Usuario[] arregloUsuarios = new Usuario[5];

    public void registroDeUsuarios() {
        Usuario usuarioAdmin = new Usuario();
        usuarioAdmin.setNombreUsuario("Admin");
        usuarioAdmin.setContraseña("123");

        Usuario usuarioClienteJack = new Usuario("Jack", "123");
        Usuario usuarioClienteSally = new Usuario("Sally", "123");
        Usuario usuarioClienteBarrel = new Usuario("Barrel", "123");
        Usuario usuarioClienteLock = new Usuario("Lock", "123");

        arregloUsuarios[0] = usuarioAdmin;
        arregloUsuarios[1] = usuarioClienteJack;
        arregloUsuarios[2] = usuarioClienteSally;
        arregloUsuarios[3] = usuarioClienteBarrel;
        arregloUsuarios[4] = usuarioClienteLock;

    }

    public boolean buscarPorUsuarioYClave(String user, String password) {
        for (int indice = 0; indice < arregloUsuarios.length; indice++) {
            var variableLocalUsuario = arregloUsuarios[indice].getNombreUsuario();
            var vlClave = arregloUsuarios[indice].getContraseña();
            if (variableLocalUsuario.equals(user) && vlClave.equals(password)) {
                return true;
            }

        }
        return false;
    }

}

