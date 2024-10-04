public class Ejercicio_FizzBuzz {
    public static void main(String[] args) {

        /*El codigo escribe fizz si el numero es multilpo de de 3*/
        /*buzz si es multiplo de 5*/
        /*y fizzbuzz si es multiplo de ambos*/

    for (int i = 1; i <= 100; i ++){

            System.out.print(i + " ");

            if (0 == (i % 3)){
                System.out.print("fizz");
            }

            if (0 == (i % 5)){
                System.out.print("buzz");
            }
            
            System.out.println("");

        }
    }
}