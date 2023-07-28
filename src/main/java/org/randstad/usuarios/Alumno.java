package org.randstad.usuarios;

import java.util.List;

public class Alumno extends Usuario{
    private String bootcamp;

    public Alumno(String nombre, String correo, String contrasena, String bootcamp) {
        super(nombre, correo, contrasena);
        this.bootcamp = bootcamp;
    }

    public String getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(String bootcamp) {
        this.bootcamp = bootcamp;
    }

    @Override
    public List<Object> getPerfil() {
        List<Object> perfilAlumno = super.getPerfil();
        perfilAlumno.add(getBootcamp());
        return perfilAlumno;
    }
}
