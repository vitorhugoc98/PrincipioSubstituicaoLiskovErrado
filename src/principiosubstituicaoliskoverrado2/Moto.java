package principiosubstituicaoliskoverrado2;

public class Moto extends Veiculo{

    public Moto(String modelo, String cor) {
        super(modelo, cor);
    }
    
    @Override
    public int acelerar() {
        velocidade =  velocidade + 3; 
        return velocidade; 
    }

    @Override
    public int desacelerar() {
        velocidade = velocidade - 3; 
        return velocidade; 
    }
       
}
