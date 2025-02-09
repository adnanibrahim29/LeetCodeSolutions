public class validMountainArray{
    public boolean checkingValidMountainArray(int[] arr) {
        
        if(arr.length < 3) return false;
        
        int i = 0;
        
        // Climbing up 
        while(i < arr.length -1 && arr[i] < arr[i + 1]){
            i++;
        }
        
        // Checking if peak is at the start or last element
        if(i == 0 || i == arr.length -1) return false;
        
        // Climbing down
        while(i < arr.length -1 && arr[i] > arr[i + 1]){
            i++;
        }
        
        // Must reach the end of the array 
        return i == arr.length -1;
    }
} 
