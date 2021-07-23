package strategy;//Context
public class Transport  {
    
    private TranportSrategy strategy;
    private ArrayList<Producto> productos;
    private String destiny;

    


        public void setStrategy(TranportSrategy t ){
            this.TranportSrategy=t;
        }
        public void setDestiny(ArrayList<Producto> productos ){
            this.productos=productos;
        }
        public void setDestiny(String destiny ){
            this.destiny=destiny;
        }

        public boolean loadProducts(){
            this.TranportSrategy.loadProducts(this.productos);
        }

        public void sendProducts(){
            this.TranportSrategy.sendProducts(this.destiny);
        }
    
    
    
    
    }
