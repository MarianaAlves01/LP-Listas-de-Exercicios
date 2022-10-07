/*
 * Ex13.java
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

public class Ex13 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		System.out.print("insira um frase: ");
		String quote = read.nextLine();
		
		int cont = 0;
		
		for(int i = 0; i < quote.length(); i++)
		{
			if( ( (quote.charAt(i) >= 'a') && (quote.charAt(i) <= 'z') ) || ( ( quote.charAt(i) >= 'A') && (quote.charAt(i) <= 'Z') ) )
			{
				if(quote.charAt(i) != 'a' && quote.charAt(i) != 'A' && quote.charAt(i) != 'e' && quote.charAt(i) != 'E' && quote.charAt(i) != 'i' && quote.charAt(i) != 'I' && quote.charAt(i) != 'o' && quote.charAt(i) != 'O' && quote.charAt(i) != 'u' && quote.charAt(i) != 'U')
				{
					cont++;
				}
			}
		}
		
		System.out.printf("\n %d consoantes foram encontradas", cont);
	
	}
}
