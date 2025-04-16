package algoritmosdeordenacao;

import java.util.ArrayList;

public class SelectionSort {
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
        System.out.println(selectionSort(a));
        System.out.println("A quantidade de elementos no ArrayList é = "+n);


    }

    public static ArrayList<Integer>  selectionSort(ArrayList<Integer> x){

        int tamanho = x.size();
        for (int j = 0; j < tamanho-1;j++ ){
            int minIndex = j;
            for(int i = j+1; i < tamanho;i++){
                if(x.get(i)< x.get(minIndex) ){
                    minIndex = i;

                }

                if (x.get(j) > x.get(minIndex)){

                    int aux = x.get(j);
                    x.set(j,x.get(minIndex));
                    x.set(minIndex,aux);
                }

            }

        }
        return x;



    }

}
