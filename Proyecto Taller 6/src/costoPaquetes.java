
import java.util.Scanner;

public class costoPaquetes {
    public static void main(String[] args) {
        double peso, costoEnvio;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME EL PESO DEL PAQUETE EN KILOGRAMOS: ");
        peso = tcl.nextDouble();
        System.out.println("DAME LA REGION (local/nacional/internacional): ");
        region = tcl.next();
        if (peso < 5 && region.equals("local")) {
            costoEnvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costoEnvio = 10;
        } else {
            costoEnvio = 15;
        }
        System.out.printf("EL COSTO DEL ENVIO DEL PAQUETE ES DE: " + costoEnvio + "$");
        
    }
}
