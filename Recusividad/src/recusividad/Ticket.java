package recusividad;

public class Ticket {
   public String nombrePasajero;
   public double totalPagado;
   
   public Ticket(String nombrePasajero,double totalPagado){
       this.nombrePasajero=nombrePasajero;
       this.totalPagado=totalPagado;
   }
   
   public void setNombrePaasajero(String nombrePasajero){
       this.nombrePasajero=nombrePasajero;
   }
   
   public String getNombrePasajero(){
       return nombrePasajero;
   }
   
   public void setTotalPagado(double totalPagado){
       this.totalPagado=totalPagado;
   }
   
   public double getTotalPagado(){
       return totalPagado;
   }
   
   public void print(){
       System.out.println("-------Datos de Ticket-------"+"\nNombre del Pasajero: "+nombrePasajero+
       "\nTotal Pagado Ticket: Lps. "+totalPagado);
   }
    
}
