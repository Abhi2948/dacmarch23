class Spattern9 {

	public static void main(String[] args) {
		
		int i,j,n=5;
		for(i=0;i<n;i++) {
			for(j=(n-i);j>=1;j--) {
				System.out.print(" ");
		}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		int k;
		for(i=n-1;i>=0;i--) {
			for(j=n;j>i-1;j--) {
				System.out.print(" ");
		}
			for(k=1;k<=i;k++) {
				System.out.print("*");
		}
			
		System.out.println();
		}

	}

}