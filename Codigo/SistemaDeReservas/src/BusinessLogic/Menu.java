package BusinessLogic;

import java.util.Scanner;

public class Menu {

    public Menu() {
        login();

        MostrarOpciones();
    }

    public void MostrarOpciones() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1. Crear reservacion");
            System.out.println("2. Ver reservaciones");
            System.out.println("3. Cancelar reservacion");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("=====Crear reservacion=====");
                    Scanner Scan = new Scanner(System.in);
                    System.out.println("Favor ingrese la fecha en la que desea visitar el restaurante");
                    String nuevaReserva = Scan.next();
                    
                    System.out.println(nuevaReserva);

                    break;
                case 2:
                    System.out.println("Ver reservaciones");
                    break;
                case 3:
                    System.out.println("Cancelar reservacion");
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 4);
        entrada.close();
    }

    public void login() {
        Scanner entrada = new Scanner(System.in);

        String usuario = "";
        String clave = "";

        System.out.println("Por favor ingrese sus datos");
        System.out.println("Ingrese su usuario");
        usuario = entrada.next();
        System.out.println("Ingrese su contraseña");
        clave = entrada.next();

        Seguridad seguridad = new Seguridad();

        Boolean Resultado = seguridad.buscarPorUsuarioYClave(usuario, clave);
        if (Resultado) {
            System.out.println("Bienvenido");
            MostrarOpciones();
        } else {
            System.out.println("Usuario y/o contraseña incorrecta");
        }
        entrada.close();

    }

}