package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionario está vazia.");
        }
    }
    public void exibirPalavras(){
        if(!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionario está vazia.");
        }
    }
    public String pesquisarPorPalavra(String palavra){
        String definicao = null;
        if (!dicionario.isEmpty()) {
            definicao = dicionario.get(palavra);
            if (definicao == null) {
                System.out.println("Palavra não encontrada no dicionario.");
            }
        } else {
            System.out.println("O dicionario está vazia.");
        }
        return definicao;
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}