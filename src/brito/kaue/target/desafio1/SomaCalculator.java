package brito.kaue.target.desafio1;

class SomaCalculator {
    public int calcularSoma(int indice) {
        int soma = 0;
        int k = 0;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        return soma;
    }
}