package view;

import javax.swing.JOptionPane;

import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		MDCController mdc = new MDCController ();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variável x (maior que 0)."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variável y (maior que 0)."));
		JOptionPane.showMessageDialog(null, "O MDC de " + x + " e " + y + " é igual a " + mdc.MDCResultado(x, y) );
	}
}