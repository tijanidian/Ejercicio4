
public class Libro {
	private boolean prestado;
	private String nombre;
	private String autor;
	private int dias;

	Libro(boolean prestado, String nombre, String autor) {
		this.autor = autor;
		this.prestado = prestado;
		this.nombre = nombre;
	}

	Libro() {
		this.autor = null;
		this.prestado = false;
		this.nombre = null;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public int getDias() {
		return dias;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean prestamo() {

		if (this.prestado) {
			System.out.println("El libro ya est� prestado");
		} else {
			this.prestado = true;
			System.out.println("Prestamo realizado");
		}
		return prestado;
	}

	public void devolucion() {
		if (this.prestado) {
			this.prestado = false;
			System.out.println("Devoluci�n realizada");
		} else {
			System.out.println("El libro no est� prestado");
		}
	}

	public String toString() {
		String pres = null;
		if (prestado) {
			pres = "prestado";
		} else {
			pres = "no prestado";
		}
		return (nombre + " de " + autor + ", estado: " + pres);
	}
}
