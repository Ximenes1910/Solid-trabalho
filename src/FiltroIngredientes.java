import java.util.List;
import java.util.stream.Collectors;

public class FiltroIngredientes {

    public List<IIngrediente> filtrarPorValidade(List<IIngrediente> ingredientes, String validade) {
        return ingredientes.stream()
                .filter(ingrediente -> ingrediente.getValidade().equalsIgnoreCase(validade))
                .collect(Collectors.toList());
    }

}
