package example.mainTask;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.io.*;
public class optionalTask {

    //1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    //public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longWord = "", shortWord = line;

        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println(" Самое длинное число: " + longWord + " ");
        System.out.println("Длина: " + longWord.length());
        System.out.println(" Самое короткое слово: " + shortWord + " ");
        System.out.println(" Длина: " + shortWord.length() + " ");
        */
    //2.     Вывести числа в порядке возрастания (убывания) значений их длины.
    /*
        String[] arr = new String[3];
        Scanner in = new Scanner(System.in);

        for ( int i = 0;  i < 3; i++){
            arr[i] = in.nextLine();
            for ( int c= arr.length - 1; c > 0; c--) {
                for ( int j = 0; j < 1; j++){
                    if ( arr[j].length()  > arr[j + 1].length() ) {
                        String tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr [ j+ 1] = tmp;
                    }
                }
            }
            for (int m = 0; m < arr.length; m++) {
                System.out.println(arr[m]);
            }
        }
    }
}
*/
    /*
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextLine();
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    */


    //3.     Вывести на консоль те числа,
    // длина которых меньше (больше) средней длины по всем числам, а также длину.

    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
         arr [i] = scan.nextInt();
        }
        solve(arr,N,temp);
    }
    public static void solve(int[]arr, int N, int [] temp) {
        double average = 0;
        int sum = 0;
        int count = 0;
        int t;
        for (int i = 0; i < arr.length; i++) {
            t = arr[i];
            while (t > 0) {
                t /=10;
                count++;
            }
            temp[i] = count;
            sum+=count;
            count = 0;
        }
        average = sum/N;
        System.out.println("Sum " + sum + " average " + average);

        for (int i = 0; i < arr.length; i++){
            if (temp[i] > average) {
                System.out.println(arr[i]);
            }
        }
    }

*/
    //4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
/*
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        //берем числа на ввод
        System.out.print("Array dimension: ");
        //просим пользователя ввести числа
        int[] arr = new int[scan.nextInt()];
        /*
Метод nextInt() считывает и возвращает введенное число. В нашей программе он используется для того, чтобы присвоить значение переменной*/
    /*    for ( int i = 0; i < arr.length; i++) {
            //проходим циклам по введеным цифрам
                System.out.printf("Elem %d:", i);
            //Выводим введенные цифры
                arr[i] = scan.nextInt();
            // присваиваем значение переменной arr[i], те значения, что мы вводили
        }
        System.out.println("\n" + Arrays.toString(arr));//приводим arr к строке
        foo(arr);//вызываем метод foo
    }
    private static void  foo (int[] arr) {
        int min = diffNum(arr[0]);
        int minElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (diffNum(arr[i]) < min) {
                min = diffNum(arr[i]);
                minElem = arr[i];
            }
        }
        System.out.printf("Elem: %d", minElem);

    }
    private static int diffNum(int x) {
        HashSet<Integer> nums = new HashSet<>();
        while( x > 0) {
            nums.add( x % 10);
            x/=10;
        }
        return nums.size();
    }
    */


    /*5.    Чётные и нечётные цифры
Ввести с клавиатуры число. Определить,
сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где
а - количество четных цифр, b - количество нечетных цифр.   */


    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Java класс BufferedReader читает текст из потока ввода символов, буферизуя прочитанные символы,
// чтобы обеспечить эффективное считывание символов, массивов и строк. Можно указать в конструкторе вторым параметром размер буфера.
        String b = reader.readLine();

        int count =  b.length();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < count;i++) {
            char ch = b.charAt(i);
            int c = Character.getNumericValue(ch);
            if (c != 0) {
                if ( c % 2 == 0)
                    even++;
                else odd++;
            }
        }
        System.out.println("Even:" + even + " " + "0dd:" + odd);
    }
}



