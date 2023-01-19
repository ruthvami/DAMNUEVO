package a1.punt;

/**
 *
 * @author rutvac
 */
public class A1Punt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punt A = new Punt();
        Punt B = new Punt();
        Punt C = new Punt();
        
        
        A.x=5;
        A.y=0;
        B.x=10;
        B.y=10;
        C.x=-3;
        C.y=7;
        
        System.out.println("Las coordenadas son ("+A.x+","+ A.y+")");
        System.out.println("Las coordenadas son ("+B.x+","+ B.y+")");
        System.out.println("Las coordenadas son ("+C.x+","+ C.y+")");
        
        A.x*=B.x;
        B.y=C.y+A.x;
        C.x-=C.y;
        
        System.out.println(" ");
        
        System.out.println("Las coordenadas son ("+A.x+","+ A.y+")");
        System.out.println("Las coordenadas son ("+B.x+","+ B.y+")");
        System.out.println("Las coordenadas son ("+C.x+","+ C.y+")");
    }

}
