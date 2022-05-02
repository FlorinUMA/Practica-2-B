package biestable;

public abstract class XEstable {
	private ColorXEstable color = new ColorRojo();
	private Mediador elMediador;

	public void cerrar() {
		color.cerrar(this, elMediador);
	}

	public void abrir() {
		color.abrir(this, elMediador);
	}

	protected ColorXEstable getColorEstable() {
		return color;
	}
	protected void setColorEstable(ColorXEstable c) {
		color = c;
	}
	
	public String estado() {
		return color.estado();
	}
	
	void setMediador(Mediador m) {
		elMediador = m;
	}
	
	Mediador getMediador() {
		return elMediador;
	}
}
