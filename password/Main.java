package fcu.iecs.oop.password;
import  java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner cin=new Scanner(System.in);
		String s;
		PasswordEncorder ipu=new PasswordEncorder();
		while(true)
		{
			System.out.println("Please enter a password:");
			s=cin.next();
			if(ipu.equals("exit")) break;
			else
			{
				System.out.println(ipu.encode(s));
			}
		}
		
		cin.close();
	}
	
}
