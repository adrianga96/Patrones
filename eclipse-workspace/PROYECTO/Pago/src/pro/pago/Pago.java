package pro.pago;

import javax.swing.JOptionPane;

import pro.union.IRecaudo;

public class Pago implements IRecaudo{

	@Override
	public void recibirPagos() {
		JOptionPane.showMessageDialog(null, "recibirPagos");
	}
		

}
