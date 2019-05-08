package edu.presentacion;

import javax.swing.JOptionPane;

import edu.cableado.ISeguridad;

public class Identidad implements ISeguridad{

	@Override
	public void comprobarPropiedad() {
		JOptionPane.showMessageDialog(null, "comprobarPropiedad");
		
	}

	@Override
	public void verificarElEstudiante() {
		JOptionPane.showMessageDialog(null, "verificarElEstudiante");
		
	}

}
