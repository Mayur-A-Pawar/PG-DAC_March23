class Que_13{
	public static void main(String args[]){
		char ch=64;
		for(int i=1;i<=5;i++)
		{			
			ch++;
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}