package br.com.letscode;

import java.util.Arrays;

        public class Test {

            //Implemente o algoritmo de ordenação Selection sort para um array de 10 inteiros.

            public static void main(String[] args) {

                //array de exemplo
                int[] arrayOriginal = {3, 1, 9, 12, 2, 32, 5, 6, 104, 53};

                SelectionSort test = new SelectionSort(arrayOriginal);

                test.sSort();

            }
        }