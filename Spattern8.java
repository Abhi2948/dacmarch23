class Spattern8 {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=1;i<=row;++i)
		{
		for(int j=1;j<=i;++j)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		int i,j,n=5;
		for(i=n;i>=0;i--) {
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
		}
			
		System.out.println();
		}

	}

}