/**
 *
 * @author cgonc
 */
public class Array {   
    
    public static void main(String[] args) {
        
        Array nc =new Array();
        
        int[] num = {3,6,-1,10,5};
        
        int mx = nc.getLargest(num);
        
        System.out.println("The largest number is: " + mx);
            
    }
    
    int getLargest(int[] arr){
        
        int max = arr[0];
        int i = 0 ;
        
        while(i<arr.length){
            
            if (arr[i] > max){
                
                max = arr[i];
                
            }
            i++;
        }
        return max;
    }
    
}
