package optimizacionCodigo;

import java.util.Date;

public class Persona {

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private int numeroColegiadoMedicina;

	public Persona() {
		super();
	}

	public void visitarPaciente() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getNumeroColegiadoMedicina() {
		return numeroColegiadoMedicina;
	}

	public void setNumeroColegiadoMedicina(int numeroColegiadoMedicina) {
		this.numeroColegiadoMedicina = numeroColegiadoMedicina;
	}

}