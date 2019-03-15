/**
 * Ejerciciodeexamen
 *
 * @author IFC
 * 
 * @version 1.0.0
 */
package code;


public class MinimoComunMultiplo {
  public MinimoComunMultiplo() {}
  /**
   * Clase minimo comun multiplo
   * @param args
   * @return
   */

  public int candidatosMcM(int[] args) {
    if (args.length < 2) {
      throw new IllegalArgumentException(
        "Hacen falta dos o más números"
      );
      /**
       * Esta es la comprobacion de que los numeros deben tener una longitud concreta como
       * maximo, sino nos aparecera error
       */
    }

    if (algunoEsCero(args)) {
      throw new IllegalArgumentException(
        "Los números no pueden ser cero"
      );
      /**
       * Los numeros tampoco pueden ser cero, sino estara mal
       */
    }

    args = abs(args);

    int max = max(args);
    int d = max;

    while (true) {
      if (esMinimoComunMultiplo(d, args)) {
        return d;
      }

      d += max;
    }
  }

  private boolean algunoEsCero(int[] ints) {
	  /**
	   * Este nos muestra que un numero no puede ser 0
	   */
    for (int d : ints) {
      if (d == 0) {
        return true;
      }
    }

    return false;
  }

  private static int[] abs(int[] ints) {
    int[] abs = new int[ints.length];

    for (int i = 0; i < ints.length; i += 1) {
      abs[i] = Math.abs(ints[i]);
    }

    return abs;
  }
  

  private int max(int[] ints) {
    int max = ints[0];

    for (int i = 1; i < ints.length; i += 1) {
      max = Math.max(max, ints[i]);
    }

    return max;
  }
  

  private boolean esMinimoComunMultiplo(int d, int[] ints) {
	  /**
	   * comprueba si es correcto y es minimo comun multiplo
	   */
    for (int i = 0; i < ints.length; i += 1) {
      if (d % ints[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
