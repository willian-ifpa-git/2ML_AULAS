
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
        
        public void setDesconto(float desconto){
            if(desconto <= 1.0){
                this.desconto = desconto;  
            }else{
                this.desconto = 0;
            }
           
        }
            public float getDesconto(){
            return desconto;
        }
            
        public int getQuantidade(){
            return quantidade;
        }
        
        public void setQuantidade(int quantidade){
            if(quantidade >=0){
            this.quantidade = quantidade;
            
            }else{
            
            this.quantidade = 0;
            }   
        }
        
        public String getDescricao(){
 
            return descricao;   
            }
        public void setDescricao(String descricao){
            this.descricao = descricao;
        
        }
        public String getId(){
             return id;
        
        }
        public void setId(String id){ // escrever valor no atributo id
            this.id = id;  
        }
        
        
    
    
}
