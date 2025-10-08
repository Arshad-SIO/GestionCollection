package models;

public class Film {
	
	private String nomFilm;
	private String nomRealisateur;
	private String genreFilm;
	private int anneeFilm;
	
	public Film(String nomFilm, String nomRealisateur, String genreFilm, int anneeFilm) {
		this.nomFilm = nomFilm;
		this.nomRealisateur = nomRealisateur;
		this.genreFilm = genreFilm;
		this.anneeFilm = anneeFilm;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public String getNomRealisateur() {
		return nomRealisateur;
	}

	public void setNomRealisateur(String nomRealisateur) {
		this.nomRealisateur = nomRealisateur;
	}
	
	public String getGenreFilm() {
		return genreFilm;
	}

	public void setGenreFilm(String genreFilm) {
		this.genreFilm = genreFilm;
	}

	public int getAnneeFilm() {
		return anneeFilm;
	}

	public void setAnneeFilm(int anneeFilm) {
		this.anneeFilm = anneeFilm;
	}

	@Override
	public String toString() {
		return "Film : " + nomFilm + "\nRealisateur : " + nomRealisateur + "\nGenre : " + genreFilm + "\nAnnee sortie : " + anneeFilm;
	}
}
