/*
 * Ex17.java
 * 
 * Copyright 2022 Mariana Alves <Mariana Alves@DESKTOP-BDG0JMS>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class Ex17 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		//variaveis
		int cont = 0, qtd, numero, divisiveis, aux = 0;
		
		//obtendo a quantidade de termos da sequencia
		do
		{
			System.out.print("Quantidade de termos: ");
			qtd = read.nextInt();
			
			if(qtd > 20 || qtd < 1)
			{
				System.out.println("\nQuantidade deve ser de 1 � 20!\n");
			}
		}
		while(qtd > 20 || qtd < 1);
		
		
		//criando vetor X
		int[] X = new int[qtd];
		
        //l�-se: iniciando com valor 2; enquanto cont for diferente da quantidade de termos: acrescentar mais uma unidade em i
        for(int i = 2; cont != qtd; i++) 
        {
            
            numero = i;
            divisiveis = 0;
            
            //l�-se: iniciando com valor 1; enquanto j for menor ou igual ao numero (referente a i): acrescentar mais uma unidade em j
            for (int j = 1; j <= numero; j++) 
            {
				//se a sobra da divis�o do numero por j for zero
                if (numero % j == 0) 
                {
					//acrescentar mais uma unidade em divisiveis
                    divisiveis++;
                }
            }
            
            //se o n�mero (referente a i) for divisivel por 2 numeros
            if (divisiveis == 2) 
            {
				//inserir o numero (referente a i) em X na posi��o aux acrescido de uma unidade
                X[aux++] = numero;
                //acrescentar mais uma unidade em cont
                cont++;
            }
        }
        
        //exibindo o vetor X
        
        System.out.println("Vetor com a sequ�ncia de primos: ");
        
        for(int k = 0; k < X.length; k++)
        {
			System.out.printf("[%d] ", X[k]);
		}
		
		
		
		
		
	}
}

