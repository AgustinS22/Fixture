package Interfaz;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Logica.*;

class Main {

	public static void main(String[] args) {
		Pais ecuador = new Pais("Ecuador", 0, true, "A", 3, 0, 0, 0, "ECU", 0, 0, 1);
		Pais qatar = new Pais("Qatar", 0, true, "A", 3, 0, 0, 0, "QAT", 0, 0, 10);
		Pais senegal = new Pais("Senegal", 0, true, "A", 3, 0, 0, 0, "SEN", 0, 0, 23);
		Pais holanda = new Pais("Holanda", 0, true, "A", 3, 0, 0, 0, "HOL", 0, 0, -4);
		Pais inglaterra = new Pais("Inglaterra", 0, true, "B", 0, 0, 0, 0, "ING", 0, 0, 0);
		Pais iran = new Pais("Iran", 0, true, "B", 0, 0, 0, 0, "IRN", 0, 0, 0);
		Pais eeuu = new Pais("EE.UU", 0, true, "B", 0, 0, 0, 0, "USA", 0, 0, 0);
		Pais gales = new Pais("Gales", 0, true, "B", 0, 0, 0, 0, "GAL", 0, 0, 0);
		Pais argentina = new Pais("Argentina", 0, true, "C", 0, 0, 0, 0, "ARG", 0, 0, 0);
		Pais arabia = new Pais("Arabia Saudita", 0, true, "C", 0, 0, 0, 0, "ARA", 0, 0, 0);
		Pais mexico = new Pais("Mexico", 0, true, "C", 0, 0, 0, 0, "MEX", 0, 0, 0);
		Pais polonia = new Pais("Polonia", 0, true, "C", 0, 0, 0, 0, "POL", 0, 0, 0);
		Pais francia = new Pais("Francia", 0, true, "D", 0, 0, 0, 0, "FRA", 0, 0, 0);
		Pais australia = new Pais("Australia", 0, true, "D", 0, 0, 0, 0, "AUS", 0, 0, 0);
		Pais dinamarca = new Pais("Dinamarca", 0, true, "D", 0, 0, 0, 0, "DIN", 0, 0, 0);
		Pais tunez = new Pais("Tunez", 0, true, "D", 0, 0, 0, 0, "TUN", 0, 0, 0);
		Pais españa = new Pais("España", 0, true, "E", 0, 0, 0, 0, "ESP", 0, 0, 0);
		Pais alemania = new Pais("Alemania", 0, true, "E", 0, 0, 0, 0, "ALE", 0, 0, 0);
		Pais costarica = new Pais("Costa Rica", 0, true, "E", 0, 0, 0, 0, "CRC", 0, 0, 0);
		Pais japon = new Pais("Japon", 0, true, "E", 0, 0, 0, 0, "JAP", 0, 0, 0);
		Pais belgica = new Pais("Belgica", 0, true, "F", 0, 0, 0, 0, "BEL", 0, 0, 0);
		Pais canada = new Pais("Canada", 0, true, "F", 0, 0, 0, 0, "CAN", 0, 0, 0);
		Pais marruecos = new Pais("Marruecos", 0, true, "F", 0, 0, 0, 0, "MAR", 0, 0, 0);
		Pais croacia = new Pais("Croacia", 0, true, "F", 0, 0, 0, 0, "CRO", 0, 0, 0);
		Pais brasil = new Pais("Brasil", 0, true, "G", 0, 0, 0, 0, "BRA", 0, 0, 0);
		Pais serbia = new Pais("Serbia", 0, true, "G", 0, 0, 0, 0, "SER", 0, 0, 0);
		Pais suiza = new Pais("Suiza", 0, true, "G", 0, 0, 0, 0, "SUI", 0, 0, 0);
		Pais camerun = new Pais("Camerun", 0, true, "G", 0, 0, 0, 0, "CAM", 0, 0, 0);
		Pais portugal = new Pais("Portugal", 0, true, "H", 0, 0, 0, 0, "POR", 0, 0, 0);
		Pais ghana = new Pais("Ghana", 0, true, "H", 0, 0, 0, 0, "GHA", 0, 0, 0);
		Pais uruguay = new Pais("Uruguay", 0, true, "H", 0, 0, 0, 0, "URU", 0, 0, 0);
		Pais corea = new Pais("Corea del Sur", 0, true, "H", 0, 0, 0, 0, "COR", 0, 0, 0);
		
		
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


		
		/*
		 Equipo 1 - Equipo 2 // Equipo 1 - Equipo 3 // Equipo 1 - Equipo 4 // Equipo 2 - Equipo 3 // Equipo 2 - Equipo 4 // Equipo 3 - Equipo 4 
		*/
		// 0, 1, 2, 3
		
		LinkedList<Partido> Partidoa = new LinkedList<Partido>();
		LinkedList<Partido> Partidob = new LinkedList<Partido>();
		LinkedList<Partido> Partidoc = new LinkedList<Partido>();
		LinkedList<Partido> Partidod = new LinkedList<Partido>();
		LinkedList<Partido> Partidoe = new LinkedList<Partido>();
		LinkedList<Partido> Partidof = new LinkedList<Partido>();
		LinkedList<Partido> Partidog = new LinkedList<Partido>();
		LinkedList<Partido> Partidoh = new LinkedList<Partido>();
		int p=0;
		int ids;
		Grupos (p, Grupoa, ids=0, Partidoa);
		Grupos (p, Grupob, ids=6, Partidob);
		Grupos (p, Grupoc, ids=12, Partidoc);
		Grupos (p, Grupod, ids=18, Partidod);
		Grupos (p, Grupoe, ids=24, Partidoe);
		Grupos (p, Grupof, ids=30, Partidof);
		Grupos (p, Grupog, ids=36, Partidog);
		Grupos (p, Grupoh, ids=42, Partidoh);
		String grupo="";
		double number = 1.444423;
		jugarPartido(Partidoa ,grupo, Grupoa);
		System.out.println(Grupoa);
		Comparator <Pais> comp = Comparator.comparing(Pais::getPuntos).thenComparing(Pais::getDiferencia_goles).thenComparing(Pais::getGoles_favor);
		Collections.sort(paises, comp.reversed());
		Collections.sort(Grupoa, comp.reversed());
		verRankingGrupo(paises, grupo);
		System.out.println(Grupoa.get(0));
		LinkedList<Pais> octavos = new LinkedList<Pais>();
		avanzarFase(octavos, Grupoa);
		avanzarFase(octavos, Grupob);
		avanzarFase(octavos, Grupoc);
		avanzarFase(octavos, Grupod);
		avanzarFase(octavos, Grupoe);
		avanzarFase(octavos, Grupof);
		avanzarFase(octavos, Grupog);
		avanzarFase(octavos, Grupoh);
		
		System.out.println(octavos);
		
		
		
		


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
	
	public static void Grupos(int p, LinkedList<Pais> Grupo, int id, LinkedList<Partido> partidos) {
		p=0;
		Partido partido;
			for (int i = 1; i<4; i++) {
				if (i != 0 && p <3) {
					id++;
					partido = new Partido(Grupo.get(0), Grupo.get(i), 0, 0, 0, id);
					partidos.add(partido);
					p++;
					if (p == 3){
						i = 1;
					}
				} else if (i != 0 && i != 1 && p!= 5 ) {
					id++;
					partido = new Partido(Grupo.get(1), Grupo.get(i), 0, 0, 0, id);
					partidos.add(partido);
					p++;
					if (p == 5) {
						i = 2;
					}
				} else {
					id++;
					partido = new Partido(Grupo.get(2), Grupo.get(i), 0, 0, 0, id);
					partidos.add(partido);
				}
				
		}

	}
	// Hacer ranking de mundial tambien
	public static void verRankingGrupo(LinkedList<Pais> grupos, String grupo) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor ingrese el grupo del que desea saber el ranking");
		grupo = entrada.nextLine(); 
		
		for (Pais pais : grupos) {
			if (pais.getGrupo().equalsIgnoreCase(grupo)) {
				System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
			}
		}		
		}
	
