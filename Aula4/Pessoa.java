package Aula4;

/**
 *
 * @author vinicius.henicka
 */
public class Pessoa {

    private String cidade;
    private int idade;
    private String nome;
    private boolean aluno;

    public String retornarNome() {
        return nome;
    }

    public void modificarNome(String info) {
        nome = info;
    }

    public int retornarIdade() {
        return idade;
    }

    public void modificarIdade(int info) {
        idade = info;
    }

    public String retornarcidade() {
        return cidade;
    }

    public void modificarCidade(String info) {
        nome = info;
    }

    public boolean retornaraluno() {
        return aluno;
    }

    public void modificarAluno(boolean info) {
        aluno = info;
    }

    @Override
    public String toString() {
        return " Nome = " + this.nome;
    }

}
