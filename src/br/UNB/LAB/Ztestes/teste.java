package br.UNB.LAB.Ztestes;

public class teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 1; 
		double b = 2; 
		
		System.out.println(a);
		System.out.println(b);
		
		dosvalores Numeros; // Criamos uma vari�vel do tipo Numeros 
		Numeros = aumentaDoisValores(a,b); // Dizemos que n�mero aponta para a mesma refer�ncia do retorno da fun��o aumentaDoisValores 
		a = Numeros.x; 
		b = Numeros.y; // Fazemos com que os nossos n�meros prim�rios sejam modificados 
		
		System.out.println(a);
		System.out.println(b);

	}
	
	public static dosvalores aumentaDoisValores(double a , double b) 
	{ 
	dosvalores objDoisValores = new dosvalores(a,b); 
	objDoisValores.x = objDoisValores.x + 1 ; 
	objDoisValores.y = objDoisValores.y + 1 ; 
	return objDoisValores; 
	} //Esse m�todo retorna um objeto do Tipo classeDoisValores , que cont�m seus atributos 

}

