/**
 * @author falvesmac
 */

package br.com.falves.Segundo_Exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformadorDeStrings {
    private final List<String> list;

    public TransformadorDeStrings(List<String> list) {
        this.list = list;
    }

    public List<String> transformaEmMaiusculo(){
        return this.list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        TransformadorDeStrings ts = new TransformadorDeStrings(Arrays.asList("iphone", "macbook", "monitor"));
        StringBuilder sb = new StringBuilder();

        sb.append("Lista Original: \n");
        ts.list.forEach(s -> sb.append(s).append("\n"));
        System.out.println(sb);

        sb.setLength(0);

        sb.append("Lista em Maísculo: \n");
        ts.transformaEmMaiusculo().forEach(s -> sb.append(s).append("\n"));
        System.out.println(sb);
    }
}