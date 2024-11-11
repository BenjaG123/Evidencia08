package CasoCuaderno;

import java.util.ArrayList;
import java.util.List;

public class Cuaderno {

	private List<Hoja> hojas;
	private String ramo;

	public Cuaderno(String ramo) {
		hojas = new ArrayList<Hoja>();
		this.ramo = ramo;
	}

	public List<Hoja> getHojas() {
		return this.hojas;
	}

	public void setHojas(List<Hoja> hojas) {
		this.hojas = hojas;
	}

	public String getRamo() {
		return this.ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public void escribir(String texto) {
		for (Hoja hoja : this.hojas) {
			if ((hoja.getContenido().isEmpty())){
				hoja.escribirTexto(texto);
			}
		}
	}

	public void mostrarContenido() {
		for (Hoja hoja : this.hojas) {
			System.out.println(hoja.getContenido());
		}
	}

	public void quitarHoja(Hoja	hoja) {
		this.hojas.remove(hoja);
	}

}