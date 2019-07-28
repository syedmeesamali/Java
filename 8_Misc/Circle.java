class Circle 
{
    double rad = 1;
    Circle () 
    {
            //Constructor method
    }

    Circle (double newRad)
    {
        rad = newRad;
    }

    double getArea() 
    {
        return rad * rad * Math.PI;
    }

    double getPerimeter()
    {
        return 2 * Math.PI * rad;
    }
}