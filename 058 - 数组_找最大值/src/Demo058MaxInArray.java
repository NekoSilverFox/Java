// 058 - 数组_找最大值

public class Demo058MaxInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};

        int max_arr =  arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max_arr < arr[i]) {
                max_arr = arr[i];
            }
        }

        System.out.println("Max" + max_arr);
    }
}
