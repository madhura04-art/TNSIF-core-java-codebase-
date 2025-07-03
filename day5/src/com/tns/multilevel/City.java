package com.tns.multilevel;

public class City  extends State{
	private String Cityname;
	private String Area;
	public String getCityname() {
		return Cityname;
	}
	public void setCityname(String cityname) {
		Cityname = cityname;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + ", Area=" + Area + ", getStatname()=" + getStatname() + ", getLanguage()="
				+ getLanguage() + ", getCountrynmame()=" + getCountrynmame() + ", getCapital()=" + getCapital() + "]";
	}
	
	

}
