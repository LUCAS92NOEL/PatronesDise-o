package org.creational.patterns;

import org.creational.util.ExpFinal;

/**
 * 
 * @author Lucas Noel
 * @see https://refactoring.guru/es/design-patterns/singleton
 * 
 * @implNote Sigleton
 * @category Patron creacional
 * 
 * @see 1. Instancia única en memoria de una clase.  -> final (Explicacion {@link ExpFinal}), constructor privado
 * @see 2. Acceso global a la instancia.             -> static
 * 
 * @uso Recursos compartidos
 * 
 */
public class PatSingleton {

	public PatSingleton() {
		// TODO Auto-generated constructor stub
	}

}

class RunPatSingleton {
	public static void main(String... arg) {

	}
}

class ClasePadre {
    final void metodoFinal() {
        // Implementación del método
    }
}

class ClaseHija extends ClasePadre {
    // Esto causará un error, ya que no se puede anular un método final
     void metodoFinal() { }
}
