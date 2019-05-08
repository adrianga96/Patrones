package edu.Asignacion.presentacion;

import javax.swing.JOptionPane;

import edu.cableado.IGestion;

public class Asignacion implements IGestion{

	@Override
	public void asignarElEspacio() {
		JOptionPane.showMessageDialog(null, "asignarElEspacio");		
	}

	@Override
	public void cambiarEstadodelEspacio() {
		JOptionPane.showMessageDialog(null, "cambiarEstadodelEspacio");		
	}

}
