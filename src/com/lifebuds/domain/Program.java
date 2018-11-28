package com.lifebuds.domain;

public class Program {

	private int pgm_id;
	private String pgm_name;
	private String pgm_what;
	private String pgm_time;
	private String pgm_venue;
	private String pgm_date;
	private String pgm_image;
	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Program(int pgm_id, String pgm_name, String pgm_what, String pgm_time, String pgm_venue, String pgm_date,
			String pgm_image) {
		super();
		this.pgm_id = pgm_id;
		this.pgm_name = pgm_name;
		this.pgm_what = pgm_what;
		this.pgm_time = pgm_time;
		this.pgm_venue = pgm_venue;
		this.pgm_date = pgm_date;
		this.pgm_image = pgm_image;
	}
	public int getPgm_id() {
		return pgm_id;
	}
	public void setPgm_id(int pgm_id) {
		this.pgm_id = pgm_id;
	}
	public String getPgm_name() {
		return pgm_name;
	}
	public void setPgm_name(String pgm_name) {
		this.pgm_name = pgm_name;
	}
	public String getPgm_what() {
		return pgm_what;
	}
	public void setPgm_what(String pgm_what) {
		this.pgm_what = pgm_what;
	}
	public String getPgm_time() {
		return pgm_time;
	}
	public void setPgm_time(String pgm_time) {
		this.pgm_time = pgm_time;
	}
	public String getPgm_venue() {
		return pgm_venue;
	}
	public void setPgm_venue(String pgm_venue) {
		this.pgm_venue = pgm_venue;
	}
	public String getPgm_date() {
		return pgm_date;
	}
	public void setPgm_date(String pgm_date) {
		this.pgm_date = pgm_date;
	}
	public String getPgm_image() {
		return pgm_image;
	}
	public void setPgm_image(String pgm_image) {
		this.pgm_image = pgm_image;
	}
	@Override
	public String toString() {
		return "Program [pgm_id=" + pgm_id + ", pgm_name=" + pgm_name + ", pgm_what=" + pgm_what + ", pgm_time="
				+ pgm_time + ", pgm_venue=" + pgm_venue + ", pgm_date=" + pgm_date + ", pgm_image=" + pgm_image + "]";
	}
	
	
	
}
