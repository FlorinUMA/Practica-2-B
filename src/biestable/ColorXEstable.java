package biestable;

public interface ColorXEstable {
	public void cerrar(XEstable b, Mediador m);

	public void abrir(XEstable b, Mediador m);
	
	public String estado();
}
