package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atituto
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        //if (!convidadoSet.isEmpty()) {
            convidadoSet.add(new Convidado(nome, codigoConvite));
        //} else {
        //    throw new RuntimeException("O Set está vazio");
        //}
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!convidadoSet.isEmpty()) {
            Convidado convidadoParaRemover = null;
            for (Convidado c : convidadoSet) {
                if (c.getCodConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);

        } else {
            throw new RuntimeException("O Set está vazio");
        }
    }
    public int contarConvidados(){
        //if (!convidadoSet.isEmpty()) {
            return convidadoSet.size();
        //} else {
        //    throw new RuntimeException("O Set está vazio");
        //}
    }
    public void exibirConvidados(){
        //if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        //} else {
        //    throw new RuntimeException("O Set está vazio");
        //}
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }

}
