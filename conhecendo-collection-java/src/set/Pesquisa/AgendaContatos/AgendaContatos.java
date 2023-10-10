package set.Pesquisa.AgendaContatos;

import set.OperacoesBasicas.ConjuntoConvidados.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        if (!agendaContatos.isEmpty()) {
            System.out.println(agendaContatos.toString());
        } else {
            System.out.println("O Set está vazio");
        }
    }
    public Set<Contato> pesquisarPorNome(String nome){
        if (!agendaContatos.isEmpty()) {
            Set<Contato> contatoPesquisa = new HashSet<>();
            for(Contato c: agendaContatos){
                if(c.getNome().startsWith(nome)){
                    contatoPesquisa.add(c);
                }
            }
            return contatoPesquisa;
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        if (!agendaContatos.isEmpty()) {
            Contato contatoAtualizado = null;
            for (Contato c : agendaContatos){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    c = contatoAtualizado;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
