package com;

@FunctionalInterface
public interface IFuncional {

	// Interface funcional: es aquella que solo cuenta con un m�todo abstracto
	public void operacion (int a, int b);

	// Autom�ticamente si agrego un m�todo m�s a la interface, deja de ser funcional y marca error 
//	public void saludar (String saludo);
	
}
