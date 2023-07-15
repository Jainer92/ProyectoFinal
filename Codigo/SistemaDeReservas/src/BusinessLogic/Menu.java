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
                    System.out.println("Favor escoja el mes en el que desea visitar el restaurante");
                    int mesSeleccionado = 0;
                    do {
                        System.out.println("1. Enero");
                        System.out.println("2. Febrero");
                        System.out.println("3. Marzo");
                        System.out.println("4. Abril");
                        System.out.println("5. Mayo");
                        System.out.println("6. Junio");
                        System.out.println("7. Julio");
                        System.out.println("8. Agosto");
                        System.out.println("9. Septiembre");
                        System.out.println("10. Octubre");
                        System.out.println("11. Noviembre");
                        System.out.println("12. Diciembre");
                        System.out.println("13. ===Salir===");
                        mesSeleccionado = Scan.nextInt();

                        switch (mesSeleccionado) {
                            case 1:
                                System.out.println("======Enero=====");
                                Scanner Sc = new Scanner(System.in);
                                System.out.println("Favor digite el dia");
                                int diaSeleccionado = Sc.nextInt();
                                System.out.println("Se ha seleccionado el dia: "+ diaSeleccionado+ " de Enero");

                                
                                break;
                            case 2:
                                System.out.println("Febrero");
                                break;
                            case 3:
                                System.out.println("Marzo");
                                break;
                            case 4:
                                System.out.println("Abril");
                                break;
                            case 5:
                                System.out.println("Mayo");
                                break;
                            case 6:
                                System.out.println("Junio");
                                break;
                            case 7:
                                System.out.println("Julio");
                                break;
                            case 8:
                                System.out.println("Agosto");
                                break;
                            case 9:
                                System.out.println("Septiembre");
                                break;
                            case 10:
                                System.out.println("Octubre");
                                break;
                            case 11:
                                System.out.println("Noviembre");
                                break;
                            case 12:
                                System.out.println("Diciembre");
                                break;

                        }
                        System.out.println();
                    } while (opcion != 13);
                    Scan.close();

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