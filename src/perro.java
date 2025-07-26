
public class perro extends Mascota implements Vacunable {

    @Override
    public void hacersonido() {
        System.out.println("el perro hace huahu ");
    }

    @Override
    public void vacunar() {
        System.out.println("el perro se esta vacunando la cola");
    }
    
    
    
}
