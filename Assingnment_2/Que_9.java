class Que_9{
	public static void main(String args[]){
		for(int i=65;i<=70;i++)
		{
			for(int j=70;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=65;k<=i;k++)
			{
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}
}