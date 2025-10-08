package models;

import java.util.List;

public class Collection {
	
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private List<Film> films;
	private Serie series;
	
	public Collection(String nomUtilisateur, String prenomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public Collection(String nomUtilisateur, String prenomUtilisateur, List<Film> films, Serie series) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.films = films;
		this.series = series;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public Serie getSeries() {
		return series;
	}

	public void setSeries(Serie series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "L'utilisateur " + nomUtilisateur + " " + prenomUtilisateur + " possede la collection de films "
				+ films + " et\nde series [ " + series + " ]";
	}
}
