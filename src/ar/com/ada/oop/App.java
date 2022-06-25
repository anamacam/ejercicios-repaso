package ar.com.ada.oop;

import ar.com.ada.oop.domain.Planeta;

public class App {

    public static void main(String[] args) {

        Planeta tierra = new Planeta();
        tierra.setNombre("Tierra");
        tierra.setCantSatélites(1);
        tierra.setMasa(5972546546.0);
        tierra.setVolumen(1321565);
        tierra.setDiámetro(100000000);
        tierra.setDistanciaSol(51321654);
        tierra.setTipoPlaneta("TERRESTRE");
        tierra.setObservable(true);
        System.out.println(tierra.toString());
        System.out.println("La densidad de " +
                tierra.calcularDensidad());
        System.out.println("Es un planeta exterior: " + tierra.esExteriorAlSistemaSolar());


        Planeta jupiter = new Planeta("Júpiter", 79, 189900000000.0, 91258603.3, 254233330, 12456987, "GASEOSO", true);


    }
}

