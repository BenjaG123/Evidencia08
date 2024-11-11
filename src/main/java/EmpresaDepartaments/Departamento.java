package EmpresaDepartaments;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nombre;
	private List<Empleado> empleados;
	private Empleado administrador;

	public Departamento(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado getAdministrador() {
		return this.administrador;
	}

	public void setAdministrador(Empleado administrador) {
		this.administrador = administrador;
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		empleado.setDepartamento(this);
	}

	public void asignarAdministrador(Empleado administrador) {
		this.administrador = administrador;
	}

	public void msotrarEmpleados() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado.getNombre());
		}
	}

}