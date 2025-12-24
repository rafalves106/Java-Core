/**
 * @author falvesmac
 */

package br.com.falves.Terceiro_Exercicio;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private final Map<String, Integer> estoqueAtual = new HashMap<>();

    public void adicionarProduto(String produto, int quantidade){
        estoqueAtual.put(produto, quantidade);
    }

    public void removerProduto(String produto, int quantidade) throws EstoqueInsuficienteException, ProdutoNaoEncontradoException {
        if (!estoqueAtual.containsKey(produto)) {
            throw new ProdutoNaoEncontradoException("Produto não encontrado: " + produto);
        }

        int quantidadeDisponivel = estoqueAtual.get(produto);

        if (quantidade > quantidadeDisponivel){
            throw new EstoqueInsuficienteException("Tentativa de retirada: " + quantidade + ". Quantidade disponível: " + quantidadeDisponivel);
        }

        estoqueAtual.put(produto, quantidadeDisponivel - quantidade);
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.adicionarProduto("Leite", 20);

        try {
            inventario.removerProduto("Leite", 20);
        } catch (ProdutoNaoEncontradoException p){
            System.out.println("Erro: " + p.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao tentar remover produto: " + e.getMessage());
        }

        try {
            inventario.removerProduto("Maçã", 10);
        } catch (ProdutoNaoEncontradoException p){
            System.out.println("Erro: " + p.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao tentar remover produto: " + e.getMessage());
        }
    }
}