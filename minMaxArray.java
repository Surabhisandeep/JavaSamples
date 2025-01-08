public class MinMaxArray {
    public static void findMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {34, 67, 23, 89, 12, 43};
        findMinMax(arr);
    }
}
