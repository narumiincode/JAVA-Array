package array;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia= new Scanner(System.in);
		
		int numero[]=new int[5];
		int soma=0,contimpar=0;
		
		
			for(int x=0;x<5;x++) 
			{
			System.out.printf("digite um numero");
			numero[x]=leia.nextInt();
			}
		    for (int x=0;x<5;x++)
		    {
		    	if(numero[x]%2==0)
		    {
		    		soma+=numero[x];
			
		    	System.out.printf("\n par:"+numero[x]);
		    }
		    	
		    }
		    
		    for (int x=0;x<5;x++) 
		    {
		    	if(numero[x]%2!=0)
		    {	
		    	contimpar++;
		    	
		    	System.out.printf("\n impar:"+numero[x]);	
		    }
		    }
		    
		    System.out.printf("\n\n soma dos pares:\n:"+soma);
		    System.out.printf("\n\n total de impares:\n:"+contimpar);   	 
		}
			}
	
			
			
			

