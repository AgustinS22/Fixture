package Logica;

import java.util.Arrays;

public class Pais {
	private String nombre;
	private int cant_gol ;
	private boolean clasificado;
	private String grupo;
	private int puntos;
	private int pg;
	private int pp;
	private int pe;
	private int[] resultado = {0,0,0,0,0,0,0};
	private String abr;
	public Pais(String nombre, int cant_gol, boolean clasificado, String grupo, int puntos, int pg, int pp, int pe, String abr) {
		super();
		this.nombre = nombre;
		this.cant_gol = cant_gol;
		this.clasificado = clasificado;
		this.grupo = grupo;
		this.puntos = puntos;
		this.pg = pg;
		this.pp = pp;
		this.pe = pe;	
		this.abr = abr;
	}
	public String getAbr() {
		return abr;
	}
	public void setAbr(String abr) {
		this.abr = abr;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
	public int getPe() {
		return pe;
	}
	public void setPe(int pe) {
		this.pe = pe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCant_gol() {
		return cant_gol;
	}
	public void setCant_gol(int cant_gol) {
		this.cant_gol = cant_gol;
	}
	public boolean isClasificado() {
		return clasificado;
	}
	public void setClasificado(boolean clasificado) {
		this.clasificado = clasificado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public int[] getResultado() {
		return resultado;
	}
	public void setResultado(int[] resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return nombre;
	}
	
}
