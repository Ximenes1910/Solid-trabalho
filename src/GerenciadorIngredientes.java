// Gerenciador de Ingredientes do estoque
// Princípio da Responsabilidade Única (SRP) - Responsável apenas por gerenciar Ingredientes
import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(Ingrediente ingrediente) {
        if (ingrediente == null) {
            throw new IllegalArgumentException("Ingrediente não pode ser nulo.");
        }
        ingredientes.add(ingrediente);
    }

    public List<Ingrediente> listarIngrediente() {
        return new ArrayList<>(ingredientes); // Retorna uma cópia da lista para evitar modificações externas
    }
}