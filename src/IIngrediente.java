public interface IIngrediente {
    String getNome();
    int getQuantidade();
    String getValidade();
    String getUnidade();
    boolean isDisponivel();
    void marcarComoDisponivel();
}
