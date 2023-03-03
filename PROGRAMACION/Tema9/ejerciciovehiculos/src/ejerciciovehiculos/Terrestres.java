
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public  class Terrestres extends Vehiculos{
    private final int rodes; 
    public Terrestres(String matricula,String modelo,int rodes){
        super(matricula,modelo);
        this.rodes=rodes;
        comprovarMatricula();
    }
    public void  mostrar(){
        System.out.println( "El modelo "+this.getModelo()+" con matricula "+this.getMatricula()+" tiene "+this.rodes+" ruedas"); 
    }
     public void comprovarMatricula(){
        if(!getMatricula().matches("^\\[0-9]{4}[A-Z]}{3}$")){
            System.out.println("Error al introducir la matricula del vehiculo "+this.getClass().getSimpleName());
        }
    }
}
