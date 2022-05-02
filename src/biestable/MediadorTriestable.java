package biestable;

public class MediadorTriestable implements Mediador{

	@Override
	public ColorXEstable cambioColor(ColorXEstable colorActual, boolean descendiente) {
		ColorXEstable respuesta;
		if (colorActual instanceof ColorRojo || colorActual instanceof ColorVerde) {
			respuesta = new ColorAmarillo();
		} else {
			respuesta = descendiente ? (new ColorVerde()) : (new ColorRojo());
		}
		return respuesta;
	}

}
