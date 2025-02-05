import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{2,2,2},{3,3,3}};
        transpose(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
