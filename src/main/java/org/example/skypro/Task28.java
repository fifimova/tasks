package org.example.skypro;

/* вычисления серии чисел Фибоначчи. */
public class Task28 {

    public static void main(String[] args) {
        int n = 20;
        int t1 = 0;
        int t2 = 1;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
