import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования методов класса Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Целочисленный массив: " + Arrays.binarySearch(intArray, 3));
        System.out.println("Целочисленный массив (диапазон): " + Arrays.binarySearch(intArray, 1, 4, 3));

        char[] charArray = {'a', 'b', 'c', 'd'};
        System.out.println("Символьный массив: " + Arrays.binarySearch(charArray, 'c'));
        System.out.println("Символьный массив (диапазон): " + Arrays.binarySearch(charArray, 1, 3, 'b'));

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("Массив с числами с плавающей точкой: " + Arrays.binarySearch(doubleArray, 3.3));
        System.out.println("Массив с числами с плавающей точкой (диапазон): " + Arrays.binarySearch(doubleArray, 0, 2, 2.2));

        String[] stringArray = {"apple", "banana", "cherry"};
        System.out.println("Строковый массив с компаратором: " + Arrays.binarySearch(stringArray, "banana", String::compareTo));

        // Пример использования методов класса Collections
        List<Integer> intList = java.util.Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Список целых чисел: " + Collections.binarySearch(intList, 3));

        List<String> stringList = java.util.Arrays.asList("apple", "banana", "cherry");
        System.out.println("Список строк с компаратором: " + Collections.binarySearch(stringList, "banana", String::compareTo));
    }
}