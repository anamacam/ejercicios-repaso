package ar.com.ada.oop.domain;

public class Planeta {
    String nombre = null;
    int cantSatélites = 0;
    double masa = 0;
    double volumen = 0;
    int diámetro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta{GASEOSO, TERRESTRE , ENANO}
    tipoPlaneta tipo;
    boolean observable = false;

    Planeta(String nombre, int cantSatélites, double masa, double volumen, int diámetro, int distanciaSol, tipoPlaneta tipo, boolean observable){
        this.nombre = nombre;
        this.cantSatélites = cantSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;



    }



    }






