package ar.com.ada.oop;

import ar.com.ada.oop.domain.Planeta;
import ar.com.ada.oop.domain.Vehiculo;

public class App {

    public static void main(String[] args) {
        byte númPuertas = 4;
        byte númAsientos = 4;
        Vehiculo bmw = new Vehiculo("BMW", 2017, 2000, "Gasolina", "Familiar",
                númAsientos,númAsientos, 260, "Gris",100);
        System.out.println("Para recorrer " + 1000 + " km, estaríamos un tiempo de: " + bmw.calcularTiempoEstimado(1000));


        /*System.out.println("Velocidad actual del vehículo " + bmw.getMarca() + " es: " + bmw.getVelocidadActual());
        bmw.acelerar(50);
        System.out.println("Velocidad actual del vehículo " + bmw.getMarca() + " es: " + bmw.getVelocidadActual());
        bmw.acelerar(200);
        System.out.println("Velocidad actual del vehículo " + bmw.getMarca() + " es: " + bmw.getVelocidadActual());
        bmw.frenar();
        System.out.println("Velocidad actual del vehículo " + bmw.getMarca() + " es: " + bmw.getVelocidadActual());


       /* Planeta tierra = new Planeta();
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


        Planeta jupiter = new Planeta("Júpiter", 79, 189900000000.0, 91258603.3, 254233330, 12456987, "GASEOSO", true);*/



    }
}

