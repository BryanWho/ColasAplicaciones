package linearstructures.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ColasAplicaciones {
    public static void main(String[] args){
        Deque<Integer> cartas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            cartas.add(i);
        }
        System.out.println("Cartas Descartadas");
        while(cartas.size()>1){
            System.out.println(cartas.remove()+",");
            cartas.add(cartas.remove());
        }
        System.out.println("");
        System.out.println("Carta final: "+cartas.getFirst());
    }
}
