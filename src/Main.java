
public class Main {
    public static void main(String[] args) {
        // i и b длины массивов. в данном случае задаются рандомом от 0 до 10
        int i = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        // массив ib - массив вывода сумм значений элементов с одинаковой суммой индексов
        int[] ib = new int[i + b - 1];
        // массив andrey - исследуемый массив, назван в ччесть автора задачи и очень "хорошего" человека
        int[][] andrey = new int[i][b];
        // заполнение массива рандомными значениями
        for (int a = 0; a < i; a++) {
            for (int c = 0; c < b; c++) {
                andrey[a][c] = (int) (Math.random()*10);

            }
        }
        // добавление искомых значений в массив ib
        for (int a = 0; a < i; a++) {
            for (int c = 0; c < b; c++) {
                int sum = a + c;
                ib[sum] += andrey[a][c];
            }
        }
        // вывод ответа
        for (int j : ib) {
            System.out.print(j + " ");
        }
    }
}