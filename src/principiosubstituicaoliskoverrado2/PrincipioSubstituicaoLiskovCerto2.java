package principiosubstituicaoliskoverrado2;

public class PrincipioSubstituicaoLiskovCerto2 {

    public static void main(String[] args) {
         Carro carro00 = new Carro("Fusion","Preto"); 
         Moto moto00 = new Moto("Hornet","Preta");
         
         System.out.println("Velociade de partida do carro: "+carro00.getVelocidade());
         carro00.acelerar(); 
         carro00.acelerar(); 
         System.out.println("Velociade inicial do carro: "+carro00.getVelocidade());
         carro00.desacelerar(); 
         System.out.println("Velocidade final do carro: "+carro00.getVelocidade());
         
         System.out.println("Velocidade de partida da moto: "+moto00.getVelocidade());
         moto00.acelerar(); 
         moto00.acelerar(); 
         System.out.println("Velocidade inicial da moto: "+moto00.getVelocidade());
         moto00.desacelerar(); 
         System.out.println("Velocidade final da moto: "+moto00.getVelocidade());

    }
    
}

