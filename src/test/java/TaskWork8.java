import org.junit.jupiter.api.Test;
import sun.awt.SunToolkit;

import static org.junit.jupiter.api.Assertions.*;

public class TaskWork8 {

    @Test
    public void testSum(){
        TaskWork7.Calc c = new TaskWork7.Calc(4.45 , 5.98 , "сложение");
        assertEquals( 10.43 , c.sum() );
    }

    @Test
    public void testMinus(){
        TaskWork7.Calc c = new TaskWork7.Calc(11.6 , 3.578 , "вычитание");
        assertEquals( 8.022 , c.minus() );
    }

    @Test
    public void testProizv1(){
        TaskWork7.Calc c = new TaskWork7.Calc(45.8 , 7.6 , "умножение");
        assertEquals( 348.08 , c.proizv() );
    }

    @Test
    public void testProizv2(){
        TaskWork7.Calc c = new TaskWork7.Calc(45.8 , 0 , "умножение");
        assertEquals( 0 , c.proizv() );
    }

    @Test
    public void testDelenie(){
        TaskWork7.Calc c = new TaskWork7.Calc(45.8 , 8 , "умножение");
        assertEquals( 5.725 , c.delenie() );
    }

}
