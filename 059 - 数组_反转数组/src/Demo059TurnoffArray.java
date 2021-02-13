// 059 - 数组_反转数组

public class Demo059TurnoffArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};

        // 传递进去的就是array当中保存的地址值
        printArr(arr);

        for (int i = 0; i < (arr.length / 2 - 1); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1] = temp;
        }

        printArr(arr);

    }

    /*
    三要素
    返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
    方法名称：printArray
    参数列表：必须给我数组，我才能打印其中的元素。int[] array
 */
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
