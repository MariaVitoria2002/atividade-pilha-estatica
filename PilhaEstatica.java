package com.atividade;

public class PilhaEstatica {
    
    public int[] elementos;
    public int tamanho;
    public int topo;
    public int MAX_SIZE = 10; 

    public PilhaEstatica(int tamanho){
        this.MAX_SIZE = tamanho;
       elementos = new int[tamanho];
       topo = -1;
    }

    public void push(int valor){
        topo++;
        elementos[topo] = valor;
    }

    public int pop(){
        int valor;
        valor = elementos[topo];
        topo--;
        return valor;
    }

    public boolean isEmpty(){
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int peek(){
        return elementos[topo];
    }
}