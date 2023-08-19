package BusinessLogic;

import java.util.Scanner;

import Common.Cliente;
import Common.Mesa;
import Common.Reserva;

public class Menu {
    private Mesa[] vgArregloDeMesas = new Mesa[10];
    final String vgEstadoDisponible = "Disponible";
    final String vgEstadoReservada = "Reservada";

    private Reserva[] vgArregloDeReservas = new Reserva[30];
    final String vgReservaDisponible = "Disponible";
    final String vgReservadaCreada = "Reservada";

    public Menu() {
        inicializarReservas();
        inicializarMesas();
        login();

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
            System.out.println("========================");
            System.out.println("   Elige una opcion");
            System.out.println("========================");
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
                                Scanner Sc2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int diaSeleccionado = Sc.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int mesaSeleccionada = Sc2.nextInt();
                                crearReserva(diaSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                reservarMesa(null, mesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                System.out.println("***Se ha creado la reservación de la mesa número "
                                        + mesaSeleccionada + " para el " + diaSeleccionado + " de Enero***");
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
                            case 13:
                                System.out.println("Volviendo al menú principal..");
                                break;
                            default:
                                System.out.println("Opción inválida. Inténtalo de nuevo.");
                                break;

                        }
                        System.out.println();
                    } while (mesSeleccionado != 13);
                    Scan.close();
                    break;
                case 2:
                    System.out.println("Ver reservaciones");
                    getMesasPorEstado(vgEstadoDisponible);
                    break;
                case 3:
                    System.out.println("Cancelar reservacion");
                    getReservasPorEstado(vgEstadoDisponible);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
                    break;
            }
            System.out.println();
        } 
        while (opcion != 4);
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
            System.out.println("~~~~~~~Bienvenido~~~~~~~");
            MostrarOpciones();
        } else {
            System.out.println("Usuario y/o contraseña incorrecta");
        }
        entrada.close();

    }

    public void inicializarMesas() {
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            vgArregloDeMesas[indice] = new Mesa(indice + 1, 4);
        }
    }

    public void getMesasPorEstado(String vpEstado) {
        System.out.println("lista de mesas:" + vpEstado);

        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            String vlEstado = vgArregloDeMesas[indice].getEstado();

            if (vlEstado.equals(vpEstado)) {
                System.out.println("Mesa # " + vgArregloDeMesas[indice].getNumeroDeMesa());

            }
        }

    }

    public void reservarMesa(Cliente vpCliente, int vpNumeroDeMesa, String vpfecha, String vphora) {
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            Mesa vlMesaDelCiclo = vgArregloDeMesas[indice];
            String vlEstado = vlMesaDelCiclo.getEstado();
            int vlNumeroMesa = vlMesaDelCiclo.getNumeroDeMesa();

            if (vlNumeroMesa == vpNumeroDeMesa && vlEstado.equals(vgEstadoDisponible)) {

                System.out.println("Y de la mesa número " + vpNumeroDeMesa + ", fueron creadas exitosamente!!");

                vgArregloDeMesas[indice].setEstado(vgEstadoReservada);
                vgArregloDeMesas[indice].setCliente(vpCliente);

                return;
            }

        }
        System.out.println("El numero de mesa: " + vpNumeroDeMesa + " no esta disponible!");
    }

    public void inicializarReservas() {
        for (int indice = 0; vgArregloDeReservas.length > indice; indice++) {
            vgArregloDeReservas[indice] = new Reserva(indice + 1, 30);
        }
    }

    public void getReservasPorEstado(String vpEstado) {
        System.out.println("Lista de dias:" + vpEstado);

        for (int indice = 0; vgArregloDeReservas.length > indice; indice++) {
            String vlEstado = vgArregloDeReservas[indice].getReservaEstado();

            if (vlEstado.equals(vpEstado)) {
                System.out.println("Dia " + vgArregloDeReservas[indice].getNumeroDeReserva());

            }
        }

    }

    public void crearReserva(int vpNumeroDeReserva, String vpfecha, String vphora) {
        for (int indice = 0; vgArregloDeReservas.length > indice; indice++) {
            Reserva vlReservaDelCiclo = vgArregloDeReservas[indice];
            String vlEstado = vlReservaDelCiclo.getReservaEstado();
            int vlNumeroReserva = vlReservaDelCiclo.getNumeroDeReserva();

            if (vlNumeroReserva == vpNumeroDeReserva && vlEstado.equals(vgReservaDisponible)) {

                System.out.println("La Reserva del día " + vpNumeroDeReserva);

                vgArregloDeReservas[indice].setReservaEstado(vgEstadoReservada);

                return;
            }

        }
        System.out.println("El dia : " + vpNumeroDeReserva + " no esta disponible!");
    }

}
