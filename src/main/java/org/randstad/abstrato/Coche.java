package org.randstad.abstrato;

abstract public class Coche {
    public String marca;

    public Coche(String marca) {
        this.marca = marca;
    }


    abstract public String intro();
}
