/*
2. Leer un número N y calcular el factorial de los números desde 0 hasta N.
 */
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Introduce un número mayor a 0: ");
            N = sc.nextInt();
        }while(N<0);
        for(int i = 0; i <= N ; i++){
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }
    }

}
