import java.awt.*;
import javax.swing.*;

public class DisplayWindow extends JFrame
{
    private final static int width_ = 700;
    private final static int height_ = 300;
    private final static String defaultDisplay_ = "Display";

    private Container c;

    public DisplayWindow() 
    {
        super(defaultDisplay_);
        c = this.getContentPane();
    }

    public DisplayWindow(String title)
    {
        super(title);
        c = this.getContentPane();
    }

    public void addPanel(JPanel p) 
    {
        c.add(p);
    }

    public void addPanel(JPanel p, boolean useDefault) 
    {
        if(useDefault)
          p.setPreferredSize(new Dimension(width_, height_));
        c.add(p);
    }

    public void showFrame()
    {
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}