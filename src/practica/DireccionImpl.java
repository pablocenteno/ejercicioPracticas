package practica;

import org.springframework.stereotype.Component;


public class DireccionImpl implements Direccion {




    @Override
    public String obtenerDireccion() {
        return "calle Hola 123";
    }

    @Override
    public String codigoPostal() {
        return "28777";
    }
}