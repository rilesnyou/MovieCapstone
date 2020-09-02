package co.grandcircus.MoviesCapstone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Genre genres;
	private String original_language;
	private String original_title;
	private String overview;
	private String release_date;
	private Double vote_average;
	
	public Genre getGenres() {
		return genres;
	}
	public void setGenres(Genre genres) {
		this.genres = genres;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOriginal_language() {
		return original_language;
	}
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}
	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public Double getVote_average() {
		return vote_average;
	}
	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}
	
	
}