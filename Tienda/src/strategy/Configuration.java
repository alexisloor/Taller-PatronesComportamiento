package strategy;//Context
public class Configuration  {
    
    private TranportSrategy strategy;
    


        public Transport selecTransport(){
            Transport t = new Transport();
            String selection = Input("Seleccione el transporte: ");
            switch(selection){
                case automotive:
                    t.setStrategy(new AutomotiveStrategy);
                    return t;

            }



        }


    
    
    
    
    }