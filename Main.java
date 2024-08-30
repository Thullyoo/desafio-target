import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void resgatarNumFibonacci(int num){
        boolean achou = false;
        int numAnt = 0;
        int numAtual = 1;
        int temp = 0;

        while (!achou){
                 System.out.println(numAnt);
                if(numAnt == num){
                    achou = true;
                } else if (numAtual > num){
                    throw new RuntimeException("O número " + num + " não pertence a sequência de fibonacci");
                }
                temp  = numAtual;
                numAtual += numAnt;
                numAnt = temp;
        }

        System.out.println("O número pertence a sequência fibonnaci");
    }

    public static void verificarAnaString(String string){
        int quantidadeA = 0;

        for (int i = 0; string.length() > i; i++){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A'){
                quantidadeA++;
            }
        }
        if(quantidadeA > 0){
            System.out.println("Quantida de A na string: " + quantidadeA);
        } else{
            System.out.println("Não existe a letra A na string");
        }
    }

    public static void main(String[] args) {
        resgatarNumFibonacci(8);
        verificarAnaString("banana");
    }

}
