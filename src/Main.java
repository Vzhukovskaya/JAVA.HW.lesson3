import java.util.Scanner;
// Не могу найти ошибку - почему то не подсвечиваеться фиолетовым in, out, scanner?! хотя отрабатывает
public class Main {
    static Scanner scanner = new Scanner(System.in); //Создаю глобальную переменную для функции.

    public static void main(String[] args) {
//1) Метод(процедура), которая будет считывать значения и выводить их в консоль.
    int a;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите значение: ");
    a = scanner.nextInt();
    System.out.println("Вы ввели: " + a);

    //Вызываю функцию для задачи 2:
        System.out.println(sum());

//3*) Сделать глобальную переменную static Scanner и считать два значения в методе main, передать их в функцию, вычислить
//    их разность и вывести на консоль их метода main.
    int a1;
        System.out.println("Введите значение: ");
        a1 = scanner.nextInt();
    int b1;
        System.out.println("Введите значение: ");
        b1 = scanner.nextInt();
    //Вызываю функцию для задачи 3:
    System.out.println(num(int a1, int b1));

    }
//2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму.
     static int sum(){
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        return a+b+c;
    }
//3) Функция для нахождения разности чисел:
    static int num(int a1, int b1){
        return a1 - b1;
    }
}