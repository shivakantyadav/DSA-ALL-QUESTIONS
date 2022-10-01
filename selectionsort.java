package sorting;

public class selectionsort {
	
	static  void swap(int a[],int i,int j) {
		int temp =a[i];
		a[i]= a[j];
		a[j]=temp;
		
	}
	
	public static  void selection(int[] a) {
		for(int i =0;i<a.length-1;i++) {
			int min = i;
			for(int j =i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			swap(a,min,i);
		}
	}

	public static void main(String[] args) {
		int a[]= {8,1,9,3,4};
      selection(a);
      
      for(int e: a) {
    	  System.out.print(e + " ");
      }
	}

}
