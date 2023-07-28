package org.randstad.usuarios;

import java.util.List;

public class Admin extends Usuario{
    private String cargo;

    public Admin(String nombre, String correo, String contrasena, String cargoAdmin) {
        super(nombre, correo, contrasena);
        this.cargo = cargoAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public List<Object> getPerfil() {
        List<Object> perfilAdmin = super.getPerfil();
        perfilAdmin.add(getCargo());
        return perfilAdmin;
    }
}
