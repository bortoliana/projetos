public class converter {

    public static void main(String[] args){
        double valorDolar = 199.99;
        double taxaReal = 4.94;

        double valorReal = valorDolar * taxaReal;

        String valorRealFormatado = String.format("%.2f", valorReal);

        System.out.println("O valor em Reais é: R$" + valorRealFormatado);

    }
}
