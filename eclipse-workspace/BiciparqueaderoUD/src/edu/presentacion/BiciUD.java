package edu.presentacion;

import edu.cableado.IControl;
import edu.cableado.IGestion;
import edu.cableado.IReservacion;
import edu.cableado.ISeguridad;
import edu.utilidades.Cargador;

public class BiciUD {

	public static void main(String[] args) {
	   Cargador cb=new Cargador("back", ClassLoader.getSystemClassLoader());
       Class cls= null;      
		try {
			cls=cb.cargarUnaClaseDesdeSuDirectorio(edu.cableado.IGestion.class.getName());//new Asignacion();
			if(cls!=null) {
			   IGestion ig = (IGestion)cls.newInstance();
	           ig.asignarElEspacio();
	           ig.cambiarEstadodelEspacio();
			}	       
	        cls= cb.cargarUnaClaseDesdeSuDirectorio(edu.cableado.IControl.class.getName());
	        if(cls!=null) {
	           IControl ic =  (IControl)cls.newInstance();
	           ic.confirmarDsiponobilidad();
	           ic.revisarEspacio(); 
	        }
	       
		}catch (Exception e) {
	   		// TODO Auto-generated catch block
	   		e.printStackTrace();
	   	}
		
		Cargador cf=new Cargador("front", ClassLoader.getSystemClassLoader());
		try {
			cls= cf.cargarUnaClaseDesdeSuDirectorio(edu.cableado.IReservacion.class.getName());
			if(cls!=null) {
			IReservacion ir = (IReservacion)cls.newInstance();
			ir.cancelarSolicitud();
			ir.recibirSolicitud();
			}
			
			cls= cf.cargarUnaClaseDesdeSuDirectorio(edu.cableado.ISeguridad.class.getName());			
			if(cls!=null) {
			ISeguridad is = (ISeguridad)cls.newInstance();
			is.comprobarPropiedad();
			is.verificarElEstudiante();
			}
			
		}catch (Exception e) {
	   		// TODO Auto-generated catch block
	   		e.printStackTrace();
	   	}  
 	}

}
