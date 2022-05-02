public class Main {
    public static void main(String[] args) {

        // Задание 1


        int[] weight = new int[3]; //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] weightTwo = {1.57, 7.654, 9.986}; // Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.


        int[] weightThree = {4, 6, 9};    // 3.Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1)
                System.out.print(weight[i] + ", ");
            else
                System.out.print(weight[i]);

        }
        System.out.println();

        for (int i = 0; i < weightTwo.length; i++) {
            if (i != weightTwo.length - 1)
                System.out.print(weightTwo[i] + ", ");
            else
                System.out.print(weightTwo[i]);
        }
        System.out.println();

        for (int i = 0; i < weightThree.length; i++) {
            if (i != weightThree.length - 1)
                System.out.print(weightThree[i] + ", ");
            else
                System.out.print(weightThree[i]);
        }
        System.out.println();

        // 3 задание распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.

        for (int i = weight.length - 1; i>=0; i --) {
            if (i!=0)
                System.out.print(weight[i] + ",");
            else
                System.out.print(weight[i]);
        }
        System.out.println();

        for (int i = weightTwo.length - 1; i>=0; i --) {
            if (i!=0)
                System.out.print(weightTwo[i] + ",");
            else
                System.out.print(weightTwo[i]);
        }
        System.out.println();

        for (int i = weightThree.length - 1; i>=0; i --) {
            if (i!=0)
                System.out.print(weightThree[i] + ",");
            else
                System.out.print(weightThree[i]);
        }
        System.out.println();
//Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1 ).

        for (int i = 0; i< weight.length; i++){
            if (weight[i] % 2!=0) {
                weight[i]++;
            }
            if (i!= weight.length-1)
                System.out.print(weight[i] + ", ");

            else
                System.out.print(weight[i]);

            System.out.println();






        }









    }


}
