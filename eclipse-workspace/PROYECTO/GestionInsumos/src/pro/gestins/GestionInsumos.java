package pro.gestins;
import javax.swing.JOptionPane;
import pro.union.IGestionInsumo;
public class GestionInsumos implements IGestionInsumo {
	@Override
	public void actualizarInsumos() {
		JOptionPane.showMessageDialog(null, "actualizarInsumos");
	}
}

