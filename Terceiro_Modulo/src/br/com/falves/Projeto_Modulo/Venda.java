/**
 * @author falvesmac
 */

package br.com.falves.Projeto_Modulo;

public class Venda {
    private int id;
    private String nomeCliente;
    private double valor;
    private Status_Venda status;

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public Status_Venda getStatus() {
        return status;
    }

    public Venda(int id, String nomeCliente, double valor, Status_Venda status) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda id: " + id + " | Nome do Cliente: " + nomeCliente + "\n" +
                "Valor: R$" + valor + " | Status: " + status;
    }
}