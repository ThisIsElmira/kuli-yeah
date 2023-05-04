public class Pacman
{
    public int x;
    public int y;
    public int width;
    public int height;

    public int moveLeft()
    {
        int move = x - 1;
        if (move >= 0)
        {
            x = move;
        }
        return x;
    }

    public int moveRight()
    {
        int move = x + 1;
        if (move <= width)
        {
            x = move;
        }
        return x;
    }

    public int moveUp()
    {
        int move = y + 1;
        if (move <= height)
        {
            y = move;
        }
        return y;
    }

    public int moveDown()
    {
        int move = y - 1;
        if (move >= 0)
        {
            y = move;
        }
        return y;
    }

    public void printPosition()
    {
        System.out.println("Position x: " + x);
        System.out.println("Position y: " + y);
    }
}
