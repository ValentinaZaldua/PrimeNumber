import java.util.Scanner;

public class numberPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el numero del cual desea saber si es o no primo: ");
        int n = sc.nextInt();
        
        primeNumber(n);
        
        sc.close(); 
    }

    public static void primeNumber(int n) {
        boolean prime = true; 
        for(int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("El número es primo.");
        else
            System.out.println("El número no es primo.");
    }
    	
    	/* Scanner scanner = new Scanner(System.in);
         System.out.print("Ingresa un número entero positivo: ");
         int numero = scanner.nextInt();
         scanner.close();
         
         System.out.println("Los factores primos de " + numero + " son:");
         factorizarPrimos(numero);
     }

     public static void factorizarPrimos(int numero) {
         for (int i = 2; i <= numero; i++) {
             while (numero % i == 0) {
                 System.out.print(i + " ");
                 numero /= i;
             }
         }
     }*/

}