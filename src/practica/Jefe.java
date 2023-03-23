package practica;

import org.springframework.stereotype.Component;


public class Jefe implements Empleados{

    private Direccion direccion;
    public Jefe(Direccion direccion){
        this.direccion = direccion;
    }
    @Override
    public String getEdad() {
        return "30";
    }

    @Override
    public String getNacionalidad() {
        return "españa";
    }

    @Override
    public String getDireccion() {
        return direccion.obtenerDireccion();
    }
}
