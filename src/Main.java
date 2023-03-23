import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pre1, pre2, pre3;
        int cant1, cant2, cant3;

        System.out.println("Ingrese el precio del articulo 1:");
        pre1 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida del articulo 1:");
        cant1 = scanner.nextInt();
        System.out.println("Ingrese el precio del articulo 2:");
        pre2 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida del articulo 2:");
        cant2 = scanner.nextInt();
        System.out.println("Ingrese el precio del articulo 3:");
        pre3 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida del articulo 3:");
        cant3 = scanner.nextInt();

        double sub1 = pre1*cant1;
        double sub2 = pre2*cant2;
        double sub3 = pre3*cant3;

        double total = sub1+sub2+sub3;

        System.out.println("El total de la factura es de $"+total);


    }
}