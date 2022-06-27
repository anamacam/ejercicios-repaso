package ar.com.ada.oop.domain;

public class Planeta {
    // atributos del planeta
    private  static final int UA = 149597870;
    private String nombre = null;
    private int cantSatélites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diámetro = 0;
    private int distanciaSol = 0;
    // los valores de enum se escriben en mayúscula, ya que se tratan de constantes definidas por el usuario
    private String tipoPlaneta;
    private boolean observable;

    public Planeta(){

    }

    public Planeta(String nombre, int cantSatélites, double masa, double volumen, int diámetro, int distanciaSol, String tipoPlaneta, boolean observable) {
        this.nombre = nombre;
        this.cantSatélites = cantSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantSatélites() {
        return cantSatélites;
    }

    public void setCantSatélites(int cantSatélites) {
        this.cantSatélites = cantSatélites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiámetro() {
        return diámetro;
    }

    public void setDiámetro(int diámetro) {
        this.diámetro = diámetro;
    }
    public int getDistanciaSol() {
        return distanciaSol;
    }
    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }
    public void setTipoPlaneta(String tipoPlaneta){
        this.tipoPlaneta = tipoPlaneta;
    }
    public String getTipoPlaneta(){
        return tipoPlaneta;
    }
    public boolean isObservable() {
        return observable;
    }
    public void setObservable(boolean observable) {
        this.observable = observable;
    }
    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantSatélites=" + cantSatélites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diámetro=" + diámetro +
                ", distanciaSol=" + distanciaSol +
                ", tipo=" + tipoPlaneta +
                ", observable=" + observable +
                '}';
    }
    public double calcularDensidad(){
        return masa/volumen;

    }
    public boolean esExteriorAlSistemaSolar(){
        boolean esExterior = false;
        double uaPlaneta = distanciaSol/ UA;
        if (uaPlaneta > 3.4 ){
            esExterior = true;

        }

        return  esExterior;

    }

    }







