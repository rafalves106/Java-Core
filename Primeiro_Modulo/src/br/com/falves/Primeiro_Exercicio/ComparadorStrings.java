/**
 * @author falvesmac
 */

package br.com.falves.Primeiro_Exercicio;

public class ComparadorStrings {

    public void simpleCompare(String a, String b){
        System.out.println("Comparando com ==");
        if (a == b){
            System.out.println("EQUALS.");
        } else {
            System.out.println("DIFFER.");
        }
    }

    public void equalsCompare(String a, String b){
        System.out.println("Comparando com .equals()");
        if(a.equals(b)){
            System.out.println("EQUALS.");
        } else {
            System.out.println("DIFFER.");
        }
    }

    public static void main(String[] args) {
        ComparadorStrings comparadorStrings = new ComparadorStrings();

        String lit1 = "texto";
        String lit2 = "texto";

        String new1 = new String("texto");
        String new2 = new String("texto");

        comparadorStrings.simpleCompare(lit1, new1);
        /** RESULTADO: DIFFER // Falso, os dois objetos não são iguais.
         * Dessa forma estamos validando se os dois objetos são o mesmo.
         * No java existe o String Pool, é uma área da memória Heap do Java, que contém textos já prontos.
         * Então ao fazer String lit1 = "texto"; o Java procura esse texto na sua String Pool e aponta o lit1 para ele.
         * Já quando se faz o uso de new String, o Java cria um novo objeto String na memória heap.
         * Assim new1 aponta para outra referência.
         */

        comparadorStrings.equalsCompare(lit1, new1);
        /** RESULTADO: EQUALS // TRUE as duas Strings são iguais.
         * Dessa forma estamos validando se o conteúdo dos objetos é o mesmo, no caso sim.
         * */

        comparadorStrings.simpleCompare(lit1, lit2);
        /** RESULTADO: EQUALS // Verdadeiro, os dois objetos são iguais.
         * Dessa forma estamos validando se os dois objetos são o mesmo.
         * O String Pool está apontando os dois objetos para a mesma referência em sua piscina de strings.
         */

        comparadorStrings.equalsCompare(lit1, lit2);
        /** RESULTADO: EQUALS // TRUE as duas Strings são iguais.
         * Dessa forma estamos validando se o conteúdo dos objetos é o mesmo, no caso sim.
         * */

        comparadorStrings.simpleCompare(new1, new2);
        /** RESULTADO: DIFFER // Verdadeiro, os dois objetos são diferentes.
         * Dessa forma estamos validando se os dois objetos são o mesmo.
         * A palavra-chave new força a criação de dois novos objetos na memória Heap.
         * Dessa forma eles são objetos diferentes.
         */

        comparadorStrings.equalsCompare(new1, new2);
        /** RESULTADO: EQUALS // TRUE as duas Strings são iguais.
         * Dessa forma estamos validando se o conteúdo dos objetos é o mesmo, no caso sim.
         * */
    }
}