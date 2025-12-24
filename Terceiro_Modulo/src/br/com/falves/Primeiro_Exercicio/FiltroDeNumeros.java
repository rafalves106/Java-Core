/**
 * @author falvesmac
 */

package br.com.falves.Primeiro_Exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroDeNumeros {
    private final List<Integer> lista;

    public FiltroDeNumeros(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> filtraPares(){
        return this.lista.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filtraImpares(){
        return this.lista.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        FiltroDeNumeros fn = new FiltroDeNumeros(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        sb.append("Números pares da lista: \n");
        fn.filtraPares().forEach(num -> sb.append(num).append("\n"));
        System.out.println(sb);

        sb.setLength(0);

        sb.append("Números ímpares da lista: \n");
        fn.filtraImpares().forEach(num -> sb.append(num).append("\n"));
        System.out.println(sb);

        sb.setLength(0);

        sb.append("Lista inicial: \n");
        fn.lista.forEach(num -> sb.append(num).append("\n"));
        System.out.println(sb);
    }
}