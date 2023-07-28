package org.randstad.abstrato;

public class MostrarCoche {
    public static void main(String[] args) {
        Audi miAudi = new Audi("audi");
        System.out.println(miAudi.intro());

        Toyota miToyota = new Toyota("toyota");
        System.out.println(miToyota.intro());
    }
}
