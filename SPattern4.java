class SPattern4 {

	public static void main(String[] args) {
		int i,j,n=5,k;
		for(i=n;i>=1;i--) {
			for(j=n;j>i;j--) {
				System.out.print(" ");
		}
			for(k=1;k<=i;k++) {
				System.out.print("*");
		}
			
		System.out.println();
		}
	}

}