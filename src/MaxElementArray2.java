import java.util.Scanner;

public class MaxElementArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = input.nextInt();
        System.out.println("Enter colum: ");
        int colum = input.nextInt();
        int [][] array = createArray(row , colum);
        int max = findMax(array);
        disPlay(array);
        System.out.println(max);
    }

    static void disPlay(int [][] arr){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int findMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int [][] createArray (int row , int colum){
        int [][] arr = new int[row][colum];
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < colum ; j++){
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
}
