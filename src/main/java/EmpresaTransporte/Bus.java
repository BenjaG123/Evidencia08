package EmpresaTransporte;

public class Bus {

	private int id;
	private String marca;
	private String modelo;
	private int agno;
	private String estado;

	public Bus(int id, String marca, String modelo, int agno, String estado) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.agno = agno;
		this.estado = "activo";
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return this.marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAgno() {
		return this.agno;
	}

	/**
	 * 
	 * @param agno
	 */
	public void setAgno(int agno) {
		this.agno = agno;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void actualizarEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}

}