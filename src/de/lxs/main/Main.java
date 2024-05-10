package de.lxs.main;

import de.lxs.math.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) 
	{
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Console Calculator");
		
		EntryPoint();
	}
	
	private static void EntryPoint()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter what kind of operation you want to peform (type help for help): ");
		
		int x;
		float first, second;
		
		String calculation = scanner.nextLine();
		
		switch(calculation.trim().toLowerCase())
		{
			case "addition":
				System.out.println("Please enter the numbers, you want to add together...");
				System.out.print("First: ");
				first = scanner.nextFloat();
				System.out.print("Second: ");
				second = scanner.nextFloat();
				Addition(first, second);
				break;
				
			case "subtraction":
				System.out.println("Please enter the numbers, you want to subtract...");
				System.out.print("First: ");
				first = scanner.nextFloat();
				System.out.print("Second: ");
				second = scanner.nextFloat();
				Subtraction(first, second);
				break;
				
			case "multiplication":
				System.out.println("Please enter the numbers, you want to multiply...");
				System.out.print("First: ");
				first = scanner.nextFloat();
				System.out.print("Second: ");
				second = scanner.nextFloat();
				Multiplication(first, second);
				break;
				
			case "division":
				System.out.println("Please enter the numbers, you want to divide...");
				System.out.print("First: ");
				first = scanner.nextFloat();
				System.out.print("Second: ");
				second = scanner.nextFloat();
				Division(first, second);
				break;
				
			case "factorial":
				System.out.println("Please enter the number, whose factorial you wish to calculate...");
				System.out.print("x: ");
				x = scanner.nextInt();
				Factorial(x);
				break;
				
			case "sine":
				System.out.println("Please enter the anlge - in degree -, whose sine you wish to calculate...");
				System.out.print("x: ");
				first = scanner.nextFloat();
				Sine(first);
				break;
				
			case "sqrt":
				System.out.println("Please enter the number, whose square root you wish to calculate");
				System.out.print("x: ");
				first = scanner.nextFloat();
				SquareRoot(first);
				break;
				
			case "int-power":
				System.out.println("Please enter the base and (int) exponent...");
				System.out.print("Base: ");
				first = scanner.nextFloat();
				System.out.print("Exponent: ");
				x = scanner.nextInt();
				IntPower(first, x);
				break;
				
			case "exit":
				scanner.close();
				System.exit(0);
				break;
				
			case "help":
				System.out.println("Supported operations:");
				try 
				{
					PrintOperations(scanner);
				} catch (IOException e) 
				{
					System.out.println(e);
					e.printStackTrace();
				}
				break;
				
			default:
				System.out.println("You have entered a non existant operation. "
				+ "If you are unsure about what operations are supported, type \"help\" for assistance.");
		}
		
		EntryPoint();
	}
	
	public static void Addition(float first, float second)
	{
		System.out.println(first + second);
	}
	
	public static void Subtraction(float first, float second)
	{
		System.out.println(first - second);
	}
	
	public static void Multiplication(float first, float second)
	{
		System.out.println(first * second);
	}
	
	public static void Division(float first, float second)
	{
		System.out.println(first / second);
	}
	
	public static void SquareRoot(float x)
	{
		System.out.println(Trig.sqrt(x));
	}
	
	public static void Factorial(int x)
	{
		System.out.println(Arith.Factorial(x));
	}
	
	public static void Sine(float x)
	{
		System.out.println(Trig.sin(x));
	}
	
	public static void IntPower(float base, int exponent)
	{
		System.out.println(Arith.IntPower(base, exponent));
	}
	
	private static void PrintOperations(Scanner scanner) throws IOException
	{
		try
		{
			Scanner file = new Scanner(new File("SupportedOperations.txt"));
			
			while(file.hasNextLine())
			{
				System.out.println(file.nextLine());
			}
			
			EntryPoint();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
