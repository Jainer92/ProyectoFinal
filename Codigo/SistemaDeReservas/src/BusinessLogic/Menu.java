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
                                System.out.println("Favor digite el dia");
                                int diaSeleccionado = Sc.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int mesaSeleccionada = Sc2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, mesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, diaSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + mesaSeleccionada + " para el " + diaSeleccionado + " de Enero***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Febrero");
                                Scanner ScFeb = new Scanner(System.in);
                                Scanner ScFeb2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int febSeleccionado = ScFeb.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int febMesaSeleccionada = ScFeb2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, febMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, febSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + febMesaSeleccionada + " para el " + febSeleccionado + " de Febrero***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Marzo");
                                Scanner ScMar = new Scanner(System.in);
                                Scanner ScMar2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int marSeleccionado = ScMar.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int marMesaSeleccionada = ScMar2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, marMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, marSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + marMesaSeleccionada + " para el " + marSeleccionado + " de Marzo***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("Abril");
                                Scanner ScAbr = new Scanner(System.in);
                                Scanner ScAbr2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int abrSeleccionado = ScAbr.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int abrMesaSeleccionada = ScAbr2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, abrMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, abrSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + abrMesaSeleccionada + " para el " + abrSeleccionado + " de Abril***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 5:
                                System.out.println("Mayo");
                                Scanner ScMay = new Scanner(System.in);
                                Scanner ScMay2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int maySeleccionado = ScMay.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int mayMesaSeleccionada = ScMay2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, mayMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, maySeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + mayMesaSeleccionada + " para el " + maySeleccionado + " de Mayo***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 6:
                                System.out.println("Junio");
                                Scanner ScJun = new Scanner(System.in);
                                Scanner ScJun2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int junSeleccionado = ScJun.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int junMesaSeleccionada = ScJun2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, junMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, junSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + junMesaSeleccionada + " para el " + junSeleccionado + " de Junio***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 7:
                                System.out.println("Julio");
                                Scanner ScJul = new Scanner(System.in);
                                Scanner ScJul2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int julSeleccionado = ScJul.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int julMesaSeleccionada = ScJul2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, julMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, julSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + julMesaSeleccionada + " para el " + julSeleccionado + " de Julio***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 8:
                                System.out.println("Agosto");
                                Scanner ScAgo = new Scanner(System.in);
                                Scanner ScAgo2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int agoSeleccionado = ScAgo.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int agoMesaSeleccionada = ScAgo2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, agoMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, agoSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + agoMesaSeleccionada + " para el " + agoSeleccionado + " de Agosto***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 9:
                                System.out.println("Septiembre");
                                Scanner ScSep = new Scanner(System.in);
                                Scanner ScSep2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int sepSeleccionado = ScSep.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int sepMesaSeleccionada = ScSep2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, sepMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, sepSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + sepMesaSeleccionada + " para el " + sepSeleccionado + " de Septiembre***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 10:
                                System.out.println("Octubre");
                                Scanner ScOct = new Scanner(System.in);
                                Scanner ScOct2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int octSeleccionado = ScOct.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int octMesaSeleccionada = ScOct2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, octMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, octSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + octMesaSeleccionada + " para el " + octSeleccionado + " de Octubre***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 11:
                                System.out.println("Noviembre");
                                Scanner ScNov = new Scanner(System.in);
                                Scanner ScNov2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int novSeleccionado = ScNov.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int novMesaSeleccionada = ScNov2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, novMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, novSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + novMesaSeleccionada + " para el " + novSeleccionado + " de Noviembre***");
                                System.out.println("**************************************************************************");
                                System.out.println();
                                break;
                            case 12: 
                                System.out.println("Diciembre");
                                Scanner ScDic = new Scanner(System.in);
                                Scanner ScDic2 = new Scanner(System.in);
                                getReservasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite el día");
                                int dicSeleccionado = ScDic.nextInt();
                                getMesasPorEstado(vgEstadoDisponible);
                                System.out.println("Favor digite la mesa que desea");
                                int dicMesaSeleccionada = ScDic2.nextInt();
                                System.out.println("====================================================");
                                reservarMesa(null, dicMesaSeleccionada, vgEstadoReservada, vgEstadoDisponible);
                                crearReserva(null, dicSeleccionado, vgEstadoReservada, vgEstadoDisponible);
                                
                                System.out.println("====================================================");
                                System.out.println();
                                System.out.println();
                                System.out.println("**************************************************************************");
                                System.out.println("***Se ha creado la reservación de la mesa número  "
                                        + dicMesaSeleccionada + " para el " + dicSeleccionado + " de Diciembre***");
                                System.out.println("**************************************************************************");
                                System.out.println();
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
        System.out.println("================================================================================");
        System.out.println("             Bienvenido al sistema de reservas del Restaurante XYZ");
        System.out.println("Le recordamos que nuestro horario de atención al público es de 1 p.m. a 11 p.m.");
        System.out.println("                  Solo se permite reservar por una hora al día");
        System.out.println("================================================================================");
        System.out.println();
        System.out.println("              Si desea hacer una reservación favor ingrese sus datos");
        System.out.println("Ingrese su nombre de usuario:");
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
                System.out.println("Mesa #" + vgArregloDeMesas[indice].getNumeroDeMesa());

            }
        }

    }

    public void reservarMesa(Cliente vpCliente, int vpNumeroDeMesa, String vpfecha, String vphora) {
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            Mesa vlMesaDelCiclo = vgArregloDeMesas[indice];
            String vlEstado = vlMesaDelCiclo.getEstado();
            int vlNumeroMesa = vlMesaDelCiclo.getNumeroDeMesa();


            if (vlNumeroMesa == vpNumeroDeMesa  && vlEstado.equals(vgEstadoDisponible)) {

                System.out.println("La mesa # " + vpNumeroDeMesa + ", fue reservada de forma exitosa!");

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

    public void crearReserva(Cliente vpCliente, int vpNumeroDeReserva, String vpfecha, String vphora) {
        for (int indice = 0; vgArregloDeReservas.length > indice; indice++) {
            Reserva vlReservaDelCiclo = vgArregloDeReservas[indice];
            String vlEstado = vlReservaDelCiclo.getReservaEstado(); 
            int vlNumeroReserva = vlReservaDelCiclo.getNumeroDeReserva();


            if (vlNumeroReserva == vpNumeroDeReserva  && vlEstado.equals(vgReservaDisponible)) {

                System.out.println("La Reserva " + vpNumeroDeReserva + ", fue creada de forma exitosa!");

                vgArregloDeMesas[indice].setEstado(vgEstadoReservada);
                vgArregloDeMesas[indice].setCliente(vpCliente);


                return;
            }

        }
        System.out.println("El numero de mesa: " + vpNumeroDeReserva + " no esta disponible!");
    }


}
