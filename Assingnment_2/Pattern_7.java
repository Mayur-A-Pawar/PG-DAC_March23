class Pattern_7{
	public static void main(String args[]){
		
		
		/*for(int i=1;i<=7;i++)
		{
			if(i==1||i==7)
				System.out.println("   *");
			if(i==2||i==6)
				System.out.println("  ***");
			if(i==3||i==5)
				System.out.println(" *****");
			if(i==4)
				System.out.println("*******");
		}*/
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int m=1;m<i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			if(i==1)
				continue;
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int m=3; m>=i;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}