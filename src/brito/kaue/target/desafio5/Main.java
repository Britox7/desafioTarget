package brito.kaue.target.desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String original = scanner.nextLine();

        String invertida = Inversor.inverter(original);

        System.out.println("A string invertida é: " + invertida);

        scanner.close();
    }
}
