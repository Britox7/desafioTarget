package brito.kaue.target.desafio2;
public class Fibonacci {
    public static boolean verificarFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= numero) {
            if (primeiro == numero) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return false;
    }
}