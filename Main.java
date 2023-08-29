import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//    Pessoa p = new Pessoa ();
//
//    System.out.println("antiga "+ p.idade);
//    p.niver( );
//
//    System.out.println("atual: "+ p.idade);
//

//      Soma s = new Soma ();
//
//      System.out.println("Informe dois números para soma: ");
//      Scanner sc = new Scanner(System.in);
//      s.num1 = sc.nextInt();
//      s.num2 = sc.nextInt();
//
//      s.calculo();
//      System.out.println(s.soma);

//        Calculadora c = new Calculadora();
//        Scanner sc = new Scanner(System.in);
//        int n1,n2;
//        System.out.println("Número 1");
//        n1 = sc.nextInt();
//        System.out.println("Número 2");
//        n2 = sc.nextInt();
//        System.out.print(c.somar(n1,n2));

        Media media = new Media();
        System.out.println("Informe as notas 1, 2 e 3 para calcular a média aritmética: ");
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        media.contar(nota1, nota2, nota3);
        if (media.resultado >=7) {
            System.out.println("Você foi aprovado por média");
        } else if (media.resultado <=4) {
            System.out.println("Você está reprovado por média");
        } else {
            System.out.println("Você está na final");
        }

    }
}