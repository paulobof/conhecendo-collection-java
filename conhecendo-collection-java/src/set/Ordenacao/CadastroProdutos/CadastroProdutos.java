package set.Ordenacao.CadastroProdutos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    Set<Produto> cadastroProduto;

    public CadastroProdutos() {
        this.cadastroProduto = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        cadastroProduto.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        if (!cadastroProduto.isEmpty()) {
            Set<Produto> produtosPorNome = new TreeSet<>(cadastroProduto);
            return produtosPorNome;
        } else {
            throw new RuntimeException("O set está vazio");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        if (!cadastroProduto.isEmpty()) {
            Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(cadastroProduto);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O set está vazio");
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println(cadastroProdutos.cadastroProduto);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
