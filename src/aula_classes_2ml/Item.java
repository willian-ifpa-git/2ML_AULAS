
package aula_classes_2ml;


public class Item {
    private float precoUnitario;
    private int quantidade;
    private String descricao;
    private String id;
    private float desconto;
    
    public Item(String id, String descricao, int quantidade, float precoUnitario){
        this.id = id;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
        this.quantidade = 0;
        }
    }
        
        public float getTotalAjustado(){
            float total = precoUnitario * quantidade;
            float total_desconto = total * desconto;
            float total_ajustado = total - total_desconto;
            return total_ajustado;
        
        }
    
    
}
