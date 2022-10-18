import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
        final double participacion= .10, primerExam = .25, segundoExam = .25, examFinal = .40;
        double califParticipacion, califExam1, califExam2, califExamFinal, califFinal;
        Scanner entry5 = new Scanner(System.in);

        System.out.println("Ingrese la calif. de las participaciones: ");
        califParticipacion = entry5.nextDouble();

        System.out.println("Ingrese la calif. del primer examen:");
        califExam1 = entry5.nextDouble();

        System.out.println("Ingrese la calif. del segundo examen:");
        califExam2 = entry5.nextDouble();

        System.out.println("Ingrese la calif. del examen final:");
        califExamFinal = entry5.nextDouble();


        califFinal = (participacion * califParticipacion) +(primerExam* califExam1)
                + (segundoExam * califExam2) + (examFinal * califExamFinal);
        System.out.println("La calif del estudiante es: "+ califFinal);
    }
}
