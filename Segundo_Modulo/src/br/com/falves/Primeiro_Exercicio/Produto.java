/**
 * @author falvesmac
 */

package br.com.falves.Primeiro_Exercicio;

import java.util.HashSet;
import java.util.Objects;

public class Produto {
    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public static void main(String[] args) {
        Produto p = new Produto(1L, "TV");
        Produto p1 = new Produto(1L, "TV");

        HashSet<Produto> hashSet = new HashSet<>();
        hashSet.add(p);
        hashSet.add(p1);

        System.out.println(hashSet.size());

        /* Foi impresso o tamanho 2 no HashSet inicias.
        Pois sem o equals() e hashCode() os objetos poderiam ter atributos idênticos.
        Após a adição dos dois métodos de comparação.
        O HashSet que antes via 2 objetos diferentes, agora percebe que os mesmos objetos são o mesmo.
        Pois ele percebe os atributos iguais pelo equals() e hashCode().
        HashSet não permite a adição de objetos duplicados.*/
    }
}