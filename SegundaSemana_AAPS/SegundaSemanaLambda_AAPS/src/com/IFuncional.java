package com;

@FunctionalInterface
public interface IFuncional {

	// Interface funcional: es aquella que solo cuenta con un método abstracto
	public void operacion (int a, int b);

	// Automáticamente si agrego un método más a la interface, deja de ser funcional y marca error 
//	public void saludar (String saludo);
	
}
