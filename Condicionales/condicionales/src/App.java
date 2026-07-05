import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc =new Scanner (System.in);



       // DISEÑAR UNA APLICACIÓN QUE SOLICITE AL USUARIO UN NÚMERO E INDIQUE SI ES PAR O IMPAR

int num;
System.out.print("introduzca un numero: ");
num = sc.nextInt();

if (num % 2 == 0) {
    System.out.println("el numero es par");
} else {
    System.out.println("el numero es impar");
}












































    }
}
