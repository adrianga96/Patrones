package pro.monit;

import javax.swing.JOptionPane;

import pro.union.IMonitoreable;

public class Monitoreo implements IMonitoreable{

	@Override
	public void medirLuz() {
		JOptionPane.showMessageDialog(null, "medirLuz");
	}
	@Override
	public void medirPh() {
		JOptionPane.showMessageDialog(null, "medirPh");
	}
	@Override
	public void medirHumedad() {
		JOptionPane.showMessageDialog(null, "medirHumedad");
	}
	

}
