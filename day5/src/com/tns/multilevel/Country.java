package com.tns.multilevel;

public class Country {
    private String countrynmame;
    private String capital;
	public String getCountrynmame() {
		return countrynmame;
	}
	public void setCountrynmame(String countrynmame) {
		this.countrynmame = countrynmame;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [countrynmame=" + countrynmame + ", capital=" + capital + "]";
	}
	
}
