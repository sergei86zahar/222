package _Java8._Глава_18._633;
import java.util.Arrays;
class ArraysDemo {
    public static void main(String args[]) {
        // Allocate and initialize array. выделить и инициализировать массив
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;
        // Display, sort, and display the array.  вывести, отсортировать и снова
        // вывести содержимое массива
        System.out.print("Original contents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);
        // Fill and display the array. залолнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill(): ");
        display(array);
        // Sort and display the array. отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("After sorting again: ");
        display(array);
        // Binary search for -9. выполнить двоичный поиск значения - 9
        System.out.print("The value -9 is at location ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
