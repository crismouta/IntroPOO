package org.randstad.interfaces;

public class TarjetaCredito implements Pago{
    public int valor;
    public long numeroCuenta;

    public TarjetaCredito(int valor, long numeroCuenta) {
        this.valor = valor;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String pagar() {
        return "Mi numero de cuenta es: " + this.numeroCuenta + " y el valor pago es: " + this.valor;
    }

    @Override
    public String descargarFacura() {
        return null;
    }
}
