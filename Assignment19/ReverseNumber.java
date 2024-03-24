import java.util.Arrays;

class ReverseNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int[] newArray = reverse(arr);
        // arr = newArray;
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        return reverse;
    }

    static void reverse2(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}