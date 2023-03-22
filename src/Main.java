public class Main {
    public static void main(String[] args) {
        Direccion direccion = new DireccionImpl("123 Calle Principal");
        Persona persona = new Persona("Juan", direccion);
        persona.presentarse();
    }
}