package Comparar;

public class PUZZLE {
	  public static String estadoInicial = "12578 346";
	    public static String estadoFinal = "12345678 ";
	    
	    public static void main(String[] args) {
	    	
	        Arbol a = new Arbol(new Nodo(estadoInicial), estadoFinal);
	       
	      
	        long inicio = System.nanoTime();
	        System.out.println("Busqueda por Anchura");
	        a.busquedaPorAnchura();
	        long fin = System.nanoTime();
	        long Tiempo = fin - inicio;
	        System.out.println("Segundos: "+(float)Tiempo/1000000000);
	 
	        long inicio2 = System.nanoTime();
	        System.out.println("Busqueda por Profundidad");
	        a.busquedaPorProfundidad();
	        long fin2 = System.nanoTime();
	        long Tiempo2 = fin2 - inicio2;
	        System.out.println("Segundos: "+(float)Tiempo2/1000000000);
	      
	     
	        System.out.println("Busqueda por Anchura");
	        System.out.println("Segundos: "+(float)Tiempo/1000000000);
	        System.out.println("Busqueda por Profundidad");
	        System.out.println("Segundos: "+(float)Tiempo2/1000000000);
	        
	        
	        
	        /*
	        Nodo n = new Nodo(estadoInicial);
	        Collection<String> c = n.generaHijos();
	        c = c;
	        */
	    }
	    
}
        	
