package Logica;

public class Partido {
	private Pais pais;
	private Pais pais2;
	private int gol_local;
	private int gol_visitante;
	private double duracion;
	private int id;
	public Partido(Pais pais, Pais pais2, int gol_local, int gol_visitante, double duracion, int id) {
		super();
		this.pais = pais;
		this.pais2 = pais2;
		this.gol_local = gol_local;
		this.gol_visitante = gol_visitante;
		this.duracion = duracion;
		this.id = id;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais2() {
		return pais2;
	}
	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}
	public int getGol_local() {
		return gol_local;
	}
	public void setGol_local(int gol_local) {
		this.gol_local = gol_local;
	}
	public int getGol_visitante() {
		return gol_visitante;
	}
	public void setGol_visitante(int gol_visitante) {
		this.gol_visitante = gol_visitante;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "\n"  + pais + " - " + pais2;
	}
}
