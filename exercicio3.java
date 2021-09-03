package array;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int[][] matriz= new int [3][3];
int contdez=0;

Scanner leia=new Scanner(System.in);

System.out.println("\n matriz[3][3]\n");

	
for (int linha=0;linha<3;linha++){
	
	for (int coluna=0;coluna<3;coluna++)
	{
		System.out.printf("\n digite um numero matriz[%d][%d]:",linha+1,coluna+1);
		matriz[linha][coluna]=leia.nextInt();
	}
	}
	for (int linha=0;linha<3;linha++){
				for (int coluna=0;coluna<3;coluna++){
			
					if(matriz[linha][coluna]>10)
					{
						contdez++;
					}
				}
				}
	System.out.printf("\n numeros maiores que 10:"+contdez);
	
			System.out.printf("\n\n matriz :\n\n");
			for (int linha=0;linha<3;linha++){
			for (int coluna=0;coluna<3;coluna++){
			System.out.printf("\t %d \t ",matriz[linha][coluna]);
	}

	}
			
			}
	}



