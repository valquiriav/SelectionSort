package br.com.letscode;

import java.util.Arrays;
public class SelectionSort {

    int[] arrayOriginal;

    public SelectionSort(int[] arrayOriginal) {
        this.arrayOriginal = arrayOriginal;
    }

    public void sSort(){
        //variável de referência
        int ref;

        //for externo: percorre a array definindo o valor de cada posição
        for (int i = 0; i < arrayOriginal.length; i++){
            //criando a referência (o menor número até então)
            ref = arrayOriginal[i];
            //for interno: percorre a array buscando o menor número entre as posições que restam ser preenchidas
            for (int j = i; j < arrayOriginal.length; j++){
                //condição: valor ser menor do que o menor valor até então
                if (arrayOriginal[j] < ref){
                    //caso sim, troca as valores de posição e atualiza a referência
                    arrayOriginal[i] = arrayOriginal[j];
                    arrayOriginal[j] = ref;
                    ref = arrayOriginal[i];
                }
            }
        }
        //imprime a array, agora ordenada
        System.out.println(Arrays.toString(arrayOriginal));
    }
}