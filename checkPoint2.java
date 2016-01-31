public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<int[][]> array = new ArrayList();// Лист №1
        ArrayList<int[][]> array2 = new ArrayList();// Лист №2
        ArrayList<int[][]> arrayResult = new ArrayList(); //Результирующий лист
        int row = 5; //строки
        int col = 5; //столбцы
        int countOfMatrix = 10; //количество матриц
        for (int i = 0; i < countOfMatrix; i++) { //создаем матрицы и добавляем в лист
            int[][] mass = createMass(row, col);
            addToList(mass, array);
        }
        for (int i = 0; i < countOfMatrix; i++) { //создаем матрицы и добавляем в лист
            int[][] mass = createMass(row, col);
            addToList(mass, array2);
        }
        printList(array);// Вывод листа №1
        printList(array2); // Вывод листа №2
        multiLists(array, array2, arrayResult); //умножаем матрицы
        printList(arrayResult); // Вывод езультирующего листа
        int[] massMaxNum = new int[arrayResult.size()];
        massMaxNum = maxNum(arrayResult); // максимальное значение в каждой матрице результирующего листа
        System.out.println("Максимальные значения " + Arrays.toString(massMaxNum));
        int srednee = sredArifm(massMaxNum); // среднее арифметическое макимальных значений
        System.out.println("Среднее " + srednee);
        System.out.println("Сумма цифр числа " + summOfNumbers(srednee)); //сумма цифр числа
        }
        public static int[][] createMass(int row, int col) {
        int mass[][] = new int[row][];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new int[col];
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = new Random().nextInt(10);
            }
        }
        return mass;
    }

    public static void printMass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {

            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList addToList(int[][] mass, ArrayList array) {
        array.add(mass);
        return array;
    }

    private static int multiElements(int[][] matrixFirst, int[][] matrixSecond, int row, int col) {
        int result = 0;
        for (int i = 0; i < matrixFirst[0].length; i++) {
            result += matrixFirst[row][i] * matrixSecond[i][col];
        }
        return result;
    }

    public static int[][] multiMatrix(int[][] matrixFirst, int[][] matrixSecond) {
        //if(matrixFirst[0].length!=matrixB.length || matrixFirst.length==0 || matrixA[0].length == 0 || matrixB.length== 0 || matrixB[0].length ==0)
        //  return new int[][]{{}};
        int[][] matrixResult = new int[matrixFirst.length][matrixSecond[0].length];
        for (int i = 0; i < matrixFirst.length; i++) {
            for (int j = 0; j < matrixSecond[0].length; j++) {
                matrixResult[i][j] = multiElements(matrixFirst, matrixSecond, i, j);
            }
        }
        return matrixResult;
    }

    public static void printList(ArrayList<int[][]> array) {
        System.out.println("------List------");
        for (int[][] i : array) {
            printMass(i);
            System.out.println("");
        }
    }

    public static ArrayList multiLists(ArrayList<int[][]> array, ArrayList<int[][]> array2, ArrayList<int[][]> arrayResult) {
        int i = 0;
        while (true) {
            if (i < array.size()) {
                arrayResult.add(multiMatrix(array.get(i), array2.get(i)));
                i++;
                continue;
            }
            break;
        }
        return arrayResult;
    }

    public static int[] maxNum(ArrayList<int[][]> array) {
        int mass[] = new int[array.size()];
        int n = 0;
        for (int[][] i : array) {
            mass[n] = maxNum(i);
            n++;
        }
        return mass;
    }

    public static int maxNum(int[][] matrix) {
        int maxValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    public static int sredArifm(int[] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i];
        }

        return result / matrix.length;
    }

    public static int summOfNumbers(int num) {
        int summ = 0;
        int buff = 0;
        while (num != 0) {
            buff = num % 10;
            summ += buff;
            num /= 10;
        }
        return summ;
    }

}
