package Paquete;

public class Paquete {
    public static void main(String[] args) {
        var resultado = suma(10, 8, 7);
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("=============================================");
        Coche miCoche = new Coche();
        miCoche.aumentar();
        System.out.println("El numero de puertas es: " + miCoche.puertas);
    }
    public  static int suma(int a, int b, int c) {
        return a+b+c;
    }
}
class Coche{
    int puertas;
    public  void aumentar(){
        this.puertas++;
    }
}
