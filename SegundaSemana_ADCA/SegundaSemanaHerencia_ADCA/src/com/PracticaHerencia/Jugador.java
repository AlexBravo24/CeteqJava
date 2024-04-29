package com.PracticaHerencia;

public class Jugador extends Stats {
	private String name;
	private int jersey;
	private int age;
	private String team;
	
	public Jugador() {
		
	}

	public Jugador(int bb, int h, int h2, int h3, int hr, String name, int jersey, int age, String team) {
		super(bb, h, h2, h3, hr);
		this.name = name;
		this.jersey = jersey;
		this.age = age;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Jugador [name=" + name + ", jersey=" + jersey + ", age=" + age + ", team=" + team + ", toString()="
				+ super.toString() + "]";
	}
	
	
}




