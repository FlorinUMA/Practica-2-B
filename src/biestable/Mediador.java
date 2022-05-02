package biestable;

public interface Mediador {
	/**
	 * Devuelve el siguiente color del biestable
	 * 
	 * @param colorActual  El color actual con el que comparar a cual ir
	 * @param descendiente Informa sobre que dos colores deben elegirse. Tiene
	 *                     sentido para biestables con dos o mas colores. Si es un
	 *                     biestable de dos colores, este atributo sera ignorado.
	 * @return El color siguiente de la secuencia del biestable
	 */
	public ColorXEstable cambioColor(ColorXEstable colorActual, boolean descendiente);
}
