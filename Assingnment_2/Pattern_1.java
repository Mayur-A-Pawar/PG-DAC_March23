import java.util.Scanner;
class Pattern_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows : ");
		n=sc.nextInt();
		System.out.println("Enter the number of rows = "+n);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}