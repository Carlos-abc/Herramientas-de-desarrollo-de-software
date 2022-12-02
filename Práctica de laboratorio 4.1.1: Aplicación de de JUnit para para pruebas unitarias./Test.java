import junit.framework.*;

public class Test extends TestCase {

    Resource resource;

    public void escenario(){
        resource = new Resource();
        
    }

    public void testGetName(){
        escenario();
        assertEquals("Luis", resource.getName());
    }
  







    
}
