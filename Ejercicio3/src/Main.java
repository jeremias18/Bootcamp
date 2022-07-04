public class Main {
    public static void main(String[] args) {
        System.out.println(Suma(2,4,6));

        Coche nuevoAuto = new Coche();
        nuevoAuto.setPuertas(4);
        System.out.println(nuevoAuto.Puertas);
    }
    public static int Suma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}