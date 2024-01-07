public class precoProduto {

    public static void main(String [] args){
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é de R$" + total;

        System.out.println(mensagem);
    }
}
