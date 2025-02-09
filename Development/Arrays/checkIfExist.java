import java.util.Arrays;

public class checkIfExist {
    public boolean checkIfExisting(int[] arr) {
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(i != j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
} 
