package EmpresaDepartaments;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private List<Departamento> departamentos;
	private List<Oficina> oficinas;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.departamentos = new ArrayList<Departamento>();
		this.oficinas = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public List<Oficina> getOficinas() {
		return this.oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	public void agregarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}

	public void agregarOficina(Oficina oficina) {
		oficinas.add(oficina);
	}

}