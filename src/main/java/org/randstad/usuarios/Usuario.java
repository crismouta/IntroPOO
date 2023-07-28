package org.randstad.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Object> getPerfil(){
        List<Object> perfilUsuario = new ArrayList<>();
        perfilUsuario.add(getNombre());
        perfilUsuario.add(getCorreo());
        perfilUsuario.add(getContrasena());
        return perfilUsuario;
    }

}
