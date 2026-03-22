import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa salario bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Ingresa porcentaje de impuestos: ");
        double porcentaje = sc.nextDouble();

        System.out.print("Ingresa deducciones adicionales: ");
        double deducciones = sc.nextDouble();

        double impuesto = salarioBruto * (porcentaje / 100);
        double salarioNeto = salarioBruto - impuesto - deducciones;

        System.out.println("Impuesto: " + impuesto);
        System.out.println("Salario Neto: " + salarioNeto);
    }
}