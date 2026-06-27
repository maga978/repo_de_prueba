import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in); //scaner declarado

         /*int montoinicial= 1000;
        int montoingresado;

        do {
            System.out.println("porfavor ingrese el monto que desea retirar: ");
             
             try {
                String textoIngresado = scanner.next();
                montoingresado = Integer.parseInt(textoIngresado);
                    if (montoingresado > 1000) {
                        System.out.println("el monto que desea inngrear es mayor a su saldo en cuenta: "+ montoinicial);
                    }else if (montoingresado <0) {
                        System.out.println("el monto ingresado no puede ser menor a su saldo");
                    }  
             } catch (java.lang.NumberFormatException e) {
                System.out.println("ERROR INGRESO UN DATO INVALIDO");
                montoingresado=-1;
             }
        } while ( montoingresado > 1000 || montoingresado <0);

            
        System.out.println("el monto ingresado es valido, su saldo es de : "  +  (montoinicial - montoingresado));
         */
               
//EJERCCIO 2: CALCULADORA

String [] operaciones = {"suma", "resta", "multipicacion", "divicion","salir"};
    int opcionelegida;
    
 do {
        System.out.println("por favor eliga un numero de las operaciones"); 
        for (int i = 0 ; i < operaciones.length; i ++) {
            System.out.println (i+1 +":" + operaciones[i]);  
            
        }
        try {
            String textoDelTeclado = scanner.next();//el scanner de string
                opcionelegida = Integer.parseInt(textoDelTeclado);

                if (opcionelegida <1 || opcionelegida >5) {
                    System.out.println("la operacion elegida no es valida porfavor vuelva aingresar una opcion valida: ");
                    }else{
                            int num1;
                            int num2;
                            switch (opcionelegida) {
                            case 1:
                                System.out.println("elegiste suma");
                                System.out.println("elegi un numero entero: ");

                                num1 =scanner.nextInt();// se usa para numeros enteros

                                System.out.println("elegi el segundo numero entero: ");
                                num2 = scanner.nextInt();


                                System.out.println("el resultado es: "+ (num1+num2));

                                break;
                            case 2:
                                System.out.println("elegiste resta");
                                System.out.println("elegi un numero entero");
                                 num1 =scanner.nextInt();// se usa para numeros enteros

                                System.out.println("elegi el segundo numero entero: ");
                                num2 = scanner.nextInt();


                                System.out.println("el resultado es: "+ (num1-num2));
                            break;
                            case 3:
                             System.out.println("elegiste multiplicacion");
                                System.out.println("elegi un numero entero");
                                 num1 =scanner.nextInt();// se usa para numeros enteros

                                System.out.println("elegi el segundo numero entero: ");
                                num2 = scanner.nextInt();


                                System.out.println("el resultado es: "+ (num1*num2));
                            break;
                            case 4:
                                System.out.println("elegiste divicion");
                                
                                // Primero pedimos los números
                                System.out.println("elegi un numero entero: ");
                                num1 = scanner.nextInt();
                                
                                System.out.println("elegi el segundo numero entero: ");
                                num2 = scanner.nextInt();
                                
                                // Ahora que los tenemos, controlamos que no sea cero
                                if (num2 == 0) {
                                    System.out.println("ERROR: No se puede dividir por cero.");
                                } else {
                                    System.out.println("el resultado es: " + (num1 / num2));
                                }
                                
                                break; // El break afuera, cerrando el caso felizmente
                            default:
                                break;
}  
                        }


         } catch (java.lang.NumberFormatException e) {
            System.out.println("la opcion que ingreso es invalida, porfavor vuelva a ingresar una operacion valida");
            opcionelegida = -1;
        }






 } while (opcionelegida != 5);

   
























    }
}
