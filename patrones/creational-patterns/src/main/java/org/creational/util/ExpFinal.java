package org.creational.util;

/**
 * @author Lucas Noel
 * 
 * Se aplica a VARIABLES, METODOS y CLASES
 *
 */
public class ExpFinal {
	
	// *************** VARIABLES *******************//
	// *************** VARIABLES *******************//
	// Significa que esa variable no puede cambiar su valor después de haber sido inicializada. 
	// CONCEPTO INMUTABILIDAD
	final int MI_CONSTANTE = 10;
}

//*************** METODOS *******************//
//*************** METODOS *******************//
// Si se aplica a un método en una clase, impide que las subclases anulen (override) ese método.
// Es decir, la implementación del método en la clase padre no puede ser modificada por las subclases.
class ClasePadre {
	final void metodoFinal() {
        // Implementación del método
    }
}

class ClaseHija extends ClasePadre {
	// Esto causará un error, ya que no se puede anular un método final
    // void metodoFinal() { }
}

//*************** CLASES *******************//
//*************** CLASES *******************//
// Clases Inmutables
// cuando defines una clase como final, 
// significa que esa clase no puede ser subclase
//, es decir, no puede ser extendida por otras clases
// y si además marcas todos sus campos como final, se asegura que los objetos de esa clase son inmutables
final class ClaseInmutable {
	private final int valor;
    public ClaseInmutable(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
// Error no se puede cambiar el valor
//    public int setValor(int valor) {
//        return this.valor=valor;
//    }
}

//Esto causará un error, ya que no se puede extender una clase final
//class SubClase extends ExpFinalMetodo { }

//************************************* OTROS USOS **************************************************//
//************************************* OTROS USOS **************************************************//
//************************************* OTROS USOS **************************************************//

// ***************************** Argumentos Finales en Métodos *****************************
//Cuando se declara un parámetro de un método como final, se asegura que el valor del parámetro 
// no puede ser modificado dentro del cuerpo del método.
class ExpFinalMetodo1 {
	void ejemploMetodo(final int parametroFinal) {
	    // El siguiente código causará un error
	    // parametroFinal = 5;
	}
}

// ***************************** Inicialización en Constructores *****************************
// Al declarar una variable como final y no asignarle un valor en la declaración, 
//debes asignarle un valor en el constructor de la clase. 
// Esto ayuda a garantizar que la variable esté inicializada antes de que se acceda a ella
class ExpFinalMetodo2 {
	final int variableFinal;

    public ExpFinalMetodo2(int valor) {
        this.variableFinal = valor;
    }
}

// ***************************** Referencias Finales en Clases Anónimas:*****************************
//En clases anónimas (clases sin nombre), las variables locales a las que se hace 
//referencia desde la clase anónima deben ser final o efectivamente finales. 
//Esto se debe a que la clase anónima puede sobrevivir más allá de la ejecución del 
//método en el que se crea, y las variables locales no finales podrían haber cambiado su valor.
interface MiInterfaz {
	void hacerAlgo();
}

class ExpFinalMetodo3 {
	void ejemploClaseAnonima() {
		final int variableFinal = 10;

			    MiInterfaz interfazEjemplo = new MiInterfaz() {
					@Override
					public void hacerAlgo() {
						System.out.println(variableFinal);
					}
				};
	}
}


//***************************** Atributos en Enumeraciones:*****************************
//Al definir constantes en enumeraciones, los atributos generalmente se declaran como 
//final para indicar que no deben cambiar después de la inicialización.
enum DiasSemana {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3);

    private final int numero;

    DiasSemana(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}


//***************************** Métodos de Interfaz en Java 8+ (Interfaz Funcional):*****************************
//En interfaces funcionales de Java 8 y posteriores, los métodos que se definen dentro de la interfaz 
//(excepto los métodos abstractos) son automáticamente final.
@FunctionalInterface
interface MiInterfaz2 {
    void metodoAbstracto();

    // Este método es automáticamente 'final'
    default void metodoDefault() {
        // Implementación del método
    }
}
