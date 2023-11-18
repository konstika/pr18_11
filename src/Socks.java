import java.awt.*;

public class Socks implements Comparable<Socks> {
    int count;
    Color color;
    String material;

    public Socks(int count, Color color, String material) {
        this.count = count;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "count=" + count +
                ", color=" + color +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public int compareTo(Socks o) {
        if(this.count > o.count){
            return 1;
        }
        else if(this.count < o.count){
            return -1;
        }
        int colorInt1 = this.color.getRed()+this.color.getBlue()+this.color.getGreen();
        int colorInt2 = o.color.getRed()+o.color.getBlue()+o.color.getGreen();
        if(colorInt1 > colorInt2){
            return 1;
        }
        else if(colorInt1 < colorInt2){
            return -1;
        }
        return this.material.compareTo(o.material);

    }
}
