package fcu.iecs.oop.tiida;
import  java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n;
		NissanTiida ipu=new NissanTiida();
		System.out.print("Please enter a number:");
		n=cin.nextInt();
		for(int i=0;i<n;i++)
		{
			ipu.tiida();
		}
		cin.close();
	}

}
