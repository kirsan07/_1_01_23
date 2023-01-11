import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        // создали массив t размером input
        int[] t = new int[input];
        while (i < input) {
            // каждому элементу массива присваиваем ввод числа с клавиатуры
            t[i] = scanner.nextInt();
            i++;
        }
        int s = scanner.nextInt();
        // создали счетчик c для подсчета элементов массива t подходящих под условие
        int c = 0;
        // в рамках предложенной модели программы, нам нужна ещё одна переменная счетчик
        // однако, просто обнулим ранее задекларированную переменную i
        i = 0;
        while (true) {
            // условие для выхода из цикла
            if (i == t.length) {
                break;
            }
            if (t[i] > s) {
                c = c + t[i];
            }

            // увеличиваем каждую итерацию i на 1, т.к. i нам нужен для вызова
            // элементов ранее определенного массива t
            i++;
        }

        System.out.println(c);
    }
}
