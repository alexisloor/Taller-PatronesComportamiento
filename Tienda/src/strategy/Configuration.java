package strategy;//Context
public class Configuration  {
    
    private TransportSrategy strategy;
    


        public Transport selectTransport(){
            Transport t = new Transport();
            String selection = Input("Seleccione el transporte: ");
            switch(selection){
                case automotive:
                    t.setStrategy(new AutomotiveStrategy);
                    return t;

            }
        }
    
    }
