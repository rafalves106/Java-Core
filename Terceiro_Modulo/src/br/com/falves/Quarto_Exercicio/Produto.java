/**
 * @author falvesmac
 */

package br.com.falves.Quarto_Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        produtos.add(new Produto("Notebook", 2500));
        produtos.add(new Produto("Mouse", 50));
        produtos.add(new Produto("Teclado", 100));

        sb.append("Valor total dos produtos: ");
        sb.append("$").append(produtos.stream()
                .mapToDouble(Produto::getPreco).sum());

        System.out.println(sb);

        sb.setLength(0);

        sb.append("Valor médio dos produtos: ");
        OptionalDouble optional = produtos.stream()
                .mapToDouble(Produto::getPreco).average();

        if (optional.isPresent()) {
            sb.append("$").append(optional.getAsDouble());
        } else {
            sb.append("Nenhum valor encontrado.");
        }

        System.out.println(sb);
    }
}