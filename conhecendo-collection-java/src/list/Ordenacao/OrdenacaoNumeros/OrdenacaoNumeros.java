package list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    //atributo
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = listaNumeros;
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente  = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(listaAscendente);
            return listaAscendente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
