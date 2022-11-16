// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("введите число n: ");
//         int n = sc.nextInt();
//         int result = 0;
//         // for (int i = 0; i <= n; i++){
//         //     System.out.println(result + " " + i);  
//         //     result += i;
//         // }
//         // System.out.println(result);
//         result = 0;
//         int sumResult = sumOfNumbers(n+1, result);
//         System.out.println(sumResult);
//         int multResult = multOfNumbers(n+1, result+1);
//         System.out.println(multResult);
//     }
//     public static int sumOfNumbers(int n, int result) {
//         if (n < 1){
//             return result;
//         }
//         n -= 1;
//         System.out.println("n=" + n + " result=" + result);
//         result += n;
//         return  sumOfNumbers(n, result);
//     }
//     public static int multOfNumbers(int n, int result){
//         if (n < 2){
//             return result;
//         }
//         n -= 1;
//         System.out.println("n=" + n + " result=result * n " + result + "*" + n);
//         result *= n;       
//         return  multOfNumbers(n, result);
//     }
// }

// 2. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("введите число 1: ");
//         int num1 = sc.nextInt();
//         System.out.println("введите число 2: ");
//         int num2 = sc.nextInt();
//         System.out.println(method(num1, num2));
//     }
//     public static boolean method(int num1, int num2){
//         return num1 + num2 > 10 & num1 + num2 < 20;
//     } 
// }

// 3.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("введите число ");
//         int num = sc.nextInt();
//         method(num);
//     }
//     public static void method(int num) {
//         System.out.println("Число положительное? -> " + (num > 0));
//     }
// }

// 4. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("введите число ");
//         int num = sc.nextInt();
//         System.out.println(method(num));
//     }
//     public static boolean method(int num) {
//         return (num > 0);
//     }
// }

// 5. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("введите строку ");
//         String str = sc.nextLine();
//         System.out.println("введите число");
//         int num = sc.nextInt();
//         method(str, num);
//     }
//     public static void method(String str, int num) {
//         for (int index = 1; index <= num; index++) {
//             System.out.println(str);
//         }
//     }
// }

// 6. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("введите год: ");
//         int year = sc.nextInt();
//         System.out.println("високосный ? -> " + method(year));
//     }
//     public static boolean method(int year) {
//         return (year % 4 == 0 & year % 100 != 0 | year % 400 == 0);         
//     }
// }

// 7. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
// public class Program {
//     public static void main(String[] args) {       
//         int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0 };
//         for (int item : arr){
//             System.out.print(item + " ");  
//         }
//         System.out.println();
//         method (arr);
//     }
//     static void method (int [] arr) {
//         for (int item = 0; item < arr.length; item++){
//             if (arr[item] == 1){
//                 arr[item] = 0;}
//             else{
//                 arr[item] = 1;}
//             System.out.print(arr[item] + " ");
//         }
//     }
// }

//8. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

// public class Program {
//     public static void main(String[] args) {
//         int [] arr = new int [100];
//         int countt = 1;
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = countt++;
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//9. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
// public class Program {
//     public static void main(String[] args) {
//         int [] arr ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//         for (int i = 0; i < arr.length; i++) {           
//             if (arr[i] < 6){
//                 arr[i] *= 2;
//             }
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// 10. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// public class Program {
//     public static void main(String[] args) {
//         int [] [] arr = new int [20] [20];
//         int counter = arr.length-1;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j <= i; j++) {
//                 arr [i] [j] = 1;
//                 arr [i] [counter] = 1;
//                 counter--;
//             }            
//         }
//         printArray(arr);
//     }
//     public static void printArray( int[][]arr) {
//         for (int index = 0; index < arr.length; index++) {
//             System.out.println();
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(" " + arr [index][i]);               
//             }
//         }
//         System.out.println();
//     }
// }

//11. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
// public class Program {
//     public static void main(String[] args) {
//         int [] arr = method(5, 6);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
//     public static int [] method (int len, int initialValue){
//         int [] arr = new int [len];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = initialValue;
//         }
//         return arr;
//     }
// }

//12. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
// import java.lang.Math;
// public class Program {
//     public static void main(String[] args) {
//         int [] arr = new int [10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = (int) (Math.random() * 100);
//             System.out.print(arr[i] + " ");
//         }
//         int minItem = arr[0];
//         int maxItem = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < minItem){
//                 minItem = arr[i];
//             }
//             if (arr[i] > maxItem){
//                 maxItem = arr[i];
//             }
//         }
//         System.out.print("\n" + "min = " + minItem + "\n" + "max = " + maxItem + "\n");
//     }
// }