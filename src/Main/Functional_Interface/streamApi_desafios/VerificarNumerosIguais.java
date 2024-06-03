package Main.Functional_Interface.streamApi_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Desafio 18 - Verifique se todos os números da lista são iguais:
// Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

public class VerificarNumerosIguais {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        if (todosIguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Nem todos os números da lista são iguais.");
        }
    }
}
