package metier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import models.Collection;
import models.Film;
import models.Serie;
import utiles.Constantes;

public class App {
	public static void main(String[] args) throws IOException {
		
		Film filmtest = new Film("Avengers", "Joss Whedon","Action/Aventure", 2012);
		Film film1 = new Film("Avengers Infinity War", "Joss Whedon","Action", 2018);
		//System.out.println(filmtest);
		//System.out.println(" ");
		
		Serie serietest = new Serie("Breaking Bad", "Vince Gilligan", 62, 2008);
		//System.out.println(serietest);
		//System.out.println(" ");
		
		ArrayList<Film> collectionFilm = new ArrayList<>();
		collectionFilm.add(filmtest);
		collectionFilm.add(film1);
		//System.out.println(collectionFilm);
		//System.out.println(" ");
		
		HashMap<Integer, Serie> collectionSerie = new HashMap<>();
		collectionSerie.put(1, serietest);
		//System.out.println(collectionSerie);
		//System.out.println(" ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Constantes.WELCOME);
		System.out.println(Constantes.MENU);
		try {
			int menu = Integer.valueOf(br.readLine());
			if(menu == 1) {
				System.out.println(Constantes.CHOICE);
				String choisi = br.readLine();
				if(choisi.equals("film")) {
					System.out.println(Constantes.TITLE);
					String titre = br.readLine();
					
					System.out.println(Constantes.NAME);
					String realisateur = br.readLine();
					
					System.out.println(Constantes.GENRE);
					String genre = br.readLine();
					
					System.out.println(Constantes.YEAR);
					int annee = Integer.valueOf(br.readLine());
					
					Film film2 = new Film(titre, realisateur, genre, annee);
					collectionFilm.add(film2);
					System.out.println("Ajoutez : " + collectionFilm);
				}
				else if(choisi.equals("serie")) {
					System.out.println(Constantes.TITLE);
					String titre = br.readLine();
					
					System.out.println(Constantes.NAME);
					String realisateur = br.readLine();
					
					System.out.println(Constantes.EPISODES);
					int episode = Integer.valueOf(br.readLine());
					
					System.out.println(Constantes.YEAR);
					int annee = Integer.valueOf(br.readLine());
					
					Serie serie2 = new Serie(titre, realisateur, episode, annee);
					collectionSerie.put(2, serie2);
					System.out.println("Ajoutez : " + collectionSerie);
				}
				else {
					throw new Exception();
				}
			}
			else if(menu == 2) {
				Collection collectioncompte = new Collection("Arshad", "Umair");
				System.out.println("Votre compte " + collectioncompte.getNomUtilisateur() + " " + collectioncompte.getPrenomUtilisateur() + " est actif");
			}
			else if(menu == 3) {
				Collection collectiontest = new Collection("Arshad", "Umair", collectionFilm, serietest);
				System.out.println(collectiontest);
			}
			else {
				System.out.println("Introuvable");
			}
		}catch(NumberFormatException e){
			System.out.println("Erreur de format, veuillez saisir un chiffre");
		}catch(Exception e) {
			System.out.println("Saisie incorrecte, veuillez saisir correctement soit film soit serie");
		}
		System.out.println(" ");		
	}   
}
