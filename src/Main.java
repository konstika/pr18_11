import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"5", "3", "7", "10", "2"};
        StringComparator stringComparator = new StringComparator();
        Arrays.sort(array, stringComparator);
        System.out.println(Arrays.toString(array));


        Socks[] socks = new Socks[]{new Socks(2, Color.cyan, "cotton"), new Socks(3, Color.cyan, "bamboo"),
                new Socks(2, Color.cyan, "metal"),};
        Arrays.sort(socks);
        System.out.println(Arrays.toString(socks));



        GeometryObject[] geometryObjects = new GeometryObject[]{new Triangle(5,7,9),new Rectangle(2,4),new Circle(10)};
        geometryObjects[2].setScale(0.5);
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));

        if(geometryObjects[0] instanceof Triangle){
            Triangle c = (Triangle) geometryObjects[0];
        }
    }
}
