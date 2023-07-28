package org.randstad.abstrato;

public class Audi extends Coche{
    public Audi(String marca) {
        super(marca);
    }

    @Override
    public String intro() {
        return "soy un coche alemán tipo: " + this.marca;
    }
}