	public static void jugarPartido(LinkedList<Partido> partidos, String grupo, LinkedList<Pais> grupos) {
		int p=0;
		int gol_local, gol_visitante;
		for (int i = 0; i<6; i++) {
			partidos.get(i).setGol_local((int)(Math.random()*6));
			partidos.get(i).setGol_visitante((int)(Math.random()*6));
			p++;
			partidos.get(i).setDuracion(Math.round(((Math.random()*10) + 90) * 100d) / 100d);
			System.out.println("Resultado partido " + p + "\n" + partidos.get(i).getGol_local() + " " +partidos.get(i) + " " + partidos.get(i).getGol_visitante() + "  // Duracion del partido: " + partidos.get(i).getDuracion() + " min.");
			gol_local = partidos.get(i).getGol_local();
			gol_visitante = partidos.get(i).getGol_visitante();
			partidos.get(i).getPais().setGoles_favor(partidos.get(i).getPais().getGoles_favor() + gol_local);
			partidos.get(i).getPais2().setGoles_favor(partidos.get(i).getPais2().getGoles_favor() + gol_visitante);
			partidos.get(i).getPais().setGoles_contra(partidos.get(i).getPais().getGoles_contra() + gol_visitante);
			partidos.get(i).getPais2().setGoles_contra(partidos.get(i).getPais2().getGoles_contra() + gol_local);
			if (partidos.get(i).getGol_local() > partidos.get(i).getGol_visitante()) {
				partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos() + 3);
				partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
				partidos.get(i).getPais2().setPp(partidos.get(i).getPais2().getPp()+1);
			} else if (partidos.get(i).getGol_visitante() > partidos.get(i).getGol_local()) {
				partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos() + 3);
				partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
				partidos.get(i).getPais().setPp(partidos.get(i).getPais().getPp()+1);
			} else {
				partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos() + 1);
				partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos() + 1);
				partidos.get(i).getPais().setPe(partidos.get(i).getPais().getPe()+1);
				partidos.get(i).getPais2().setPe(partidos.get(i).getPais2().getPe()+1);
			}
			
		}
		for (int i=0; i<4; i++) {
			grupos.get(i).setDiferencia_goles(grupos.get(i).getGoles_favor()-grupos.get(i).getGoles_contra());
		}
	}
	
	public static void avanzarFase(LinkedList<Pais> Fase, LinkedList<Pais> grupo) {
			Fase.add(grupo.get(0));
			Fase.add(grupo.get(1));	
	}		
		
		
	
	
	
	
	///////////////////////////////////////////////////////////////////
	public static void Octavos(LinkedList<Pais> paises) {
		 Iterator<Pais> paisesIter = paises.listIterator();
		 while(paisesIter.hasNext()) {
		      boolean i = paisesIter.next().isClasificado();
		      if(i == false) {
		        paisesIter.remove();
		      }
		    }
		 System.out.println(paises);
		}
	}


	



