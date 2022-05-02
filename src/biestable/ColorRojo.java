package biestable;

public class ColorRojo implements ColorXEstable{
	private String estado;
	protected ColorRojo() {
		estado = "Cerrado";
	}
	@Override
	public void cerrar(XEstable b, Mediador m) {
	//NO HACEMOS NADA PORQUE ESTAMOS YA EN EL ESTADO CORRECTO
	}

	@Override
	public void abrir(XEstable b, Mediador m) {
		b.setColorEstable(m.cambioColor(this, false));
	}
	@Override
	public String estado() {
		return this.estado;
	}

}
