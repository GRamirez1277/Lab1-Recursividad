package recusividad;

public class PalindromoAir {
     
    Ticket[] ticket;
    
    public PalindromoAir(){
        ticket=new Ticket[30];
    }
    
    public int firstAvailable(){
        return firstAvailable(0);
    }
    
    private int firstAvailable(int posicion){
       
        if(posicion>=ticket.length){
            return -1;
        }
        if(ticket[posicion]==null){
            return posicion;
        }
       
        else{
            return firstAvailable(posicion+1);
        }
        
    }
    
    public int buscarPasajeros(String nombrePasajero){
       return buscarPasajero(nombrePasajero,0) ;
    }
    private int buscarPasajero(String nombrePasajero,int posicion){
        
       if(posicion>=ticket.length){
            return -1;
        }
       if (ticket[posicion] != null && ticket[posicion].getNombrePasajero().equals(nombrePasajero)) {
                return posicion; 
        }
        else{
           return buscarPasajero(nombrePasajero,posicion+1);
        }
    }
    
    public static boolean isPalindromo(String nombrePasajero){
       return isPalindromo(nombrePasajero,0,nombrePasajero.length()-1);
    }
    
    private static boolean isPalindromo(String nombrePasajero,int inicio,int fin){
        if(inicio<fin){
            if(nombrePasajero.charAt(inicio)==nombrePasajero.charAt(fin))
                return isPalindromo(nombrePasajero,inicio+1,fin-1);
                return false;
        }
        return true;
      }
    
    public void printPassengers(){
       printPassengers(0);
    }
    private void printPassengers(int posicion){
        if(posicion>=ticket.length){
            
        } 
        if(ticket[posicion]!=null){
           ticket[posicion].print();
        }
         printPassengers(posicion+1);
    }
    
}
