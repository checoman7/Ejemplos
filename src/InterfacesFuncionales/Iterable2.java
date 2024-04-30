package InterfacesFuncionales;

@FunctionalInterface
interface CriterioFiltro<T> {
    boolean cumpleCriterio(T elemento);
}