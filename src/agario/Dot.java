
package agario;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Random;

public class Dot extends Component{
    public int x;
    public int y;
    public Color c;
    public int size;
    Dot(int x, int y){
        this.x = x;
        this.y = y;
        Random rand = new Random();
        int r = rand.nextInt(100);
        int green = rand.nextInt(100);
        int b = rand.nextInt(100);
        this.c = new Color(r,green,b);
        this.size = rand.nextInt(20);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(c);
        g.fillOval(this.x, this.y, this.size, this.size);
    }
}