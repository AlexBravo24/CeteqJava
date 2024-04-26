package com;
//HERENCIA- Se realiza con la palabra reservada "extends"
public class Empleado extends Persona {

	private String rfc;
	private String puesto;
	private String turno;
	private double salario;
	
	public Empleado () {}

	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, String turno,
			double salario) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.turno = turno;
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Generate Constructor using fields ( seleccionar en super constructor a invocar y cambiar a "Persona(String, String, int)
	
		//Generate Constructor Getters y setters (seleccionar todo) 
		
		//Generate Constructor to string (En las opciones sólo se ven unicamente, para ver los atributos de clase padre, desplegar la opcion de methods y dar to string 
		
     //POO Clase abstracta
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", turno=" + turno + ", salario=" + salario
				+ ", toString()=" + super.toString() + "]";
	}

	//Las clases hija que heredan de una clase abstracta
	//se ven obligadas a implementar los métodos abstractos y definir 
	//CÓMO se van a realizar
	
	@Override
	public void comer(String comida) {
		System.out.println("Soy un empleado y voy a comer" + comida);
		
	}
	
	public void checharEntrada () {
		System.out.println("Entrando a las 8am");
	}
	
	
	
	
			
	
	
}
