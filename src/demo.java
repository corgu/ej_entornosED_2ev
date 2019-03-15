/**
 * Ejercicio de examen
 *
 * @author IFC
 * @test esta clase es de prueba
 * @version 1.0.0
 */
import code.MinimoComunMultiplo;
import code.VerificaNumerosAmigos;

public class demo {
	/**
	 * @test
	 * @param args
	 */
		public static void main (String[] args) {
			
			numerosAmigos();
			minimoComunMultiplo();
			
		}
		/**
		 * �ste es el metodo main
		 */
		public static void numerosAmigos() {
			VerificaNumerosAmigos vf = new VerificaNumerosAmigos();
			vf.verificador();
		}
		/**
		 * Aqui nos confirma que los numero amigos son correctos
		 */
		
		public static void minimoComunMultiplo() {
			MinimoComunMultiplo mcm = new MinimoComunMultiplo();
			int[] candidatos = {17, 23};
			int resultado = mcm.candidatosMcM(candidatos);
			System.out.println("el mínimo común múltiplo de los candidatos es: "+resultado);
		}
		/**
		 * Minimo comun multiplo de los numeros 17 y 23
		 */
}
