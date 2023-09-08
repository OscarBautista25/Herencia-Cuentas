import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de Ahorros");
        System.out.println("Ingrese saldo Inicial= $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.println("Ingrese tasa de interes =");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.println("Ingrese cantidad a consignar= $");
        float cantidadDeposito = input.nextFloat();
        cuenta1.consignar(cantidadDeposito);
        System.out.println("Ingrese cantidad a retirar= $");
        float cantidadRetiro = input.nextFloat();
        cuenta1.retirar(cantidadRetiro);
        System.out.println("Ingrese cantidad a consignar= $");
        float cantidadDeposito2 = input.nextFloat();
        cuenta1.consignar(cantidadDeposito2);
        System.out.println("Ingrese cantidad a retirar= $");
        float cantidadRetiro2 = input.nextFloat();
        cuenta1.retirar(cantidadRetiro2);
        System.out.println("Ingrese cantidad a consignar= $");
        float cantidadDeposito3 = input.nextFloat();
        cuenta1.consignar(cantidadDeposito3);
        System.out.println("Ingrese cantidad a retirar= $");
        float cantidadRetiro4 = input.nextFloat();
        cuenta1.retirar(cantidadRetiro4);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        input.close();
    }
    
}
