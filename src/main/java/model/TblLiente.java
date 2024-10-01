package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_liente database table.
 * 
 */
@Entity
@Table(name="tbl_liente")
@NamedQuery(name="TblLiente.findAll", query="SELECT t FROM TblLiente t")
public class TblLiente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcliente;

	private String apellido;

	private String dni;

	private String email;

	private String nacion;

	private String nombre;

	private String sexo;

	private String telef;

	public TblLiente() {
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacion() {
		return this.nacion;
	}

	public void setNacion(String nacion) {
		this.nacion = nacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelef() {
		return this.telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

}