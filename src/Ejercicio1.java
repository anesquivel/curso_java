import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float note1,note2, note3, total;

        System.out.println("Digite tres calificaciones a continuación:");
        note1 = entrada.nextFloat();
        note2 = entrada.nextFloat();
        note3 = entrada.nextFloat();

        total = note1 + note2 + note3;

        System.out.println("La suma total de las notas son: "+total);
    }
}
