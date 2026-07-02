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

/*System.out.println("ingrse su edad: ");
int edad;
edad= sc.nextInt();
edad= edad + 1;
System.out.println("su edad el proximo año sera: " + edad+" años");*/

//FIN DEL EJERCICIO

//APLICACION QUE CALCULE LA MEDIA ARITMETICA DE DOS NOTAS ENTERAS. LA MEDIA PUEDE CONTENER DECIMALES.

/*int nota1, nota2;
double media;
System.out.print("ingrese la primera nota: ");
nota1= sc.nextInt();
System.out.print("ingrese la segunda nota: ");
nota2= sc.nextInt();
media= (nota1 + nota2) / 2.0;
System.out.println("la media es: "+ media);
//FIN DEL EJERCICIO*/

//PROGRAMA QUE PIDE COMO ENTRADA UN NUMERO DECIMAL Y LO MUESTRE REDONDEADO AL ENTERO MÁS PROXIMO

/*double num;
int redondeo;
System.out.print("ingresa un numero decimal: ");
num = sc. nextDouble();
redondeo = (int) (num + 0.5);
System.out.print(num + "el numero redondeado es: " + redondeo);*/

//FIN DEL EJERCICIO

//UN FRUTERO NECESITA CALCULAR LOS BENEFIIOS ANUALES QUE OBTIENE DE LA VENTA DE MANZANAS UU PERAS
/*double preciomanzana=2.35;
double preciopera=1.95;

int manzanaT1, manzanaT2,manzanaT3,manzanaT4;
int peraT1,peraT2,peraT3,peraT4;

double importetotal;
 
System.out.print("venta de la manzanas: ");
System.out.print("para el primer trimestre fue: ");
manzanaT1= sc.nextInt();
System.out.print("para el segundo trimestre fue: ");
manzanaT2= sc.nextInt();
System.out.print("para el trimestre trimestre fue: ");
manzanaT3= sc.nextInt();
System.out.print("para el cuarto trimestre fue: ");
manzanaT4= sc.nextInt();

System.out.print("venta para las peras: ");
System.out.print("para el primer trimestre fue: ");
peraT1=sc.nextInt();
System.out.print("para el segundo trimestre fue: ");
peraT2=sc.nextInt();
System.out.print("para el tercer trimestre fue: ");
peraT3=sc.nextInt();
System.out.print("para el cuarto trimestre fue: ");
peraT4=sc.nextInt();

importetotal= (manzanaT1+manzanaT2+manzanaT3+manzanaT4)*preciomanzana;
importetotal = (peraT1+peraT2+peraT3+peraT4)*preciopera;

System.out.println("la venta de las manzanas y peras en el año fue: " + importetotal +  " pesos");*/
//FIN DEL EJERCICIO

//CALCULE LA LONGITUD Y EL AREA DE UNA CIRCUNFERENCIA.EL USUSARIO DEBE INTRODUCIR EL RADIO

/*double pi= 3.14;
double area;
double radio,longitud ;

System.out.print("Ingrese el radio: ");
radio  = sc.nextDouble(); 
longitud= 2*pi*radio;
area= pi*radio*radio;
 System.out.print("La longitud del circulo es: "+ longitud);
 System.out.print("El area de la circunferencia es: "+ area);
*/
//FIN DEL AJERCCIO

//CONTABILIZADOR DE NUMEROS DE PATAS DE ESPECIES CAPTURADOS
/*int hormigas=6;
int arañas=8;
int cochinilla=14;

int hormigacap;
int arañacap;
int cochinillacap;

System.out.print("ingrese cuantas hormigas capturaron el dia de hoy: ");
hormigacap= sc.nextInt();
System.out.print("ingrese cuantas arañas capturaron el dia de hoy: ");
arañacap= sc.nextInt();
System.out.print("ingrese cuantas cochinillas capturaron el dia de hoy: ");
cochinillacap= sc.nextInt();

System.out.println("el numero total de patas capturadas hoy es: "+ ((hormigas*hormigacap)+(arañas*arañacap)+(cochinilla*cochinillacap)) );
*/

//programa que muestre el residuo del numero 7 para saber cuanto falta para que sea ede multiplo 7
int numeroingresado;    

System.out.print("Ingrese un número entero: ");
numeroingresado = sc.nextInt(); 


int residuo = numeroingresado % 7; 

System.out.println("El residuo de la división es: " + residuo);
        
 System.out.print("se tiene que sumar: "+(7-residuo)+" para que de multiplo de 7" );





















    }
}
