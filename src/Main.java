//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
   static  String sentence = "Я лялялЕ труляля";
    //static String sentence = "IIIqw унр";
    //static String sentence = "ппппп";
    //static int[][] matrix = {{1, 1, 2, 2}, {3, 3, 4, 3}, {3, 3, -21, 0}, {3, 0, 0, -23}};
    //static int[][] matrix = {{1, 2, 4}, {5, 2, 7}, {4, 10, 11}};
    static int[][] matrix = {{-11, 1}, {20, 3}};



    public static void newSentence(String sentence)
    {
        //задача 1
        System.out.printf("А) Заменить все гласные буквы в предложении на знак «-». \n");
        //массив гласных букв
        char[] charArray = {'a', 'e', 'y', 'u', 'o','i', 'а', 'у', 'е', 'ы', 'о', 'э', 'я', 'и', 'ю'};

        //преобразуем строку в массив символов
        sentence = sentence.toLowerCase();
        char[] newSentence = sentence.toCharArray();
        for (int i =0; i<newSentence.length; i++)
        {
            for (int j = 0; j<charArray.length; j++)
            {
                if (newSentence[i]==charArray[j])
                {
                    newSentence[i] = '-';
                }
            }
        }
        sentence = new String(newSentence);
        System.out.println(sentence);
    }



    // 3 задача
    public static void maxMatrix(int[][] matrix)
    {
        System.out.printf("\nС) Найти самое  часто встречающееся " +
                "значение квадратной двумерной матрицы.\n");

        int repeat;
        int maxCol =0;
        int maxMatrix =0;
        int rows = matrix.length;
        int flag = 0;


        for (int i=0; i<rows; i++) {
            for (int j = 0; j < rows; j++) {
                // запоминаем текущее значение для
                // сравнения его с остальными
                repeat = matrix[i][j];
                int nowCol = 0;
                //флаг, если числа повторяются одинаковое число раз

                for (int c = i; c< rows; c++)
                {
                    for (int k = 0; k<rows; k++)
                    {
                        if (repeat==matrix[c][k])
                        {
                            nowCol++;
                                /*System.out.printf("Maxmatrix =");
                                System.out.print(matrix[c][k]);
                                System.out.printf(" =");
                                System.out.print(nowcol);
                                System.out.println();*/
                        }
                    }
                }
                if(nowCol == maxCol)
                {
                    flag++;
                }
                if(nowCol > maxCol){
                    maxMatrix =repeat;
                    maxCol = nowCol;

                }
            }
        }

        if (flag == 1 | maxCol==1)
        {
            System.out.print("Все значения встречаются одинаковое количество раз");
        }

        else {
            System.out.print("Самое часто встречающее значение: ");
            System.out.print(maxMatrix);
        }

    }

    public static void sumMatrix(int[][] matrix)
    {
        System.out.printf("\n\nB) Определить общую сумму элементов диагоналей " +
                "квадратной двумерной матрицы.");

        int sum =0;
        //сумма диагонали 1
        int rows = matrix.length;
        for (int i =0; i<rows; i++)
        {
            sum = matrix[i][i] + sum;
            /*System.out.print(sum);
            System.out.println();*/
        }
        int k = 0;
        //сумма диангонали 1+2
        for (int i = rows - 1; i >=0 ; i--)
        {
            sum = matrix[k][i] + sum;
            /*System.out.print(sum);
            System.out.println();*/
            k++;
        }

        System.out.println();
        System.out.print("Сумма диагоналей = ");
        System.out.print(sum);
    }

     public static void srGeom(int[][] matrix)
    {
        System.out.println("\n\nD) Среднее геометрическое значение " +
                "элементов квадратной двумерной матрицы.");
        double product=1;
        double cout = 0;
        int rows = matrix.length;
        for (int i =0; i<rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                product = product*matrix[i][j];
                cout++;
            }
        }
        if ((product < 0) & (cout % 2 ==0))
        {
            System.out.printf("Невозможно вычислить среднее геометрическое");
        }
        else
        {
            double rezult = Math.pow( product, (1.0/cout));
            System.out.println();
            System.out.printf("Среднее геометрическое = ");
            System.out.print(rezult);
        }

    }

    public static void outPutMatrix(int[][] matrix)
    {
        int rows = matrix.length;
        // вывод матрицы
        System.out.printf("\n\nМатрица\n");
        for (int i=0; i<rows; i++)
        {
            for(int j=0; j<rows; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        newSentence(sentence);
        maxMatrix(matrix);
        sumMatrix(matrix);
        srGeom(matrix);
        outPutMatrix(matrix);
    }
}