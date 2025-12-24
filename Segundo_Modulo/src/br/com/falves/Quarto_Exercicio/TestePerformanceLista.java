/**
 * @author falvesmac
 */

package br.com.falves.Quarto_Exercicio;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformanceLista {
    public static void main(String[] args) {
        ArrayList<Integer> listaArray = new ArrayList<>();
        LinkedList<Integer> listaLinked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            listaArray.add(i);
            listaLinked.add(i);
        }

        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            listaArray.add(0, 999);
        }
        long tempoGasto = System.currentTimeMillis() - tempoInicio;
        System.out.println("Tempo gasto em ArrayList: " + tempoGasto + "ms");

        tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            listaLinked.add(0, 999);
        }
        tempoGasto = System.currentTimeMillis() - tempoInicio;
        System.out.println("Tempo gasto em LinkedList: " + tempoGasto + "ms");

        /*
        * O tempo gasto em um ArrayList é maior, pois para cada nova inserção no início ele tem que passar por cada elemento do array, realocando-os para a direita.
        * Já o tempo de inserção do LinkedList é menor, pois os seus elementos guardam o endereço do próximo. Seu tempo de execução é instantâneo, pois somente altera os ponteiros. */
    }
}