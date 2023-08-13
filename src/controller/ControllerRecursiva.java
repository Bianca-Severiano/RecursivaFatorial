package controller;

public class ControllerRecursiva {

	public ControllerRecursiva() {
		super();
	}
	
	public int Fatorial(int numero) {
		if (numero == 0) { // PARADA
			return 1;
		} else {
			int resultado = numero * Fatorial((numero-1));
			return resultado;
		}
	}
}

/*
 * f(4) = 4 * f(3)  
 * f(3) = 3 * f(2)
 * f(2) = 2 * f(1)
 * f(1) = 1 * f(0)
 * f(0) = 1 <-- PARADA */  
 