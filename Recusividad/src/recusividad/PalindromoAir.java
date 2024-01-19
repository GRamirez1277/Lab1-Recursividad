package     recusividad;

import recusividad.Ticket;

public class PalindromoAir {
    
    Ticket[] ticket;
    public int posicion;
    public double totalIngresos;
    public double totalPago;
    
    
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
    
    public double income(){
        return income(totalIngresos,0);
    }
    private double income(double totalIngresos,int posicion){
       if(posicion>=ticket.length){
            return totalIngresos;
        } 
       if(ticket[posicion]!=null){
           totalIngresos+= ticket[posicion].getTotalPagado();
           return income(totalIngresos,posicion+1);
        }
        return income(totalIngresos,posicion+1);
    }
    
    
    public void sellTicket(String nombrePasajero){
       
        totalPago=0;
        posicion = firstAvailable(); 
        if(posicion!=-1){
            if(isPalindromo(nombrePasajero)==false){
                totalPago=800;
            }
            else{
                totalPago=800*0.8;
            }
            ticket[firstAvailable()] = new Ticket(nombrePasajero, totalPago);
            
            System.out.println("--------Monto a Pagar---------"+"\nNombre: "+ticket[posicion].getNombrePasajero()+
                    "\nMonto a pagar: Lps. "+ticket[posicion].getTotalPagado());      
        }   
    }
    
    public void reset(){
        totalIngresos = 0;
        reset(0);
    }
    private void reset(int posicion){
         if(posicion>=ticket.length){  
             return;
        }
         ticket[posicion]=null;
          reset(posicion+1);      
    }
    
    
    
     public boolean cancelTicket(String nombrePasajero){
        
         if (buscarPasajero(nombrePasajero,0)!=-1){
         ticket [posicion]=null;
     }else{
             return false;
         }
         return true;
     }
    
     public void dispatch(){
         
         System.out.println("Ingreso generado: "+income());
         reset(0);
         totalIngresos=0;
     }
    }

    

