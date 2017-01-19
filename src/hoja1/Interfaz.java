public abstract class Interfaz{

  
  /**
	 * Atributos
	 */
  private void estado();
  private void frecuencia();
  private void cambiar(boolean a);
  private void guardar(int a);
  private float seleccionar (int a);

  /**
	 * Metodos abstractos
	 */

  /**
	 * Se encarga del estado
	 */
abstract public void estdo();
  
  /**
	 * Se encarga de la frecuencia
	 */
abstract public void frecuencia();

  /**
	 * Cambia emisora
   *@param: boolean a
	 */
abstract public void cambiar(boolean a);
  
  /**
	 * Guarda emisora
   *@param: int a
	 */
abstract public void guardar(int a);

  /**
	 * Selecciona una de las emisoras guardadas
   *@param: int a
	 */
abstract public void seleccionar(int a);



}
