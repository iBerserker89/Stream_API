package Main.Functional_Interface.streamApi_desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

public class VerificarNumeroMaiorQueDez {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 4, 3);

        boolean verificador =numeros.stream().anyMatch(n -> n > 10);

        System.out.println(verificador);

        numeros.stream().filter(n -> n > 10).forEach(System.out::println);


    }
}
