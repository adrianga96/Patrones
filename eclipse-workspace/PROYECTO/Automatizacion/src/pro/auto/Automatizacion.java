package pro.auto;

import javax.swing.JOptionPane;

import pro.union.IAutomatizable;

public class Automatizacion implements IAutomatizable{

	@Override
	public void controlarLuz() {
		JOptionPane.showMessageDialog(null, "controlarLuz");
	}
	@Override
	public void controlarPh() {
		JOptionPane.showMessageDialog(null, "controlarPh");
	}
	@Override
	public void controlarHumedad() {
		JOptionPane.showMessageDialog(null, "controlarHumedad");
	}
	

}
