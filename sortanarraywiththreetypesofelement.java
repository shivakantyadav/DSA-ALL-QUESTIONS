package sorting;





public class sortanarraywiththreetypesofelement {
	
	static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	  static void threetypesofelement(int a[]) {
		  for(int i =0;i<a.length-1;i++) {
			  for(int j=0;j<a.length-i-1;j++) {
				  if(a[j]>a[j+1]) {
					  swap(a,j,j+1);
				  }
			  }
		  }
	  }
	
	
	
	

	public static void main(String[] args) {
		int a[] = {0,1,0,1,2,2,0,1,2};
		threetypesofelement(a);
		for(int e: a) {
			System.out.print(e + " ");
		}
		

	}

}
