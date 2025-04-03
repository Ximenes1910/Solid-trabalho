// Implementação do igrediente
// Princípio da Responsabilidade Única (SRP):
// Esta classe tem a única responsabilidade de representar um ingrediente.

public class Ingrediente implements IIngrediente {

    private String nome;
    private int quantidade;
    private String validade;
    private String unidade;
    private boolean disponivel;

    public Ingrediente(String nome, String validade, String quantidade, String unidade) {
    }

    public Ingrediente(String nome, int quantidade, String validade, String unidade, boolean disponivel) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.validade = validade;
        this.unidade = unidade;
        this.disponivel = false;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public String getUnidade() {
        return unidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void print(){
        System.out.println("[" + (disponivel ? "X" : " ") + "] " + nome + " (Validade: " + validade + ")");
    }

    @Override
    public void marcarComoDisponivel() {
        this.disponivel = true;
    }
}
