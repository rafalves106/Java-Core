/**
 * @author falvesmac
 */

package br.com.falves.Terceiro_Exercicio;

import java.util.Optional;

public class RepositorioProdutos {
    public static Optional<String> buscarProdutos(String nome){
        if("Bateria".equals(nome)) {
            return Optional.of("Bateria Recarregável");
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        RepositorioProdutos.buscarProdutos("Bateria").ifPresent(System.out::println);

        try {
            RepositorioProdutos.buscarProdutos("Cabo").orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}