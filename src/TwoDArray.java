import java.util.Arrays;
public class TwoDArray {
    public static void main(String args[]) {
//        defined 2D array
        int arr[][] = {
                {1,2,3,4,5},
                {10,20,50,78,100},
                {1100,80,70,57,66},
                {89,99,65,34,54}
        };

        int max = Integer.MIN_VALUE;
        int[] index = null;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    index= new int[] { i, j };
                }
            }

        }
        System.out.println("Maximum Value : " + max);
        System.out.println("index of Value : " + Arrays.toString(index));
    }
}
