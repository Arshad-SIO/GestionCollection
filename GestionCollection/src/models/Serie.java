package models;

public class Serie {
	
	private String nomSerie;
	private String nomRealisateur;
	private int nbEpisode;
	private int anneeSerie;
	
	public Serie(String nomSerie, String nomRealisateur, int nbEpisode, int anneeSerie) {
		this.nomSerie = nomSerie;
		this.nomRealisateur = nomRealisateur;
		this.nbEpisode = nbEpisode;
		this.anneeSerie = anneeSerie;
	}

	public String getNomSerie() {
		return nomSerie;
	}

	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}

	public String getNomRealisateur() {
		return nomRealisateur;
	}

	public void setNomRealisateur(String nomRealisateur) {
		this.nomRealisateur = nomRealisateur;
	}

	public int getNbEpisode() {
		return nbEpisode;
	}

	public void setNbEpisode(int nbEpisode) {
		this.nbEpisode = nbEpisode;
	}

	public int getAnneeSerie() {
		return anneeSerie;
	}

	public void setAnneeSerie(int anneeSerie) {
		this.anneeSerie = anneeSerie;
	}

	@Override
	public String toString() {
		return "Serie : " + nomSerie + "\nRealisateur : " + nomRealisateur + "\nNombre des episodes : " + nbEpisode
				+ "\nAnnee sortie : " + anneeSerie;
	}
}
