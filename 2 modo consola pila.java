import  java.util.Scanner ;

Todos los derechos reservados
 
 * @author junior loor
 * 
 * /
public  class  Principal {

    Todos los derechos reservados
     * @param args los argumentos de la línea de comandos
     * /
    
    public  static  void  Menú () {
        Sistema . a cabo . println ( " \ n \ n \ t \ t \ t ========= Menú Manejo Pila ============= " );
        Sistema . a cabo . println ( " \ t \ t \ t = = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 1 - elemento Insertar = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 2 - Eliminar elemento = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 3 Buscar elemento = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 4- Imprimir pila = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 5 - Imprimir el elemento primer = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 6- Salir = " );
        Sistema . a cabo . println ( " \ t \ t \ t ====================================== " );
        Sistema . a cabo . imprimir ( " \ t \ t \ t Ingrese Opcion: " );
    }
    public  static  void  main ( String [] args ) {
        // TODO codifica la lógica de la aplicación aquí
        
        NodoPila  Pila = nulo ;
        Scanner teclado = nuevo  Escáner ( System . In );
        int opcion;
        String dato;
        
        hacer {
            Menú();
            opcion = teclado . nextInt ();
            switch (opcion) {
			Caso  1 :  Sistema . a cabo . println ( " Escriba el libro para guardar en la pila: " );
                                dato = teclado . nextLine ();
                                dato = teclado . nextLine ();
                                Pila = NodoPila . insertarPila ( Pila , dato);
			        romper ;
			caso  2 :  Pila = NodoPila . eliminarPila ( Pila );
			        romper ;
                                
                                
			Caso  3 :  Sistema . a cabo . println ( " Escriba el dato a Buscar en la pila: " );
                                dato = teclado . nextLine ();
                                dato = teclado . nextLine ();
                                NodoPila . buscarPila ( Pila , dato);
			        romper ;
                                
                            
			caso  4 : NodoPila . imprimirPila ( Pila );
			        romper ;
                                
                                
			caso  5 :  NodoPila . imprimirprimerelementodelaPila ( Pila );
			        romper ;
                                
                                
                        caso  6 : 
			        romper ;
                            }
        } while (opcion ! = 6 );
        
        
    
    }
    
}