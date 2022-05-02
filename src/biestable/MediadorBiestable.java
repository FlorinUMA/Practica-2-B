package biestable;

public class MediadorBiestable implements Mediador {

	@Override
	public ColorXEstable cambioColor(ColorXEstable colorActual, boolean r) {
		return ((colorActual instanceof ColorRojo) ? (new ColorVerde()) : (new ColorRojo()));
	}

}
