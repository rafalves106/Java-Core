/**
 * @author falvesmac
 */

package br.com.falves.Terceiro_Exercicio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Agendamento {
    private LocalDateTime dataHora;

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = LocalDateTime.parse(dataHora);
    }

    public Agendamento(String dataHora){
        setDataHora(dataHora);
    }

    public void contarDias(){
        LocalDateTime dataHoje = LocalDateTime.now();
        long diferenca = ChronoUnit.DAYS.between(dataHoje, this.getDataHora());
        System.out.println("Dias até o agendamento: " + diferenca);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data do agendamento: ");
        String dataHora = sc.nextLine();

        Agendamento agendamento = new Agendamento(dataHora);
        agendamento.contarDias();
    }
}