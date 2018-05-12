import com.kodilla.spring.intro.Circle;
import com.kodilla.spring.intro.Drawer;
import com.kodilla.spring.intro.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test

    public void testDodrawingWithCircle() {
//        Given
        Circle circle = new Circle();

//        When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

//        Then
        Assert.assertEquals("This is a circle", result);


    }
@Test
    public void testDodrawingWithTriangle() {
//        Given
        Triangle triangle = new Triangle();

//        When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

//        When
        Assert.assertEquals("This is a triangle", result);
    }



//    public void testDoDrawing() {
////        Given
//        Drawer drawer = new Drawer();
//
////        When
//        drawer.doDrawing();
//
////        Then
//
//    }
}
