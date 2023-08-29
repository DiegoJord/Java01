public class Media {

    double soma;

    double resultado;


    public double contar(double nota1, double nota2, double nota3) {
        soma = nota1 + nota2 + nota3;
        resultado = soma / 3;
        return resultado;
    }
}
