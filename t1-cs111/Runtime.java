//1.1 One dimensional Array

//initialize an array
public class Runtime{

    //runtime: O(n), ~n
    public static void initialize1D(int[] array, int value){
        for(int i=0;i<array.length;i++){
            // array[i] = StdRandom.uniform(value);
            //random value between 0 and value (upper bound)
        }
    }

    //runtime: O(n^2), ~n^2
    public static void initialize2D(int[][] array, int value){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                // array[i][j] = StdRandom.uniform(value);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        initialize2D(a, 3);
    }
}
