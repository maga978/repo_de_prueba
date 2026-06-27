import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola usuario");
            Scanner sc = new Scanner(System.in);

 //EJERCCIO MOSTRANDO EL NUMERO AL USUARIO

       /*int num;
        System.out.println("ingrese un numero por favor: ");
        num= sc.nextInt();
        System.out.println("el numero ingresado es: "+num);*/

//FIN DEL EJERCICIO


//EJERCCIO PARA PEDIR EDAD AL USUSARIO Y MOSTRAR SU EDAD UN AÑO DESPUES

System.out.println("ingrse su edad: ");
int edad;
edad= sc.nextInt();
edad= edad + 1;
System.out.println("su edad el proximo año sera: " + edad+" años");

//FIN DEL EJERCICIO





    }
}
