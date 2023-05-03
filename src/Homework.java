import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        System.out.println("Домашние задания");
        System.out.println();
        // second(); // перевод текущего времени в секунды от начала суток
        // triangle(); // проверка типа треугольника (остроугольный, тупоугольный или прямой;
        // changeMinMax(); // замена местами наименьшего и наибольшего элементов в массиве
        // numberFibonacci(); // Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n
        // collatz(); // гипотеза Коллатца - количество шагов до x = 1
        // nok();
        // list();
        /**
            * Средняя (3 балла)
            *
            * В заданном списке list каждый элемент, кроме первого, заменить
            * суммой данного элемента и всех предыдущих.
            * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
            * Пустой список не следует изменять. Вернуть изменённый список.
            *
            * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
         * */
        // polinom();
        /**
             * Средняя (3 балла)
             *
             * Рассчитать значение многочлена при заданном x:
             * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
             * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
             * Значение пустого многочлена равно 0 при любом x.
             */
        // primeFactors();
        /**
         * Средняя (3 балла)
         *
         * Разложить заданное натуральное число n > 1 на простые множители.
         * Результат разложения вернуть в виде списка множителей, например 75 -> (3, 5, 5).
         * Множители в списке должны располагаться по возрастанию.
         */
    }

    public static void second() {
        /*
         Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
         Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
         */
        System.out.println("Введите текущее время");
        Scanner in = new Scanner(System.in);
        System.out.println("часы:");
        int hour = in.nextInt();
        System.out.println("минуты:");
        int minute = in.nextInt();
        System.out.println("секунды:");
        int second = in.nextInt();
        int secondTotal = hour*3600+minute*60+second;
        System.out.println("С начала суток прошло " + secondTotal +" секунд.");
    }
    public static void triangle() {
        /*
         Треугольник задан длинами своих сторон a, b, c.
         Проверить, является ли данный треугольник остроугольным (вернуть 0),
         прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
         Если такой треугольник не существует, вернуть -1.
         */
        System.out.println("Введите значения длин сторон треугольника a, b и c");
        System.out.println("(c - значение длины наибольшей стороны:)");
        Scanner in = new Scanner(System.in);
        System.out.println("a=");
        float sideA = in.nextFloat();
        System.out.println("b=");
        float sideB = in.nextFloat();
        System.out.println("c=");
        float sideC = in.nextFloat();
        if (sideA > sideB & sideA > sideC) {
            if (sideC <= sideA + sideB) {
                notTriangle();
                return;
            }
        }
        if (sideC * sideC < sideA * sideA + sideB * sideB) {
            System.out.println("0 - треугольник остроугольный");
        }
        if (sideC * sideC == sideA * sideA + sideB * sideB) {
            System.out.println("1 - треугольник прямоугольный");
        }
        if (sideC * sideC > sideA * sideA + sideB * sideB) {
            System.out.println("2 - треугольник тупоугольный");
        }
    }
    public static void notTriangle() {
        System.out.println("-1 - указаны недопустимые длины сторон!");
    }

    public static void changeMinMax () {
        // замена местами наименьшего и наибольшего элементов в массиве
        int[] arrayMinMax = new int[]{48, 214, 39, 92, 17, 173 };
        int length = arrayMinMax.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arrayMinMax[i] + " ");
        }
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < length; i++) {
            if (arrayMinMax[indexMin] > arrayMinMax[i] ) {
                indexMin = i;
            }
        }
        for (int i = 0; i < length; i++) {
            if (arrayMinMax[indexMax] < arrayMinMax[i] ) {
                indexMax = i;
            }
        }
        System.out.println();
        System.out.println("Наименьшее значение: " + arrayMinMax[indexMin] + " (индекс = " + indexMin + ")");
        System.out.println("Наибольшее значение: " + arrayMinMax[indexMax] + " (индекс = " + indexMax + ")");
        int temp;
        temp = arrayMinMax[indexMin];
        arrayMinMax[indexMin] = arrayMinMax[indexMax];
        arrayMinMax[indexMax] = temp;
        for (int i = 0; i < length; i++) {
            System.out.print(arrayMinMax[i] + " ");
        }
        System.out.println();
        System.out.println("---------------");
        System.out.println();
    }

    public static void numberFibonacci () {
        // Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n
        System.out.println("Введите значение \"n\" для поиска числа Фибоначчи:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int febpp = 1;
        int febp = 1;
        int feb = 0;
        for (int i = 3; i <= number; i++) {
            feb = febpp + febp;
            febpp = febp;
            febp = feb;
        }
        System.out.println("Искомое число - " + feb);
    }
    public static void collatz () {
        /**
         * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
         *   ЕСЛИ (X четное)
         *     Xслед = X /2
         *   ИНАЧЕ
         *     Xслед = 3 * X + 1
         * например
         *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
         * Данная последовательность рано или поздно встречает X == 1.
         * Написать функцию, которая находит, сколько шагов требуется для
         * этого для какого-либо начального X > 0.
         */
        System.out.println("Введите значение \"X\":");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        // System.out.println (x % 2);
        for (int i = 1; ; i++) {
            int mod = x % 2;
            // System.out.println (mod);
            if (mod == 0) {
                x = x / 2;
            }
            else {
                x = 3 * x + 1;
            }
            if (x == 1) {
            System.out.println("Количество шагов = " + i);
                return;
            }
        }
    }
    public static void nok () {
        /**
         * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
         * минимальное число k, которое делится и на m и на n без остатка
         */
        System.out.println("Поиск наименьшего общего кратного для двух чисел");
        System.out.println("введите число m:");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println("введите число n:");
        int n = in.nextInt();
        int mk = m + m;
        int nk = n + n;
        for (int i = 1; mk < nk; i++) {
            mk = mk + m;
            //System.out.println(mk + " " + nk);
            if (mk == nk) {
                System.out.println("Наименьшее общее кратное: " + mk);
                return;
            }
            if (mk > nk) {
                nk = nk + n;
            }
        }
    }
    public static void list () {
        /**
         * Средняя (3 балла)
         *
         * В заданном списке list каждый элемент, кроме первого, заменить
         * суммой данного элемента и всех предыдущих.
         * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
         * Пустой список не следует изменять. Вернуть изменённый список.
         *
         * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
         * */
        int[] arrayList = new int[]{1, 2, 3, 4, 5, 6 };
        System.out.println("Исходный список: ");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }
        System.out.println();
        for (int i = (arrayList.length - 1); i > 0; i--) {
            for (int j = (i - 1); j > -1; j--) {
                arrayList[i] = arrayList[i] + arrayList[j];
            }
        }
        System.out.println("Обработанный список: ");
        for (int i = 0; i < arrayList.length; i++) {
        System.out.print(arrayList[i] + " ");
        }
    }
    public static void polinom () {
        /**
         * Средняя (3 балла)
         *
         * Рассчитать значение многочлена при заданном x:
         * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
         * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
         * Значение пустого многочлена равно 0 при любом x.
         */
        int[] arrayP = new int[]{48, 214, 39, 92, 17, 173 };
        if (arrayP.length == 0) {
            System.out.println("Список пуст.");
            System.out.println("Значение многочлена = 0");
            return;
        }
        System.out.println("Исходный список: ");
        for (int i = 0; i < arrayP.length; i++) {
            System.out.print(arrayP[i] + " ");
        }
        System.out.println();
        System.out.println("Введите значение \"X\":");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double sum = 0;
        for (int i = 0; i < arrayP.length; i++ ) {
            sum = sum + arrayP[i] * Math.pow(x, i);
        }
        System.out.println("Результат вычислений:");
        System.out.println(sum);
    }
    public static void primeFactors () {
        /**
         * Средняя (3 балла)
         *
         * Разложить заданное натуральное число n > 1 на простые множители.
         * Результат разложения вернуть в виде списка множителей, например 75 -> (3, 5, 5).
         * Множители в списке должны располагаться по возрастанию.
         */
        System.out.println("Введите значение числа:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Результат:");
        int j = 1;
        int y = x;
        for (int i = 2; i < (x / 2); i++) {
            j = j + 1;
            int mod = y % j;
            if (mod == 0) {
                if (y == 1) {
                    return;}
                else {
                    System.out.println(j);
                    y = y / j;
                    j = 1;
                }
            }
        }
    }

}
