package org.randstad.interfaces;

public class PayPal implements Pago{
    public int valor;

    public PayPal(int valor) {
        this.valor = valor;
    }

    @Override
    public String pagar() {
        return "he pagado con paypal el valor: " + this.valor;
    }

    @Override
    public String descargarFacura() {
        return null;
    }
}
