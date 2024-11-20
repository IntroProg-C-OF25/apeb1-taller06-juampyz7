
import java.util.Scanner;

public class clasificacionTriangulo {
    public static void main(String[] args) {
        double ladoUno, ladoDos, ladoTres;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese los 3 lados del triangulo: ");
        ladoUno = tcl.nextDouble();
        ladoDos = tcl.nextDouble();
        ladoTres = tcl.nextDouble();
        if (ladoUno + ladoDos <= ladoTres || ladoUno + ladoTres <= ladoDos || ladoDos + ladoTres <= ladoUno) {
            System.out.println("No es un triángulo");
        } else {
            if (ladoUno == ladoDos && ladoDos == ladoTres) {
                System.out.println("Triángulo equilátero");
        } else 
            if (ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres) {
                System.out.println("Triángulo isósceles");
        } else {
                System.out.println("Triángulo escaleno");
                
            }
        }
    }
}


