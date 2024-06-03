package Main.Functional_Interface.streamApi_desafios;

import java.util.*;

// Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

public class EncontrarMaiorPrimo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt maiorPrimo = numeros.stream()
                .filter(EncontrarMaiorPrimo::ePrimo)
                .mapToInt(Integer::intValue)
                .max();

        maiorPrimo.ifPresentOrElse(
                num -> System.out.println("O maior número primo é: " + num),
                () -> System.out.println("Nenhum número primo encontrado.")
        );
    }


    public static boolean ePrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
