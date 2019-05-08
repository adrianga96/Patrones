package pro.gestplan;
import javax.swing.JOptionPane;
import pro.union.IGestionPlanta;

public class GestionPlantas implements IGestionPlanta{
	@Override 
	public void actualizarPlantas() {
		JOptionPane.showMessageDialog(null, "actualizarPlantas");
	}
}
