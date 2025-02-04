class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1},{6,7,8}};
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                sum1 = sum1 + arr[i][j];
            }
            for(int j=0; j<arr[i].length - i; j++){
                sum2 = sum2 + arr[i][j];
            }
        }
        System.out.println("Lower Diagonal Sum : "+sum1);
        System.out.println("Upper Diagonal Sum : "+sum2);
    }
}
