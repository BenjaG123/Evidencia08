package CasoPersona;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private ArrayList<Persona> amigos;

	public Persona(String nombre) {
		this.nombre = nombre;
		amigos = new ArrayList<Persona>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Persona> getAmigos() {
		return this.amigos;
	}

	public void setAmigos(ArrayList<Persona> amigos) {
		this.amigos = amigos;
	}

	public void agregarAmigo(Persona persona) {
		this.amigos.add(persona);
	}

	public void eliminarAmigo(Persona persona) {
		this.amigos.remove(persona);
	}

	public void listarAmigos() {
		for (Persona amigo : amigos) {
			System.out.println(amigo.getNombre());
		}
	}



}