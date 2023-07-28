package org.randstad.interfaces;

public class MostrarPago {
    public static void main(String[] args) {
        TarjetaCredito miTarjeta = new TarjetaCredito(50, 123456789);
        System.out.println(miTarjeta.pagar());

        PayPal miPaypal = new PayPal(100);
        System.out.println(miPaypal.pagar());
    }
}
