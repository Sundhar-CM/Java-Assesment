public class RemoveDuplicates {
	public static int removeDuplicateElements(int array[], int len){  
        if (len==0 || len==1){  
            return len;  
        }  
        int[] temp = new int[len];  
        int j = 0,i=0;  
        for ( i=0; i<len-1; i++){  
            if (array[i] != array[i+1]){  
                temp[j++] = array[i];  
            }  
         }  
        temp[j++] = array[len-1];     
        for (i=0; i<j; i++){  
            array[i] = temp[i];  
        }  
        return j;  
    }       
	public static void main(String[] args) {
		
	int[] arr= {10,10,20,30,30,30,50,60,60};
	int length = arr.length;  
    length= removeDuplicateElements(arr, length);  
    for (int i=0; i<length; i++)  
       System.out.print(arr[i]+" "); 
	
}
}
