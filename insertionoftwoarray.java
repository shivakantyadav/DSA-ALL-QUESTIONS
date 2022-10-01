package sorting;

public class insertionoftwoarray {
	static void insertionofarray(int a[],int b[]) {
		int i =0;
		int j=0;
		while(i<a.length-1 && j<b.length-1) {
			if(a[i]==b[j]) {
				System.out.print(a[i]+ " ");
				i++;
				j++;
			}else if(a[i]<b[j]) {
				i++;
			}else if(a[i]>b[j]) {
				j++;
				
			}
			
		}
	}

	public static void main(String[] args) {
		int a[]= {2,5,6,6,8,8};
		int b[]= {1,1,2,3,6,6,9};
		 insertionofarray(a,b);

	}

}
