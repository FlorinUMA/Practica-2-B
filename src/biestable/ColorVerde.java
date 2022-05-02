package biestable;

public class ColorVerde implements ColorXEstable {
	private String estado;

	protected ColorVerde() {
		estado = "Abierto";
	}

	@Override
	public void cerrar(XEstable b, Mediador m) {
		b.setColorEstable(m.cambioColor(this,false));
	}

	@Override
	public void abrir(XEstable b, Mediador m) {
		// NO HACEMOS NADA PORQUE YA ESTAMOS EN EL COLOR VERDE
	}

	@Override
	public String estado() {
		return this.estado;
	}

}
