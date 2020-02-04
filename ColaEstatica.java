package ColaEstatica;

public class ColaEstatica {

	char cola[];
	
	//inicio es la posicion donde eliminamos
	int inicio;
	
	//donde insertamos
	int fin;
	final int tamMax;
	
/**
 * Constructor (inicializa atributos)
 */
public ColaEstatica() {
	inicio = 0;
	fin = 0;
	tamMax = 'z' - 'a' +1;
	cola = new char[tamMax];
}

/**
 * Cola vacía retorna un valor que indica si la cola está vacía.
 */
public boolean colaVacia() {
	return (inicio == fin);
}


/**
 *Cola llena retorna un valor que indica si la cola está llena.
 */
public boolean colaLlena() {
	return (fin == tamMax);
}


/**
 * Introduce un caracter en la cola.
 */
public void meter(char caracter) {
	//comprobamos si la cola está llena
	if(colaLlena()) {
		System.err.println("la cola está llena");
	}else {
		cola[fin] = caracter;
	}
}




/**
 * Método que elimina un elemento de la pila y lo retorna.
 */
public char sacar() {
//Comprobamos que la pila no esté vacía.
	if(colaVacia()) {
		System.err.println("la cola está vacía");
		return 0;
	}else {
		//nos situamos donde está el último elemento.
		fin--;
		return cola[fin]; 
	}
}

/**
 * Método que introduce el abecedario en la pila.
 */
public void rellenar() {
	for(char letra = 'a'; letra <='z'; letra++) {
		push(letra);
	}
}

/**
 * Método que vacía la pila enviando a pantalla los elementos que ha ido eliminando.
 */
public void vaciar() {
	while(!colaVacia()) {
		System.out.print(sacar() + " ");
		}
	}

/**
 * Método que inserta un elemento en la cima.
 */
public void push(char letra) {
	if(colaLlena()) {
		System.out.println("la cola está llena");
	}else {
		cola[fin]=letra;
		fin++;
		}
	}

}



