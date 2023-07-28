package org.randstad.abstrato;

public class Toyota extends Coche{
    public Toyota(String marca) {
        super(marca);
    }

    @Override
    public String intro() {
        return "soy un coche japones tipo: " + this.marca;
    }
}
