public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Jeremias");
        persona.setTelefono("22553344");

        System.out.println("La edad de " + persona.getNombre() + " es de: " + persona.getEdad() + " anios");
        System.out.println("Su telefono es: " + persona.getTelefono());
    }
}

