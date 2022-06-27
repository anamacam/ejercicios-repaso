package ar.com.ada.oop.domain;

public class Vehiculo {
    // Atributos del automóvil
    private String marca;
    private int año;
    private double motor;
    private String tipoCombustible;
    private String tipoAutomóvil;
    private byte númPuertas;
    private byte númAsientos;
    private double velocidadMax;
    private String color;
    private double velocidadActual;

    // Constructor que tenga que reciba como parámetro los atributos

    public Vehiculo(String marca, int año, double motor, String tipoCombustible, String tipoAutomóvil, byte númPuertas, byte númAsientos, double velocidadMax, String color, double velocidadActual) {
        this.marca = marca;
        this.año = año;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númPuertas = númPuertas;
        this.númAsientos = númAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    // Se modifica el valor del atributo velocidadActual a través de un método del mismo objeto:
    // acelerar, desacelerar, frenar y tiempo estimado de llegada
    public void acelerar(double velocidadAIncrementar) {
        // variable auxiliar
        double nuevaVelocidad = velocidadActual + velocidadAIncrementar;
        if (nuevaVelocidad > velocidadMax) {
            System.out.println("No se puede acelerar a más de: " + velocidadMax);
        } else {
            velocidadActual = nuevaVelocidad;

        }
    }
    public void desacelerar(double velocidadADisminuir) {
        velocidadActual = velocidadActual + velocidadADisminuir;
        double nuevaVelocidad = velocidadActual + velocidadADisminuir;
        if (nuevaVelocidad < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa:" + velocidadMax);
        } else {
            velocidadActual = nuevaVelocidad;

        }
    }

    public void frenar(){
        velocidadActual = 0;

    }

    public double calcularTiempoEstimado(double distanciaARecorrer){
        return distanciaARecorrer / velocidadActual;

    }


    // Métodos Get y Set


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoAutomóvil() {
        return tipoAutomóvil;
    }

    public void setTipoAutomóvil(String tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }

    public byte getNúmPuertas() {
        return númPuertas;
    }

    public void setNúmPuertas(byte númPuertas) {
        this.númPuertas = númPuertas;
    }

    public byte getNúmAsientos() {
        return númAsientos;
    }

    public void setNúmAsientos(byte númAsientos) {
        this.númAsientos = númAsientos;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
}

