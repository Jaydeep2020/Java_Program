import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,0,5,3,0,2};
        int[] result = zerotoEnd(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] zerotoEnd(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[end] != 0 && arr[start] == 0){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }else if(arr[end] == 0){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}
