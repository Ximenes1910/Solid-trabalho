// Serviço para exibir ingrediente
// Princípio da Responsabilidade Única (SRP) - Responsável apenas por exibir ingredientes no console
import java.util.List;

public class MostrarIngredientes {
    public void mostrarIngrediente(List<Ingrediente> ingredientes) {
        for (int i = 1; i < ingredientes.size(); i++) {
            Ingrediente ingrediente = ingredientes.get(i);
            System.out.println(i + ". [" + (ingrediente.isDisponivel() ? "X" : " ") + "] " + ingrediente.getNome() + " (Prioridade: " + ingrediente.getValidade() + ")");
        }
    }
}
