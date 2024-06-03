package Main.Functional_Interface.streamApi_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

public class EncontrarSomaDosQuadrados {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeroAoQuadrado = numeros.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(numeroAoQuadrado);

      Integer somaDosQuadrados = numeroAoQuadrado.stream()
              .reduce(0, Integer::sum);

        System.out.println("O resultado da soma dos números ao quadrado é: " + somaDosQuadrados);
    }
}