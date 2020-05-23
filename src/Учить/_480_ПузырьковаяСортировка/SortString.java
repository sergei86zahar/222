package Учить._480_ПузырьковаяСортировка;
// A bubble sort for Strings.
class SortString {
    static String[] arr = {"Now", "is", "the", "time", "for",  "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"};
    public static void main(String args[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                /*
                Меньше нуля - Вызывающая символьная строка меньше строки str
                Больше нуля - Вызывающая символьная строка больше строки str
                Нуль - Символьные строки равны
                 */
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}
