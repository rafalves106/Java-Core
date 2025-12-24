/**
 * @author falvesmac
 */

package br.com.falves.Projeto_Modulo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorEscolar {
    private final Map<Aluno, List<Double>> alunos = new HashMap<>();

    private List<Double> buscarListaNotas(String matricula) {
        long matriculaLong = Long.parseLong(matricula);
        Aluno chaveBusca = new Aluno("", matriculaLong);

        if (!alunos.containsKey(chaveBusca)) {
            throw new IllegalArgumentException("Aluno não encontrado com a matrícula: " + matricula);
        }

        return alunos.get(chaveBusca);
    }

    public void adicionarAluno(Aluno aluno){

        if (alunos.containsKey(aluno)) {
            throw new AlunoDuplicadoException("Já existe aluno com a matrícula informada.");
        }

        alunos.computeIfAbsent(aluno, n -> new ArrayList<>());
    }

    public void adicionarNota(String matricula, double nota) {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("Nota inválida: " + nota);
        }

        List<Double> notasAluno = buscarListaNotas(matricula);
        notasAluno.add(nota);

        System.out.println("Nota " + nota + " adicionada.");
    }

    public double calcularMedia(String matricula) {
        List<Double> notas = buscarListaNotas(matricula);

        if (notas.isEmpty()) {
            return 0.0;
        }

        double totalNotas = 0;
        for (Double n : notas) {
            totalNotas += n;
        }

        return totalNotas / notas.size();
    }

    public static void main(String[] args) {
        GerenciadorEscolar sistema = new GerenciadorEscolar();
        Aluno a1 = new Aluno("Marcos", 1);

        System.out.println("--- TESTE 1: Fluxo Normal ---");
        sistema.adicionarAluno(a1);
        sistema.adicionarNota("1", 8.5);
        sistema.adicionarNota("1", 9.0);
        System.out.println("Média: " + sistema.calcularMedia("1"));

        System.out.println("\n--- TESTE 2: Nota Inválida ---");
        try {
            sistema.adicionarNota("1", 15.0);
        } catch (NotaInvalidaException e) {
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }

        System.out.println("\n--- TESTE 3: Aluno Duplicado ---");
        try {
            sistema.adicionarAluno(new Aluno("Marcos Clone", 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }
    }
}