package puzzle;

public class PUZZLE {
    public static void main(String[] args) {

	String estadoInicial = "41275386 ";
	String estadoFinal   = "12345678 ";
	
    
    Arbol a = new Arbol(estadoInicial, estadoFinal);
   
    a.busquedaPorProfundidad();
    a.imprimirSolucion();
    
    a.busquedaPorAnchura();
    a.imprimirSolucion();
}
}
