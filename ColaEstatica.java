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
 * Cola vac�a retorna un valor que indica si la cola est� vac�a.
 */
public boolean colaVacia() {
	return (inicio == fin);
}


/**
 *Cola llena retorna un valor que indica si la cola est� llena.
 */
public boolean colaLlena() {
	return (fin == tamMax);
}


/**
 * Introduce un caracter en la cola.
 */
public void meter(char caracter) {
	//comprobamos si la cola est� llena
	if(colaLlena()) {
		System.err.println("la cola est� llena");
	}else {
		cola[fin] = caracter;
	}
}




/**
 * M�todo que elimina un elemento de la pila y lo retorna.
 */
public char sacar() {
//Comprobamos que la pila no est� vac�a.
	if(colaVacia()) {
		System.err.println("la cola est� vac�a");
		return 0;
	}else {
		//nos situamos donde est� el �ltimo elemento.
		fin--;
		return cola[fin]; 
	}
}

/**
 * M�todo que introduce el abecedario en la pila.
 */
public void rellenar() {
	for(char letra = 'a'; letra <='z'; letra++) {
		push(letra);
	}
}

/**
 * M�todo que vac�a la pila enviando a pantalla los elementos que ha ido eliminando.
 */
public void vaciar() {
	while(!colaVacia()) {
		System.out.print(sacar() + " ");
		}
	}

/**
 * M�todo que inserta un elemento en la cima.
 */
public void push(char letra) {
	if(colaLlena()) {
		System.out.println("la cola est� llena");
	}else {
		cola[fin]=letra;
		fin++;
		}
	}

}



