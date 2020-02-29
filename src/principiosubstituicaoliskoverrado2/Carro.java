package principiosubstituicaoliskoverrado2;

public class Carro extends Veiculo{

    public Carro(String modelo, String cor) {
        super(modelo, cor);
    }
    
    @Override
    public int acelerar() {
        velocidade = velocidade + 5; 
        return velocidade; 
    }

    @Override
    public int desacelerar() {
        velocidade = velocidade - 5; 
        return velocidade; 
    }  
    
    public int freiar(){
        velocidade = 0; 
        return velocidade; 
    }
    
}

