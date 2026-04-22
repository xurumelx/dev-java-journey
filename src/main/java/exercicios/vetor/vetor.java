package exercicios.vetor;

import java.util.Arrays;

public class vetor {
    public static void main(String[] args) {

        int[] ListaDeNumeros = {5, 99, 42, 17, 63, 8, 74, 29, 91, 12, 56, 3, 88, 34, 70};

        // MÉDIA
        int soma = 0;
        for (int i = 0; i < ListaDeNumeros.length; i++){
            soma += ListaDeNumeros[i];
        }
        double media = (double) soma / ListaDeNumeros.length;
        System.out.printf("Média dos valores: %.2f%n", media);

        // MAIOR VALOR
        int maiorValor = ListaDeNumeros[0];
        for(int y = 0; y < ListaDeNumeros.length; y++){
            if(maiorValor < ListaDeNumeros[y]){
                maiorValor = ListaDeNumeros[y];
            }
        }
        System.out.println("Maior valor do vetor: " + maiorValor);

        // MENOR VALOR
        int menorValor = ListaDeNumeros[0];
        for(int x = 0; x < ListaDeNumeros.length; x++){
            if(menorValor > ListaDeNumeros[x]){
                menorValor = ListaDeNumeros[x];
            }
        }
        System.out.println("Menor valor: " + menorValor);

        // MEDIANA
        double mediana;
        int tamanho = ListaDeNumeros.length;

        Arrays.sort(ListaDeNumeros);
        System.out.println("Vetor ordenado: " + Arrays.toString(ListaDeNumeros));

        if(tamanho % 2 == 0){
            mediana = (ListaDeNumeros[tamanho/2 - 1] + ListaDeNumeros[tamanho/2]) / 2.0;
            System.out.println("Mediana par: " + mediana);
        } else {
            mediana = ListaDeNumeros[tamanho/2];
            System.out.println("Mediana ímpar: " + mediana);
        }
    }
}