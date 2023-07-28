package org.randstad.usuarios;

public class MostrarUsuarios {
    public static void main(String[] args) {
        Alumno albert = new Alumno("Albert", "albert@gmail.com", "123456", "fullstack");
        System.out.println(albert.getBootcamp());
        Alumno mohamed = new Alumno("Mohamed", "mohamed@gmail.com", "098765", "fullstack");
        System.out.println("Nombre: " + mohamed.getNombre() + " Bootcamp: " + mohamed.getBootcamp());
        System.out.println(mohamed.getPerfil());

        //Instanciar objeto de tipo Admin
        Admin andres = new Admin("Andrés", "andre.com", "123456", "formador");
        System.out.println(andres.getPerfil());

    }
}
