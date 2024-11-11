package EmpresaTransporte;

import java.util.List;

public class EmpresaTP {

	private String nombre;
	private List<Bus> buses;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Bus> getBuses() {
		return this.buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

	public void agregarBus(Bus bus) {
		this.buses.add(bus);
	}

	public void eliminarBus(Bus bus) {
		this.buses.remove(bus);
	}

	public void listarBuses() {
		for (Bus bus : buses) {
			System.out.println(bus);
		}
	}

}