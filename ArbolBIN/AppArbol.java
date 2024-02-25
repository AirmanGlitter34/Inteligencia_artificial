package ArbolBIN;

public class AppArbol {
	    public static void main(String[] args) {
	    	
	        Arbol a = new Arbol();

	        System.out.println(a.vacio()? "Arbol vacio" : "Arbol no vacio" );
	        
	        a.insertar("1");
	        a.insertar("2");
	        a.insertar("3");
	        a.insertar("4");
	        System.out.println("Se insertaron los datos");
	        
	        System.out.print("Se encontro el ");
	        System.out.println(a.buscarNodo("4"));
	        
	        System.out.println("Arbol:");
	        a.imprimirArbol();
	        
	    }
	    
	}

