package comm.example.model;

public class League {
	
	
	private String title;
	private int year;
	private String season;
	public League() {
		super();
	}
	public League( int year, String season,String title) {
		super();
		this.title = title;
		this.year = year;
		this.season = season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	
	

}
