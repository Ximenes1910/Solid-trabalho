// Gerenciador de Ingredientes do estoque
// Princípio da Responsabilidade Única (SRP) - Responsável apenas por gerenciar Ingredientes

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(IIngrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public List<Ingrediente> listarIngrediente() {
        return ingredientes;
    }

}
