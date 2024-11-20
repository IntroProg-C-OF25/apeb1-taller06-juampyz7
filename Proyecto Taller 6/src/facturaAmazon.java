
import java.util.Scanner;

public class facturaAmazon {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoProd1, costoProd2, costoEnvio, iva, descuento, subtotal, costoFinal;
        System.out.print("DAME TRES COSTOS (2 DE PRODUCTOS + 1 DE ENVIO): ");
        costoProd1 = tcl.nextDouble();
        costoProd2 = tcl.nextDouble();
        costoEnvio = tcl.nextDouble();
        iva = (costoProd1 + costoProd2) * 0.10;
        subtotal = iva + (costoProd1 + costoProd2);
        descuento = subtotal * 0.05;
        if (subtotal > 1000) {
            descuento = subtotal * 0.2;
        costoFinal = subtotal - descuento + costoEnvio;
        System.out.println("El costo final es de: " + costoFinal);
        } else {
            if (subtotal > 5000) {
            descuento = (subtotal * 0.2);
        }
        costoEnvio = 0;
        costoFinal = subtotal - descuento + costoEnvio;
        System.out.print("El costo final es: " + costoFinal);
        

    }
  }
}
