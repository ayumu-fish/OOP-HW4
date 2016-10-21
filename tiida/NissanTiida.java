package fcu.iecs.oop.tiida;

public class NissanTiida {
	private int n;
	public void tiida(){
		this.n++;
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.n;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	NissanTiida()
	{
		this.n=0;
	}
}
