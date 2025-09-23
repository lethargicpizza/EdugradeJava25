public class BubbleSort {
    public static void main(String[] args) {
        int[] myFirstArray = {4, 7, 9, 7, 6};

        System.out.println(averageArray(myFirstArray));
        System.out.println(maxValue(myFirstArray));

        int[] reversedArray = reverseArray(myFirstArray);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }

    public static double averageArray(int[] array) {
        int total = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        average = total / array.length;
        return average;
    }

    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int reversedIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            reversedArray[reversedIndex] = array[i];
            reversedIndex--;
        }

        return reversedArray;
    }
}