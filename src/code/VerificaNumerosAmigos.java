/**
 * Ejercicio de examen
 *
 * @author IFC
 * 
 * @version 1.0.0
 */
package code;
import javax.swing.JOptionPane;
/**
 * �sta es una clasepara verificar que los numeros son amigos
 * @author IFC
 *
 */
public class VerificaNumerosAmigos {
	
	/*
	 * Dos números son amigos cuando la suma de los divisores de uno da como resultado el otro y viceversa.
	 * Por ejemplo: 220 y 284 son amigos.
	 * */
	
    public void verificador() {
        String entrada;
        /**
         *Cambia la entrada
         * para que sea integer, no String
         */
        entrada = JOptionPane.showInputDialog("Introducir 1er número");
        int x = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Introducir 2º número");
        int y = Integer.parseInt(entrada);
        
        if (this.comprobarSiAmigos(x,y)) {
            JOptionPane.showMessageDialog(null, x + " es amigo de " + y);
        } else {
            JOptionPane.showMessageDialog(null, x + " no es amigo de " + y);
        }        
    }
    
   public boolean comprobarSiAmigos(int x, int y) {
	   /**
	    *  Este es el metodo para verificar que sean amigo
	    */
    	int i, z = 0;
    	
    	for (i = 1; i < x; i++) {
            if (x % i == 0) {
                z = z + i;
            }
        }

        if (z == y) {
            z = 0;
            for (i = 1; i < y; i++) {
                if (y % i == 0) {
                    z = z + i;
                }
            }

            if (z == x) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
