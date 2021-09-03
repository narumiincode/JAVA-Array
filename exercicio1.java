package array;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		
		int A[]= {1, 0, 5, -2, -5, 7};
		int soma=0;
		
		
		{				
			soma=A[0]+A[1]+A[2];
			System.out.printf("\n a soma é:%d\n",soma);
		}
	
		A[4]=100;
		
		for(int i=0;i<6;i++)
		{
		System.out.printf("\n a soma é:%d",A[i]);
		}
		
	
	}
	}

