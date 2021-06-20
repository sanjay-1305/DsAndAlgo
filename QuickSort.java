package Ds.Algo;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {10,7,8,9,1,5};
		int n=arr.length;
		quicksort(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	 static void quicksort(int[] arr, int lb, int ub) {
		 int loc;
		if(lb<ub) {
			 loc=Partition(arr,lb,ub);
			quicksort(arr,lb,loc-1);
			quicksort(arr,loc+1,ub);
		}
		
	}

	 static int Partition(int[] arr,int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high;j++) {
			if(arr[j]<pivot) {
				i++;
				Swap(arr,i,j);
			}
		}
		Swap(arr,i+1,high);
		return i+1;
	}

	private static void Swap(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	}

		
	}

	
	
	


