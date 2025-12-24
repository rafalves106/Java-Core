/**
 * @author falvesmac
 */

package br.com.falves.Segundo_Exercicio;

public class StringBuilderTest {
    public void concatena(){
        long inicio = System.currentTimeMillis();
        System.out.println("Concatenando com +=");
        String str = "";

        for(int i = 0; i < 100000; i++){
            str += "a";
        }
        long fim = System.currentTimeMillis();
        long duracao = fim - inicio;
        System.out.println("Tempo de execução do método em milissegundos: " + duracao + "ms.");
    }

    public void concatenaComBuilder(){
        long inicio = System.currentTimeMillis();
        System.out.println("Concatenando com StringBuilder");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 100000; i++){
            stringBuilder.append("a");
        }
        long fim = System.currentTimeMillis();
        long duracao = fim - inicio;
        System.out.println("Tempo de execução do método em milissegundos: " + duracao + "ms.");
    }

    public static void main(String[] args) {
        StringBuilderTest test = new StringBuilderTest();

        test.concatena();
        System.out.println("-----------------------------");
        test.concatenaComBuilder();
    }
}