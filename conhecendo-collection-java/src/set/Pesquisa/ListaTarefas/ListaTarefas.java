package set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributos
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    listaTarefas.remove(t);
                    break;
                }
            }
        } else {
            System.out.println("O Set está vazio");
        }
    }
    public void exibirTarefas(){
        if(!listaTarefas.isEmpty()){
            System.out.println(listaTarefas);
        } else {
            System.out.println("O Set está vazio");
        }
    }
    public int contarTarefas(){
        if(!listaTarefas.isEmpty()){
            return listaTarefas.size();
        } else {
            return 0;
        }
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        if(!listaTarefas.isEmpty()){
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for(Tarefa t : listaTarefas){
                if(t.isRealizado()){
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        if(!listaTarefas.isEmpty()){
            Set<Tarefa> tarefasPendentes = new HashSet<>();
            for(Tarefa t : listaTarefas){
                if(!t.isRealizado()){
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }
    public void marcarTarefaConcluida(String descricao){
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setRealizado(true);
                    break;
                }
            }
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setRealizado(false);
                    break;
                }
            }
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }

    public void limparListaTarefas(){
        if(!listaTarefas.isEmpty()){
            listaTarefas.clear();
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}