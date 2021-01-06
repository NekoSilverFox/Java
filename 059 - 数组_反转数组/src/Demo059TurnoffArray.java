// 059 - 数组_反转数组

public class Demo059TurnoffArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};

        printArr(arr);

        for (int i = 0; i < (arr.length / 2 - 1); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1] = temp;
        }

        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
