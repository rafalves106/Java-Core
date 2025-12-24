/**
 * @author falvesmac
 */

package br.com.falves.Projeto_Modulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AnaliseDados {
    private final List<Venda> listaDeVendas;

    public AnaliseDados() {
        listaDeVendas = new ArrayList<>();

        listaDeVendas.add(new Venda(1, "Pedro", 112.10, Status_Venda.PROCESSANDO));
        listaDeVendas.add(new Venda(2, "Carla", 242, Status_Venda.CANCELADO));
        listaDeVendas.add(new Venda(3, "Henrique", 50.90, Status_Venda.CANCELADO));
        listaDeVendas.add(new Venda(4, "Thiago", 800.99, Status_Venda.APROVADO));
        listaDeVendas.add(new Venda(5, "Otávio", 150.89, Status_Venda.PROCESSANDO));
        listaDeVendas.add(new Venda(6, "Carla", 730.01, Status_Venda.APROVADO));
        listaDeVendas.add(new Venda(7, "Jesus", 89.99, Status_Venda.APROVADO));
        listaDeVendas.add(new Venda(8, "Henrique", 35.45, Status_Venda.PROCESSANDO));
        listaDeVendas.add(new Venda(9, "Juliana", 43, Status_Venda.CANCELADO));
    }

    public List<Venda> filtrarAprovadas(double valorMinimo){
        return listaDeVendas.stream()
                .filter(venda -> venda.getStatus().equals(Status_Venda.APROVADO) && venda.getValor() >= valorMinimo)
                .toList();
    }

    public List<String> buscarNomeClientes(){
        return listaDeVendas.stream()
                .map(Venda::getNomeCliente)
                .distinct()
                .toList();
    }

    public Optional<Venda> buscarVendaPorId(int id){
        return listaDeVendas.stream()
                .filter(venda -> venda.getId() == id)
                .findFirst();
    }

    public double calcularTotalVendasAprovadas(){
        return listaDeVendas.stream()
                .filter(venda -> venda.getStatus().equals(Status_Venda.APROVADO))
                .mapToDouble(Venda::getValor)
                .sum();
    }

    public static void main(String[] args) {
        AnaliseDados analiseDados = new AnaliseDados();
        StringBuilder sb = new StringBuilder();

        sb.append("Vendas Aprovadas: ");
        analiseDados.filtrarAprovadas(50)
                .forEach(venda -> sb.append(venda).append("\n-------------------"));

        System.out.println(sb);
        sb.setLength(0);

        sb.append("Nome dos clientes com vendas cadastradas: \n");
        analiseDados.buscarNomeClientes()
                .forEach(venda -> sb.append(venda).append(" | "));

        sb.append("\n------------------");
        System.out.println(sb);
        sb.setLength(0);

        sb.append("Buscar venda existente: \n");
        sb.append(
                analiseDados.buscarVendaPorId(1)
                        .map(Venda::toString)
                        .orElse("Produto não encontrado.")
        );

        sb.append("\n------------------");
        System.out.println(sb);
        sb.setLength(0);

        sb.append("Buscar venda inexistente: \n");
        sb.append(
                analiseDados.buscarVendaPorId(11)
                        .map(Venda::toString)
                        .orElse("Produto não encontrado.")
        );

        sb.append("\n------------------");
        System.out.println(sb);
        sb.setLength(0);

        sb.append("Total em vendas: ");
        sb.append(analiseDados.calcularTotalVendasAprovadas());

        System.out.println(sb);
        sb.setLength(0);
    }
}