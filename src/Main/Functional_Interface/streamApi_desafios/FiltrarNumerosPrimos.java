package Main.Functional_Interface.streamApi_desafios;

import java.util.Arrays;
import java.util.List;


// Desafio 17 - Filtrar os números primos da lista:
// Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

public class FiltrarNumerosPrimos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primosList = numeros.stream()
                .distinct()
                .filter(EncontrarMaiorPrimo::ePrimo)
                .toList();

        System.out.println("Os números primos da lista são: " + primosList);
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
