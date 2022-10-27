import javax.swing.JOptionPane;

public class Pedido {
    public static void main(String[] args) {
        String menu = "Adicione um item ao seu carrinho de compras:\n1 - Pao (R$0,94)\n2 - Requeijao (R$8,63)\n3 - Margarina com Sal (R$8,99)\n4 - Margarina sem Sal (R$8,99)\n5 - Finalizar";
        int opcao;
        double soma = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu,
                    "Mercadinho",
                    JOptionPane.INFORMATION_MESSAGE));
            if (opcao >= 1 && opcao < 5) {
                int qntdItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do item escolhido"));  
                Item item = new Item(opcao, qntdItem);
                soma = soma + item.getProduto().getPrecoProduto() * item.getQuantidade();   
            } else if (opcao < 1 || opcao > 5) {
              JOptionPane.showMessageDialog(null,"Opcao Invalida","Mercadinho",JOptionPane.WARNING_MESSAGE);
            }
        } while (opcao != 5);
        JOptionPane.showMessageDialog(null, "O total da compra é: R$ " + String.format("%.2f",soma));
    }
} 