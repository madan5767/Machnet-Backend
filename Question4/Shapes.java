package Question4;

    class Shape {
        void draw()
        {
            System.out.println("Shape draw class");
        }
        void erase()

        {
            System.out.println ("Shape erase class");
        }
    }

    class Circle extends Shape
    {
        void draw()
        {
            System.out.println ("Draw Circle");
        }
        void erase()
        {
            System.out.println ("Erase Circle");
        }
    }
    class Triangle extends Shape
    {
        void draw()
        {
            System.out.println ("Draw Triangle");
        }
        void erase()
        {
            System.out.println ("Erase Triangle");
        }
    }

    class Square extends Shape
    {
        void draw()
        {
            System.out.println ("Draw Square");
        }
        void erase()
        {
            System.out.println ("Erase Square");
        }
    }

    public class Shapes
    {
        public static void main (String arg[])
        {
            Shape shape = new Shape();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Square square = new Square();

            shape.draw();
            shape.erase();
            circle.draw();
            circle.erase();
            triangle.draw();
            triangle.erase();
            square.draw();
            square.erase();
        }
    }
