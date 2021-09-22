package Question5;

// Creating Interface Test
interface Test
{
    public void calculateSquare(int lengthTest);
}

// Arithmetic CLass implementing Test Interface
class arithmetic implements Test
{
    int square;
    public void calculateSquare(int length)
    {
        square=length*length;
        System.out.println("Square is calculated inside arithmetic class");
        System.out.println("Square of "+ length + " is "+square);
    }

}

// calling from ToTestInt class main method
public class ToTestInt {
    public static void main(String args[])
    {
    //created object of test interface referencing Arithmetic class.
        Test test = new arithmetic();
    //Arithmetic class method calculateSquare was called via the test interface method
        test.calculateSquare(10);
    }
}