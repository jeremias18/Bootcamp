
public class Main {

    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 0;
        String estacion = "Otonio";

        if (numeroIf > 0){
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
                System.out.println("Negativo");
            }else{
                System.out.println("Es 0");
            }

        while (numeroWhile < 3){
            System.out.println("Numero While" + numeroWhile);
            numeroWhile += 1;
        }
        do {
            System.out.println("Numero DoWhile" + numeroWhile);
            numeroWhile += 1;
        } while(numeroWhile < 3);

        for(int numeroFor = 1; numeroFor <= 3; numeroFor++){
            System.out.println("Numero for" + numeroFor);
        }

        switch (estacion){
            case ("Invierno"):
                System.out.println("Invierno");
                break;
            case ("Verano"):
                System.out.println("Verano");
                break;
            case ("Otonio"):
                System.out.println("Otonio");
                break;
            case ("Primavera"):
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No existe esa estacion.");
                break;
        }
    }
}
