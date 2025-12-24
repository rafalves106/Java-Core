/**
 * @author falvesmac
 */

package br.com.falves.Projeto_Modulo;

import java.time.LocalDateTime;

public class TextAnalyzer {
    private LocalDateTime analysisTime;
    private String text;

    public LocalDateTime getAnalysisTime() {
        return analysisTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextAnalyzer(String text) {
        this.text = text;
        this.analysisTime = LocalDateTime.now();
    }

    public String cleanText() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.text);

        for(int i = sb.length() - 1; i >= 0; i--){
            if (sb.charAt(i) == '!' || (sb.charAt(i) == '.' || (sb.charAt(i) == ',' || (sb.charAt(i) == '?')))){
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }

    public Integer countWords() {
        String[] splitted = this.text.split(" ");

        return splitted.length;
    }

    public String reverseText() {
        StringBuilder sb = new StringBuilder();
        for(int i = this.text.length() - 1; i >= 0; i--){
            sb.append(this.text.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        TextAnalyzer ta = new TextAnalyzer("A Programação Orientada a Objetos (POO), é o pilar de TUDO no desenvolvimento moderno! No entanto, ela exige dedicação, pois o domínio de conceitos como Polimorfismo e Encapsulamento não vem da noite para o dia. Será que o meu código está limpo? Pense nisso. O Java Core, por sua vez, garante a performance. Sempre use StringBuilder, nunca String, em loops! Ah, e cuidado com os NullPointerExceptions...");
        System.out.println("Momento de criação do objeto: " + ta.getAnalysisTime());
        System.out.println("Texto limpo de pontuações: " + ta.cleanText());
        System.out.println("Contagem de palavras do texto: " + ta.countWords());
        System.out.println("Texto invertido: " + ta.reverseText());
    }
}