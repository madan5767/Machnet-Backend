package Question3;

public class Numbers {
    private int number;

    public Numbers (){
        number = 153;
    }

    public boolean isZero(){
        if (number == 0)
            return true;
        else
            return false;
    }

    public boolean isPositive(){
        if(number > 0)
            return true;
        else
            return false;
    }

    public boolean isNegative(){
        if (number < 0)
            return true ;
        else
            return false;
    }

    public boolean isOdd(){
        if (number % 2 != 0)
            return true;
        else
            return false;
    }

    public boolean isEven(){
        if (number % 2 == 0)
            return true ;
        else
            return false;
    }

    public boolean isPrime(){
        boolean flag=true;
        for (int i=2; i<number; i++)
        {
            if (number != i)
            {
                if( number % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            return true;
        else
            return false;
    }

    public boolean isAmStrong(){
        int temp = number;
        int sum=0,digit;

        while(temp!=0){
            digit=temp%10;
            sum+=(digit*digit*digit);
            temp=temp/10;
        }
        if(number == sum)
            return true;
        else
            return false;
    }

    public int getFactorial(){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }

    public int getSqr(){
        return number*number;
    }

    public int sumDigits(){
        int temp = number;
        int sum=0,digit;

        while(temp!=0){
            digit=temp%10;
            sum+=digit;
            temp=temp/10;
        }
        return sum;
    }

    public int getReverse(){
       int temp, reverse=0;
       int hold=number;

        while (hold!=0){
            temp = hold%10;
            reverse = reverse * 10 + temp;
            hold = hold/10;
        }
       return reverse;
    }

    public double getSquareRoot(){
        return Math.sqrt(number);
    }

    public static void main (String args [ ])
    {
        Numbers num = new Numbers();
        System.out.println("isZero?? : "+num.isZero());
        System.out.println("isPositive?? : "+num.isPositive());
        System.out.println("isNegative?? : "+num.isNegative());
        System.out.println("isOdd?? : "+num.isOdd());
        System.out.println("isEven?? : "+num.isEven());
        System.out.println("isPrime?? : "+num.isPrime());
        System.out.println("isAmStrong?? : "+num.isAmStrong());
        System.out.println("Factorial?? : "+num.getFactorial());
        System.out.println("Square?? : "+num.getSqr());
        System.out.println("Sum of Digits?? : "+num.sumDigits());
        System.out.println("Reverse?? : "+num.getReverse());
        System.out.println("Square Root?? : "+num.getSquareRoot());
    }
}
