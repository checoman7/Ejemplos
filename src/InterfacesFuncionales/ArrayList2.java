package InterfacesFuncionales;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static <T> List<T> filtrarLista(List<T> lista, CriterioFiltro<T> criterio) {
        List<T> listaFiltrada = new ArrayList<>();
        for (T elemento : lista) {
            if (criterio.cumpleCriterio(elemento)) {
                listaFiltrada.add(elemento);
            }
        }
        return listaFiltrada;
    }
}
