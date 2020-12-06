import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        int kek = 0;
        String lol = " ";
        String sos = " ";
        double rar = 0;

        Scanner scanner = new Scanner(System.in);
/*
        // 1 program
        System.out.println("Первая программа");
        System.out.println("Введите слово");
        lol = scanner.nextLine();
        System.out.println("Введите количество повторений");
        kek = scanner.nextInt();
        System.out.println(Repeat.repeat(lol,kek));

        // 2 program
        System.out.println("Вторая программа");
        System.out.println("Введите количество чисел в массиве");
        kek = scanner.nextInt();
        System.out.println("Введите числа через Enter");
        int[] pop2 = new int[kek];
        for (int i=0; i<kek; i++)
        {
            pop2[i] = scanner.nextInt();
        }
        System.out.println(DifferenceMaxMin.differenceMaxMin(kek,pop2));

        // 3 program
        System.out.println("Третья программа");
        System.out.println("Введите количество чисел в массиве");
        kek = scanner.nextInt();
        System.out.println("Введите массив");
        int[] pop3 = new int[kek];
        for (int i=0; i<kek; i++)
        {
            pop3[i] = scanner.nextInt();
        }
        System.out.println(IsAvgWhole.isAvgWhole(kek,pop3));

        // 4 program
        System.out.println("Четвёртая программа");
        System.out.println("Введите количество чисел в массиве");
        kek = scanner.nextInt();
        System.out.println("Введите массив");
        int[] pop4 = new int[kek];
        for (int i=0; i<kek; i++)
        {
            pop4[i] = scanner.nextInt();
        }
        pop4 = CumulativeSum.cumulativeSum(kek, pop4);
        for (int j=0; j<kek; j++)
        {
            System.out.print(pop4[j] + " ");
        }

        // 5 program
        System.out.println("Введите число");
        lol = scanner.nextLine();
        System.out.println(GetDecimalPlaces.getDecimalPlaces(lol));

        // 6 program
        System.out.println("Введите число");
        kek = scanner.nextInt();
        System.out.println(Fibonacci.fibonacci(kek));

        // 7 program
        System.out.println("Введите индекс");
        lol = scanner.nextLine();
        System.out.println(IsValid.isValid(lol));

        // 8 program
        System.out.println("Введите первое слово");
        lol = scanner.nextLine();
        System.out.println("Введите второе слово");
        sos = scanner.nextLine();
        System.out.println(IsStrangePair.isStrangePair(lol,sos));
*/
        // 9 program
        System.out.println("Введите первое слово");
        lol = scanner.nextLine();
        System.out.println("Введите второе слово");
        sos = scanner.nextLine();
        if (sos.charAt(0)=='-')
        {
            System.out.println(IsPrefixSuffix.isSuffix(lol,sos));
        }
        else if (sos.charAt(sos.length()-1)=='-')
        {
            System.out.println(IsPrefixSuffix.isPrefix(lol,sos));
        }
        else
            System.out.println("none");
/*
        // 10 program
        System.out.println("Введите число шагов");
        kek = scanner.nextInt();
        System.out.println(BoxSeq.boxSeq(kek));
 */
    }
}
