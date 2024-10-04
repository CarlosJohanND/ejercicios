
import java.util.Scanner;
public class Ejercicico_Primos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("escriba un numero para saber si es primo");
        int numUsuario = scanner.nextInt();
        double analisys = 0;
        int contador = 0;

        for (int i = 1; i <= numUsuario; i++){

            analisys = numUsuario % i;
            if(analisys == 0){
                contador = contador + 1;
            }
        }
        if (contador == 2){
            System.out.println(numUsuario + " es primo");
        }else{
            System.out.println(numUsuario + " no es primo");
        }
        contador = 0;

        System.out.println("numeros primos del 1 al 100");
        for (int i = 1; i <= 100; i++){

            for(int j = 1; j <= i; j++){
                analisys = i % j;
                if(analisys == 0){
                    contador = contador + 1;
                }
            }
            if (contador == 2){
                System.out.println(i + " es primo");
            }
            contador = 0;
        }
    }
}
