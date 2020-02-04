package ColaEstatica;

public class TestColaEstatica {

	public static void main(String[] args) {
		//creamos una pila
				ColaEstatica cola = new ColaEstatica();
				
			//rellenar toda la cola.
				cola.rellenar();
				//probamos que salta el error si la pila está llena
				cola.push('a');
				cola.vaciar();
				//probamos que salta el error si la pila está vacía.
				cola.sacar();
	}

}
