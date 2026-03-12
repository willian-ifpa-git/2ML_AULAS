
package pkg2ml_heranca;

public class DoisPontos {
    
    private float coordX;
    private float coordY;
    
public DoisPontos(float coordX, float y){ // Método Construtor
    this.coordX = coordX;
    coordY = y;

}

public void setCoordX(float x){
    this.coordX = x;
}
public float getCoordX(){
    return coordX;

}

public void setCoordY(float y){
    this.coordY = y;

}

public float getCoordY(){
    return coordY;
}

public String toString(){
    return "Dimesão de 2 pontos. \n"+
            "Coordenada X:"+getCoordX()+"\n"+
            "Coordenada Y:"+getCoordY();
           
}







    
}








