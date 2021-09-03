package array;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz1=new int [2][2];
		int[][] matriz2=new int [2][2];
		int[][] matriz3=new int [2][2];
		int[][] matriz4=new int [2][2];
		int x;
		int op,opp;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\n 1°-matriz[2][2]\n");
		
		for (int linha=0;linha<2;linha++){
			
			for (int coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\n digite um numero matriz[%d][%d]:",linha+1,coluna+1);
				matriz1[linha][coluna]=leia.nextInt();
			}
		}
		System.out.println("\n 2°-matriz[2][2]\n");
	for (int linha=0;linha<2;linha++){
		
		for (int coluna=0;coluna<2;coluna++)
		{
			System.out.printf("\n digite um numero matriz[%d][%d]:",linha+1,coluna+1);
			matriz2[linha][coluna]=leia.nextInt();
		}
	}
	
	System.out.printf("\n\n 1°matriz :\n\n");
	for (int linha=0;linha<2;linha++){
	for (int coluna=0;coluna<2;coluna++){
	System.out.printf("\t %d \t ",matriz1[linha][coluna]);
}

}
	System.out.printf("\n\n 2°matriz :\n\n");
	for (int linha=0;linha<2;linha++){
	for (int coluna=0;coluna<2;coluna++){
	System.out.printf("\t %d \t ",matriz2[linha][coluna]);
}

}
	System.out.println("\n MENU");
	System.out.println("\n 1-Somar matrizes (1° + 2°)");
	System.out.println("\n 2-Subtrair matrizes (1° - 2°)");
	System.out.println("\n 301-Somar 1° matriz+constante");
	System.out.println("\n 302-Somar 2° matriz+constante");
	System.out.println("\n 302-Somar ° matriz+constante");
	System.out.println("\n 4-imprimir 1° e 2° matriz");
	op=leia.nextShort();
	
	switch(op)
	{
	case 1:
		
		System.out.printf("\n\n Resultado da soma :\n\n");
		for (int linha=0;linha<2;linha++){
			for (int coluna=0;coluna<2;coluna++){
			matriz3[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
			System.out.printf("\t %d \t ",matriz3[linha][coluna]);
		}

		}
		
	case 2:
		
		System.out.printf("\n\n Resultado da subtração :\n\n");
		for (int linha=0;linha<2;linha++){
			for (int coluna=0;coluna<2;coluna++){
			matriz3[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
			System.out.printf("\t %d \t ",matriz3[linha][coluna]);
		}

		}
		
	case 3:
		
		
	case 301:
		
		System.out.printf("\n\n Digite uma constante :\n\n");
		x=leia.nextInt();
		
		System.out.printf("\n\n Adicionando constante :\n\n");
		for (int linha=0;linha<2;linha++){
			for (int coluna=0;coluna<2;coluna++){
			matriz1[linha][coluna]=matriz1[linha][coluna]+x;
			System.out.printf("\t %d \t ",matriz3[linha][coluna]);
		}
		}
		
	case 302:
		
		System.out.printf("\n\n Digite uma constante :\n\n");
		x=leia.nextInt();
		
	System.out.printf("\n\n Adicionando constante :\n\n");
	for (int linha=0;linha<2;linha++){
		for (int coluna=0;coluna<2;coluna++){
		matriz2[linha][coluna]=matriz2[linha][coluna]+x;
		System.out.printf("\t %d \t ",matriz3[linha][coluna]);
	
		}
		}
	
	case 303:
		System.out.printf("\n\n Digite uma constante :\n\n");
		x=leia.nextInt();
		
		System.out.printf("\n\n Adicionando constante :\n\n");
		for (int linha=0;linha<2;linha++){
			for (int coluna=0;coluna<2;coluna++){
			matriz1[linha][coluna]=matriz1[linha][coluna]+x;
			System.out.printf("\t %d \t ",matriz3[linha][coluna]);
			matriz2[linha][coluna]=matriz2[linha][coluna]+x;
			System.out.printf("\t %d \t ",matriz4[linha][coluna]);
	}
		}
		
	case 4:
		System.out.printf("\n\n 1°matriz :\n\n");
		for (int linha=0;linha<2;linha++){
		for (int coluna=0;coluna<2;coluna++){
		System.out.printf("\t %d \t ",matriz1[linha][coluna]);
		}
		}
		System.out.printf("\n\n 2°matriz :\n\n");
		for (int linha=0;linha<2;linha++){
		for (int coluna=0;coluna<2;coluna++){
		System.out.printf("\t %d \t ",matriz2[linha][coluna]);
		}
		}
	}
}
}
