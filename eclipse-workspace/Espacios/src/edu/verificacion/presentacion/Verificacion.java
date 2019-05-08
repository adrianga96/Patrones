package edu.verificacion.presentacion;

import javax.swing.JOptionPane;

import edu.cableado.IControl;

public class Verificacion implements IControl {

	@Override
	public void confirmarDsiponobilidad() {
		JOptionPane.showMessageDialog(null, "confirmarDsiponobilidad");

	}

	@Override
	public void revisarEspacio() {
		JOptionPane.showMessageDialog(null, "revisarEspacio");

	}

}
