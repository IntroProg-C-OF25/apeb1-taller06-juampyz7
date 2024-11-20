
import java.util.Scanner;

public class determinarOperacion {
    public static void main(String[] args) {
         int numeroOperacion;
        String tipoOperacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO DEL 1 AL 4 QUE REPRESENTE UNA OPERACION MATEMATICA:");
        System.out.print("1: Suma");
        System.out.print("2: Resta");
        System.out.print("3: Multiplicación");
        System.out.print("4: División");
        numeroOperacion = tcl.nextInt();
        switch (numeroOperacion) {
            case 1:
                tipoOperacion = "Suma";
                break;
            case 2:
                tipoOperacion = "Resta";
                break;
            case 3:
                tipoOperacion = "Multiplicación";
                break;
            case 4:
                tipoOperacion = "División";
                break;
            default:
                tipoOperacion = "Operación no válida";
                break;
        }
        System.out.println("LA OPERACION QUE HA SIDO SELECCIONADA ES: " + tipoOperacion);
        

    }
}
