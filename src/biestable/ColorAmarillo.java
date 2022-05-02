package biestable;

public class ColorAmarillo implements ColorXEstable{
	private String estado;
	protected ColorAmarillo() {
		estado = "Precaucion";
	}
	@Override
	public void cerrar(XEstable b, Mediador m) {
		b.setColorEstable(m.cambioColor(this, false));
		
	}

	@Override
	public void abrir(XEstable b, Mediador m) {
		b.setColorEstable(m.cambioColor(this, true));
	}

	@Override
	public String estado() {
		return this.estado;
	}

}
