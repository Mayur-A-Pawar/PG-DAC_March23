class Que_10{
	public static void main(String args[]){
		for(int i=70;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=70;k++)
			{
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}
}