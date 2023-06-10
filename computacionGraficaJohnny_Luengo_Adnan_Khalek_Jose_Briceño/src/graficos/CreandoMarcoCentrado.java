//Johnny Luengo C.I:27.030.264
package graficos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		miMarco.setTitle("Computacion Grafica");

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		Image miIcono = miPantalla.getImage("C:/Users/M3 2-7/workspace/computacionGraficaJose_Briceño/src/graficos/Images.png");
		setIconImage(miIcono);
		
		
	}
}
