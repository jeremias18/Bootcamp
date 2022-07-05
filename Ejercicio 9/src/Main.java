public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.Nombre = "Carlos";
        cliente.Telefono = "2778834";
        cliente.Edad = 50;
        cliente.Credito = 2400;

        System.out.println("Cliente: " + cliente.Nombre);
        System.out.println("Telefono: " + cliente.Telefono);
        System.out.println("Edad: " + cliente.Edad);
        System.out.println("Credito: " + cliente.Credito);

        Trabajador trabajador = new Trabajador();
        trabajador.Nombre = "Juan";
        trabajador.Telefono = "556488";
        trabajador.Edad = 18;
        trabajador.Salario = 1600;

        System.out.println("Trabajador: " + trabajador.Nombre);
        System.out.println("Telefono: " + trabajador.Telefono);
        System.out.println("Edad: " + trabajador.Edad);
        System.out.println("Salario: " + trabajador.Salario);
    }
}