class Pattern10a {

	public static void main(String[] args) {
		
		for(int i=4;i>=0;i--)
		{
			int a=65;
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++)
			{
				
				System.out.print((char)(a+k)+" ");
			}
			System.out.println();
		}

	}

}