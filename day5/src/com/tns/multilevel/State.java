package com.tns.multilevel;

public class State extends Country {
	
	private String Statname;
	private String language;
	public String getStatname() {
		return Statname;
	}
	public void setStatname(String statname) {
		Statname = statname;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [Statname=" + Statname + ", language=" + language + ", getCountrynmame()=" + getCountrynmame()
				+ ", getCapital()=" + getCapital() + "]";
	}
	

}
