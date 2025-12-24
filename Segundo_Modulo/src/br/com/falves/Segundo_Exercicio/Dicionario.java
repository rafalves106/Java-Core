/**
 * @author falvesmac
 */

package br.com.falves.Segundo_Exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dicionario {
    private final Map<String, List<String>> dicionarioDeSinonimos = new HashMap<>();

    public void adicionarSinonimo(String palavra, String sinonimo) {
        dicionarioDeSinonimos.computeIfAbsent(palavra, s -> new ArrayList<>()).add(sinonimo);
    }

    public List<String> buscarSinonimos(String palavra) {
        return dicionarioDeSinonimos.getOrDefault(palavra, List.of());
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarSinonimo("Inteligente", "esperto");

        System.out.println(dicionario.buscarSinonimos("Inteligente"));

        dicionario.adicionarSinonimo("Inteligente", "sagaz");

        System.out.println(dicionario.buscarSinonimos("Inteligente"));

        dicionario.adicionarSinonimo("Inteligente", "brilhante");

        System.out.println(dicionario.buscarSinonimos("Inteligente"));

        System.out.println(dicionario.buscarSinonimos("Vivo"));
    }
}