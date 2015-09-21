/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square background;
    private Triangle grass1;
    private Triangle grass2;
    private Triangle grass3;
    private Triangle grass4;
    private Triangle grass5;
    private Circle bubble1;
    private Circle bubble2;
    private Circle bubble3;
    private Person guy;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
      
        background = new Square();
        background.changeColor("blue");
        background.moveHorizontal(-305);
        background.moveVertical(-150);
        background.changeSize(450);
        background.makeVisible();
        
        grass1 = new Triangle(); 
        grass1.changeColor("green");
        grass1.changeSize(50, 180);
        grass1.moveHorizontal(-40);
        grass1.moveVertical(85);
        grass1.makeVisible();
        
        grass2 = new Triangle(); 
        grass2.changeColor("green");
        grass2.changeSize(60, 180);
        grass2.moveHorizontal(50);
        grass2.moveVertical(75);
        grass2.makeVisible();
        
        grass3 = new Triangle(); 
        grass3.changeColor("green");
        grass3.changeSize(50, 180);
        grass3.moveHorizontal(150);
        grass3.moveVertical(85);
        grass3.makeVisible();
        
        grass4 = new Triangle(); 
        grass4.changeColor("green");
        grass4.changeSize(60, 180);
        grass4.moveHorizontal(-130);
        grass4.moveVertical(75);
        grass4.makeVisible();
        
        grass5 = new Triangle(); 
        grass5.changeColor("green");
        grass5.changeSize(90, 180);
        grass5.moveHorizontal(10);
        grass5.moveVertical(45);
        grass5.makeVisible();

        bubble1 = new Circle();
        bubble1.changeColor("light blue");
        bubble1.moveHorizontal(10);
        bubble1.moveVertical(40);
        bubble1.changeSize(40);
        bubble1.makeVisible();
        
        bubble2 = new Circle();
        bubble2.changeColor("light blue");
        bubble2.moveHorizontal(50);
        bubble2.moveVertical(0);
        bubble2.changeSize(60);
        bubble2.makeVisible();
        
        bubble3 = new Circle();
        bubble3.changeColor("light blue");
        bubble3.moveHorizontal(100);
        bubble3.moveVertical(-60);
        bubble3.changeSize(80);
        bubble3.makeVisible();
        
        guy = new Person();
        guy.changeColor("magenta");
        guy.moveHorizontal(-55);
        guy.moveVertical(40);
        guy.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (background != null)   // only if it's painted already...
        {
            background.changeColor("black");
            grass1.changeColor("white");
            grass2.changeColor("white");
            grass3.changeColor("white");
            grass4.changeColor("white");
            grass5.changeColor("white");
            bubble1.changeColor("white");
            bubble2.changeColor("white");
            bubble3.changeColor("white");
            guy.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (background != null)   // only if it's painted already...
        {
            background.changeColor("blue");
            grass1.changeColor("green");
            grass2.changeColor("green");
            grass3.changeColor("green");
            grass4.changeColor("green");
            grass5.changeColor("green");
            bubble1.changeColor("light blue");
            bubble2.changeColor("light blue");
            bubble3.changeColor("light blue");
            guy.changeColor("magenta");
        }
    }
}
