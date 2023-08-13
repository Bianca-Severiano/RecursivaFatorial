package view;

import javax.swing.JOptionPane;

import controller.ControllerRecursiva;

public class PrincipalFatorial {

	public static void main(String[] args) {
		int valor = 0;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para calcular fatorial"));
		} while (valor > 12);

		ControllerRecursiva cr = new ControllerRecursiva();
		int res = cr.Fatorial(valor);

		System.out.println(res);

	}

}
