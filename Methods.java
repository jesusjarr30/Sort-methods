import java.util.Vector;

public class Methods {
	
		
	Methods(){
		
	}
	
	void Bubble_sort(int[] a) {
		int len=a.length-1;
		int first,second;
		for(int i=0;i<a.length;i++) {
			for(int x=0;x<len;x++) {
				first=a[x];
				second=a[x+1];
				
				if(first>second) {
					a[x]= second;
					a[x+1]=first;
				}
			}
			len=len-1;
			
		}
	}
	void printV(int[] a) {
		System.out.println("the verctor is");
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Numeber "+i+" : "+a[i]);
			
		}
		System.out.println("End");
	}

	void QuicksortM(int[] vec) {
		// in this part I will organize the method
		int tam=vec.length;
		int pivot=tam/2;
		System.out.println("El pivot is "+pivot);
		quicksort(vec,0,vec.length -1);
		
		
		
		
	}
	void quicksort(int[] vec, int lowIndex,int MaxIndex) {
		
		
		if(lowIndex >= MaxIndex) {
			return;
		}
		//last number as the pivot
		int pivot=vec[MaxIndex];
		int leftPointer=lowIndex;
		int rightPointer=MaxIndex;
		
		while(leftPointer < rightPointer) {
			while(vec[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while(vec[rightPointer] >= pivot && leftPointer <rightPointer) {
				rightPointer--;
			}
			swap(vec,leftPointer,rightPointer);
			
			
		}
	//to move the pivot
	swap(vec,leftPointer,MaxIndex);
	quicksort(vec,lowIndex,leftPointer-1);
	quicksort(vec, leftPointer+1, MaxIndex );
	
	}
	private void swap(int[] vec, int index1,int index2) {
		//swap the position with indicate parameter
		int temp=vec[index1];
		vec[index1]=vec[index2];
		vec[index2]=temp;
	}
	
	void insetion(int[] vec){
		int pointer=0;
		int temp=0;
		
		for(int i=0;i<vec.length-1;i++) {
			
			if(vec[i]>vec[i+1]) {
				
				pointer=i;
				temp=vec[i];
				vec[i]=vec[i+1];
				vec[i+1]=temp;
				
				while(pointer!=0) {
					if(vec[pointer-1]  > vec[pointer]) {
						
						temp=vec[pointer];
						vec[pointer]=vec[pointer-1];
						vec[pointer-1]=temp;
						pointer--;
					
					}else 
						break;
				}				
			}
		}
	}
	void merge(int[] vec) {
		int tam=vec.length;
		if(tam<2) {
			return;
		}
		int val=tam/2;
		int[] leftHalft=new int[val];
		int[] rightHalft=new int[tam-val];
		
		for(int i=0; i<val ;i++) {
			leftHalft[i]=vec[i];
		}
		for(int i = val; i < tam; i++) {
			rightHalft[i-val]= vec[i];
		}
		merge(leftHalft);
		merge(rightHalft);
	

		mershort(vec,leftHalft,rightHalft);
	}


	void mershort(int[] vec, int[] leftHalft, int[] rightHalft) {
		int sizeR=rightHalft.length;
		int sizeL=leftHalft.length;
		
		int i=0,j=0,z=0;
		
		while( i<sizeL && j<sizeR) {
			
			if(leftHalft[i] <= rightHalft[j]) {
				vec[z] = leftHalft[i];
				i++;
				z++;
			}
			else {
				vec[z]=rightHalft[j];
				j++;
				z++;
			}
			
		}
		if(i<sizeL) {
			while(i<sizeL) {
				vec[z]=leftHalft[i];
				i++;
				z++;
			}
		}else{
			while(j<sizeR) {
				vec[z]=rightHalft[j];
				j++;
				z++;
			}
		}

	}

	public void selectiopnSort(int[] vec) {
		int minimun=0;
		int tam=vec.length;
		int i=0;
		int aux;
		while(i<tam) {
			minimun=i;
			for(int x=i;x<tam;x++) {
				if(vec[i] > vec[x]) {
					aux=vec[i];
					vec[i]=vec[x];
					vec[x]=aux;
				}
			}
			i++;
		}	
	}
	
	
	
}
