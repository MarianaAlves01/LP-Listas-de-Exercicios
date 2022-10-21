/*
 * Ex10.java
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


import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		//criando vetores
		int [] PA = new int [5];
		int [] PB = new int [5];
		int [] PC = new int [10];
		
		
		//obtendo os elementos do A
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("VETOR A - �ndice n� %d = \n", i+1);
			PA[i] = read.nextInt();	
		}
		
		
		//espa�amento
		System.out.println(" ");
		
		
		//obtendo os elementos do B
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("VETOR B - �ndice n� %d = \n", i+1);
			PB[i] = read.nextInt();
		}
		
		
		
		System.arraycopy(PA, 0, PC, 0, 5);
        System.arraycopy(PB, 0, PC, 5, 5);

        System.out.println(Arrays.toString(PC));
		
	}
}

