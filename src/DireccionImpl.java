public class DireccionImpl implements Direccion {
    private String direccion;

    public DireccionImpl(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String obtenerDireccion() {
        return this.direccion;
    }
}