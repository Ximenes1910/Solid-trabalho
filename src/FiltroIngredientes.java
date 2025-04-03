import java.util.List;
import java.util.stream.Collectors;

public class FiltroIngredientes {
    public List<Ingrediente> filtrarPorValidade(List<? extends Ingrediente> ingredientes, String validade) {
        return ingredientes.stream()
                .filter(i -> i.getValidade().equalsIgnoreCase(validade))
                .collect(Collectors.toList());
    }
}