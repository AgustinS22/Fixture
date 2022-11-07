package Interfaz;
import java.util.LinkedList;

import Logica.*;

class Main {

	public static void main(String[] args) {
		Pais ecuador = new Pais("Ecuador", 0, true, "A", 0, 0, 0, 0);
		Pais qatar = new Pais("Qatar", 0, true, "A", 0, 0, 0, 0);
		Pais senegal = new Pais("Senegal", 0, true, "A", 0, 0, 0, 0);
		Pais holanda = new Pais("Holanda", 0, true, "A", 0, 0, 0, 0);
		Pais inglaterra = new Pais("Inglaterra", 0, true, "B", 0, 0, 0, 0);
		Pais iran = new Pais("Iran", 0, true, "B", 0, 0, 0, 0);
		Pais eeuu = new Pais("EE.UU", 0, true, "B", 0, 0, 0, 0);
		Pais gales = new Pais("Gales", 0, true, "B", 0, 0, 0, 0);
		Pais argentina = new Pais("Argentina", 0, true, "C", 0, 0, 0, 0);
		Pais arabia = new Pais("Arabia Saudita", 0, true, "C", 0, 0, 0, 0);
		Pais mexico = new Pais("Mexico", 0, true, "C", 0, 0, 0, 0);
		Pais polonia = new Pais("Polonia", 0, true, "C", 0, 0, 0, 0);
		Pais francia = new Pais("Francia", 0, true, "D", 0, 0, 0, 0);
		Pais australia = new Pais("Australia", 0, true, "D", 0, 0, 0, 0);
		Pais dinamarca = new Pais("Dinamarca", 0, true, "D", 0, 0, 0, 0);
		Pais tunez = new Pais("Tunez", 0, true, "D", 0, 0, 0, 0);
		Pais españa = new Pais("España", 0, true, "E", 0, 0, 0, 0);
		Pais alemania = new Pais("Alemania", 0, true, "E", 0, 0, 0, 0);
		Pais costarica = new Pais("Costa Rica", 0, true, "E", 0, 0, 0, 0);
		Pais japon = new Pais("Japon", 0, true, "E", 0, 0, 0, 0);
		Pais belgica = new Pais("Belgica", 0, true, "F", 0, 0, 0, 0);
		Pais canada = new Pais("Canada", 0, true, "F", 0, 0, 0, 0);
		Pais marruecos = new Pais("Marruecos", 0, true, "F", 0, 0, 0, 0);
		Pais croacia = new Pais("Croacia", 0, true, "F", 0, 0, 0, 0);
		Pais brasil = new Pais("Brasil", 0, true, "G", 0, 0, 0, 0);
		Pais serbia = new Pais("Serbia", 0, true, "G", 0, 0, 0, 0);
		Pais suiza = new Pais("Suiza", 0, true, "G", 0, 0, 0, 0);
		Pais camerun = new Pais("Camerun", 0, true, "G", 0, 0, 0, 0);
		Pais portugal = new Pais("Portugal", 0, true, "H", 0, 0, 0, 0);
		Pais ghana = new Pais("Ghana", 0, true, "H", 0, 0, 0, 0);
		Pais uruguay = new Pais("Uruguay", 0, true, "H", 0, 0, 0, 0);
		Pais corea = new Pais("Corea del Sur", 0, true, "H", 0, 0, 0, 0);
		
		
		LinkedList<Pais> paises = new LinkedList<Pais>(); 
		paises.add(qatar);
		paises.add(ecuador);
		paises.add(senegal);
		paises.add(holanda);
		paises.add(inglaterra);
		paises.add(iran);
		paises.add(eeuu);
		paises.add(gales);
		paises.add(argentina);
		paises.add(arabia);
		paises.add(mexico);
		paises.add(polonia);
		paises.add(francia);
		paises.add(australia);
		paises.add(dinamarca);
		paises.add(tunez);
		paises.add(españa);
		paises.add(alemania);
		paises.add(costarica);
		paises.add(japon);
		paises.add(belgica);
		paises.add(canada);
		paises.add(marruecos);
		paises.add(croacia);
		paises.add(brasil);
		paises.add(serbia);
		paises.add(suiza);
		paises.add(camerun);
		paises.add(portugal);
		paises.add(ghana);
		paises.add(uruguay);
		paises.add(corea);
		
		LinkedList<Pais> Grupoa = new LinkedList<Pais>();
		LinkedList<Pais> Grupob = new LinkedList<Pais>();
		LinkedList<Pais> Grupoc = new LinkedList<Pais>();
		LinkedList<Pais> Grupod = new LinkedList<Pais>();
		LinkedList<Pais> Grupoe = new LinkedList<Pais>();
		LinkedList<Pais> Grupof = new LinkedList<Pais>();
		LinkedList<Pais> Grupog = new LinkedList<Pais>();
		LinkedList<Pais> Grupoh = new LinkedList<Pais>();
		for (Pais pais : paises) {
			switch(pais.getGrupo().toLowerCase()) {
			case "a":
				Grupoa.add(pais);
				break;
			case "b":
				Grupob.add(pais);
				break;
			case "c":
				Grupoc.add(pais);
				break;
			case "d":
				Grupod.add(pais);
				break;
			case "e":
				Grupoe.add(pais);
				break;
			case "f":
				Grupof.add(pais);
				break;
			case "g":
				Grupog.add(pais);
				break;
			case "h":
				Grupoh.add(pais);
				break;
			}
		}
		/*System.out.println("GRUPO A: " + Grupoa);
		System.out.println("GRUPO B: " + Grupob);
		System.out.println("GRUPO C: " + Grupoc);
		System.out.println("GRUPO D: " + Grupod);
		System.out.println("GRUPO E: " + Grupoe);
		System.out.println("GRUPO F: " + Grupof);
		System.out.println("GRUPO G: " + Grupog);
		System.out.println("GRUPO H: " + Grupoh);*/
		System.out.println(Grupoa.get(0));
		
		/*
		 Equipo 1 - Equipo 2 // Equipo 1 - Equipo 3 // Equipo 1 - Equipo 4 // Equipo 2 - Equipo 3 // Equipo 2 - Equipo 4 // Equipo 3 - Equipo 4 
		*/
		// 0, 1, 2, 3
		

		/*
		SISTEMA DE PARTIDOS / GRUPOS / LISTAS
		Partidos entre 2 equipos, los goles se suman a cada equipo con el setGoles,
		en primera fase no se van a eliminar hasta que pasen 3 partidos. Al finalizar cada partido
		el equipo que tenga mayor cantidad de goles se le va a sumar 3 puntos en el ranking de grupo
		Luego de los 3 partidos se buscaran a los dos paises que tengan mas puntos en cada equipo
		y pasan a la siguiente ronda (Se remueven de la lista actual y agregan a la lista 
		de octavos), los otros 2 paises quedan descalificados(Se mantienen en la lista actual,
		para posteriormente mostrar quien se elimino en cada ronda.) Se repite lo mismo para las siguientes
		rondas pero solo con partido unico, en cada partido se sabe quien pasa y quien es descalificado
		en las semis, cambia la funcionalidad ya que los dos equipos que pierdan no van a quedar 
		descalificados sino que van a pasar a un partido por 3er y 4to puesto, por lo que la
		lista de semifinales va a dejar de existir y no va a mostrar nada o puede permanecer
		y mostrar el resultado del partido (PARA PENSAR).
		
		
		GOLES 
		Los goles de los partidos se van a hacer con un math random (tambien su duracion con un double),
		donde se anoten aleatoriamente para cada pais, (POSIBILIDAD de hacer un string para cada 
		pais con 3 jugadores claves del pais que puedan realizar los goles para que al momento de 
		mostrar quien hace el gol y en que minuto fue tambien diga el apellido y/o nombre del jugador).
		
		GRUPOS 
		hacer un foreach para que se guarde cada pais en su determinado grupo pidiendo con el get la letra
		hay que crear 8 grupos (listas) // Intentar hacer que las letras de los grupos se haga random, puedo
		hacer numeros del 1 al 8 y que cada numero sea una letra.
		
		 
		
		*/
	}
	

}
