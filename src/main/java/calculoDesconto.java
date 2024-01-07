public class calculoDesconto {

    public static  void main(String[] args){
        double precoOriginal = 150.00;

        double percentualDesconto = 10.00;
        double valorDesconto = (percentualDesconto / 100.00) * precoOriginal;
        double novoValor = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoValor);
    }
}
