package extend;

public class PessoaFisica extends Pessoa {
    // Atributo espec�fico da classe PessoaFisica
    private String cpf;

    // Construtor da classe PessoaFisica
    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    // M�todo getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // M�todo setter para o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // M�todo toString para exibir informa��es da PessoaFisica
    @Override
    public String toString() {
        return "PessoaFisica{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
