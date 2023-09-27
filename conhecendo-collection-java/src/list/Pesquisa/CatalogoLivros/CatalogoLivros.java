package list.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> listaLivro;

    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivro.isEmpty()) {
            for(Livro l : listaLivro) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!listaLivro.isEmpty()) {
            for(Livro l : listaLivro) {
                if(l.getAnoDePublicacao() >= anoInicial &&l.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo =null;
        if(!listaLivro.isEmpty()) {
            for(Livro l : listaLivro) {
                if (l.getTitulo().equals(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros  = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));

    }
}
