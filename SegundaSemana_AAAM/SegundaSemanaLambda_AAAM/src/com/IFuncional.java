package com;

@FunctionalInterface  //por buena práctica de programación, es mejor agregar esto
public interface IFuncional {

	//interface funcional es aquella que cuenta solo con un metodo abstracto
	
	public void operacion (int a, int b);
	
	//public void saludar (String saludo);  //si se agregara otro metodo abstracto ya marcaria errores ya que una interfase funcional SOLO puede tener 1 argumento abstracto
	
	
}
