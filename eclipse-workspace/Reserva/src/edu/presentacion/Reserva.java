package edu.presentacion;

import javax.swing.JOptionPane;

import edu.cableado.IReservacion;

public class Reserva implements IReservacion{

	@Override
	public void cancelarSolicitud() {
		JOptionPane.showMessageDialog(null, "cancelarSolicitud");
		
	}

	@Override
	public void recibirSolicitud() {
		JOptionPane.showMessageDialog(null, "recibirSolicitud");
		
	}

}
