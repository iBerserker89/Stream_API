package Main.Functional_Interface.streamApi_desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 3 - Verifique se todos os números da lista são positivos:
//Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.



public class VerificaNumerosPositivos {

    public static void main(String[] args) {
        List<Integer> numeros1 = Arrays.asList(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeros2 = Arrays.asList(-5,-3,-1,0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

      boolean resultado1 = numeros1.stream()
                .allMatch(n -> n >= 0);

        boolean resultado2 = numeros2.stream()
                .allMatch(n -> n >= 0);

        System.out.println("Todos os itens da lista numeros1 são positivos? " + resultado1);

        System.out.println("Todos os itens da lista numeros2 são positivos? " + resultado2);
    }
}
