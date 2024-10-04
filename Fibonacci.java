
public class Fibonacci {

    public static void main(String[] args) {
        
        long numUno = 0;
        long numDos = 1;
        long numSostener = 0;

        System.err.print("( ");
        for (int i = 2; i <= 50; i++) {

            System.out.print(numUno + ", ");
            numSostener = numUno + numDos;
            numUno = numDos;
            numDos = numSostener;
        }
        System.err.print(")");
    }
}