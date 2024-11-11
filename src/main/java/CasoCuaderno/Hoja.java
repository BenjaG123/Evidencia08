package CasoCuaderno;

public class Hoja {

	private String contenido;

	public Hoja() {
		this.contenido = "";
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void escribirTexto(String texto) {
		this.contenido = texto;
	}
}