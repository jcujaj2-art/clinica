
import java.util.ArrayList;


public class ConsultaVeterinaria {

    
    public static void main(String[] args) {
        ArrayList<Mascota> animales = new ArrayList<>();
        animales.add(new conejo());
        animales.add(new gato());
        animales.add(new perro());
        animales.add(new tortuga());
        
        for (Mascota v : animales){
            v.hacersonido();
            v.descansar();
            
            if(v instanceof AtencionEspecial){
                ((AtencionEspecial) v).recibirAtencionEspecial();
            }
            
            if(v instanceof Vacunable){
                ((Vacunable) v).vacunar();
            }
        }
        
        
    
        
    }
    
}
