package principiosubstituicaoliskoverrado2;
public abstract class Veiculo {
    
    private String modelo; 
    private String cor; 
    protected int velocidade = 0;
    
    public int acelerar(){
        velocidade = velocidade++; 
        
        return velocidade; 
    } 
    
    public int desacelerar(){
        velocidade = velocidade--; 
        return velocidade;
    }
    
       public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
}
