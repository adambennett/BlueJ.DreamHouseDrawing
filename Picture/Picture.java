

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square ground;
    private Square house;
    private Square windowL;
    private Square windowR;
    private Triangle roof;
    private Circle sun;
    private Circle knob;
    private BoxBoy door;
    private BoxBoy columnA;
    private BoxBoy columnB;
    private BoxBoy chimney;

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
        ground = new Square();
        ground.changeSize(600);
        ground.moveTo(0, 230);
        ground.changeColor("green");
        ground.makeVisible();
        house = new Square();
        house.changeSize(120);
        house.moveTo(80, 130);
        house.makeVisible();
        
        columnA = new BoxBoy();
        columnA.changeSize(5, 95);
        columnA.moveTo(60,135);
        columnA.changeColor("black");
        columnA.makeVisible();
        
        columnB = new BoxBoy();
        columnB.changeSize(5, 95);
        columnB.moveTo(215,135);
        columnB.changeColor("black");
        columnB.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("orange");
        roof.changeSize(80, 180);
        roof.moveTo(140, 55);
        roof.makeVisible();
        
        door = new BoxBoy();
        door.changeColor("black");
        door.changeSize(30, 45);
        door.moveTo(125, 205);
        door.makeVisible();
        
        windowL = new Square();
        windowL.changeColor("blue");
        windowL.changeSize(30);
        windowL.moveTo(90, 150);
        windowL.makeVisible();
        windowR = new Square();
        windowR.changeSize(30);
        windowR.moveTo(150, 150);
        windowR.changeColor("blue");
        windowR.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveTo(20, 20);
        sun.changeSize(55);
        sun.makeVisible();
        
        chimney = new BoxBoy();
        chimney.changeColor("orange");
        chimney.moveTo(90, 55);
        chimney.changeSize(20, 50);
        chimney.makeVisible();
        
        knob = new Circle();
        knob.changeColor("magenta");
        knob.changeSize(10);
        knob.moveTo(142, 223);
        knob.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
