package list.OperacoesBasicas.CarrinhoCompras;

import list.OperacoesBasicas.ListaTarefas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsRemover = new ArrayList<>();
        for(Item i : carrinhoDeCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itemsRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : carrinhoDeCompras){
            valorTotal = valorTotal + i.getPreco()*i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras.toString());
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Detergente",1.50,2);
        carrinhoDeCompras.adicionarItem("Detergente",1.50,2);
        carrinhoDeCompras.adicionarItem("Desodorante",2.50,3);
        carrinhoDeCompras.adicionarItem("Amaciante",4.75,8);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Detergente");

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor do carrinho de compras: R$ " +carrinhoDeCompras.calcularValorTotal());
    }
}
