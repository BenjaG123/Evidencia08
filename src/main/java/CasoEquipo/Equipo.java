package CasoEquipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private Jugador capitan;
	private List<Jugador> jugadores;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<Jugador>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCapitan() {
		return this.capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
		jugador.asignarEquipo(this);
	}

	public void eliminarJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}

	public void asignarCapitan(Jugador jugador) {
		this.capitan = jugador;
	}

}