import code.MinimoComunMultiplo;
import junit.framework.TestCase;
/**
 * @test
 * @author IFC
 *
 */
public class TestPrueba extends TestCase {
	public static void main (String[] args) {
		
	}
	public static void minimoComunMultiplo() {
		/**
		 * @test
		 */
		MinimoComunMultiplo mcm = new MinimoComunMultiplo();
		int[] candidatos = {17, 23};
		int resultado = mcm.candidatosMcM(candidatos);
		System.out.println("el mínimo común múltiplo de los candidatos es: "+resultado);
	}
	 private boolean esMinimoComunMultiplo(int d, int[] ints) {
		  /**
		   * @test
		   * comprueba si es correcto y es minimo comun multiplo
		   */
	    for (int i = 0; i < ints.length; i += 1) {
	      if (d % ints[i] != 0) {
	        return false;
	      }
	    }

	    return true;
	  }
	 public boolean comprobarSiAmigos(int x, int y) {
		   /**
		    * @test
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
