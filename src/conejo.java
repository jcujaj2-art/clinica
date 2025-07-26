
public class conejo extends Mascota implements AtencionEspecial{

    @Override
    public void hacersonido() {
        System.out.println("el conejo loco quiere hacer sonido");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("el conejo esta recibiendo la atencion especial");
    }
    
    
 
}
