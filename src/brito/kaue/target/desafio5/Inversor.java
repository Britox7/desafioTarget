package brito.kaue.target.desafio5;

public class Inversor {
    public static String inverter(String original) {
        StringBuilder invertida = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida.append(original.charAt(i));
        }

        return invertida.toString();
    }
}

