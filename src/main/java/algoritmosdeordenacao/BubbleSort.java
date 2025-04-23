package algoritmosdeordenacao;

import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(7);
        a.add(1);
        a.add(2);
        a.add(9);
        a.add(-302);
        a.add(5);
        a.add(8);
        a.add(4);
        a.add(-5);
        a.add(-256);


        int n = a.size();
        System.out.println(bubbleSort(a));
        System.out.println("A quantidade de elementos no ArrayList é = " + n);


    }


    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> x) {
        int tamanho = x.size();
        for (int j = 0; j < tamanho - 1; j++) {
            for (int i = 0; i < tamanho - 1; i++) {
                if (x.get(i) > x.get(i + 1)) {
                    int aux = x.get(i);
                    x.set(i, x.get(i+1));
                    x.set(i + 1, aux);
                }

            }


        }
        return x;

    }


}
