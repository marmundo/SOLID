public class Calcular {
   public double Calcular(Pedido pedido){
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: " + total);
   }
}