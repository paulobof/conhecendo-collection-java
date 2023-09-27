package list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atritubo
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }
    public int calcularSoma() {
        int soma=0;
        for(Integer numero : listaNumeros)
            soma += numero;
        return soma;
    }
    public int encontrarMaiorNumero() {
        if(!listaNumeros.isEmpty()){
            int maiorNumero = listaNumeros.get(0);
            for(Integer numero : listaNumeros){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public int encontrarMenorNumero() {
        if(!listaNumeros.isEmpty()){
            int menorNumero = listaNumeros.get(0);
            for(Integer numero : listaNumeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
