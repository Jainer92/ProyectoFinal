package BusineesLogic;

import Common.Cliente;

public class Menu {
    public Menu() {
        Cliente cliente1 = new Cliente("Jack", "Skellington", "666666", "88796512");

        System.out.println("Cliente: " + cliente1.getInformacion());
    }
}