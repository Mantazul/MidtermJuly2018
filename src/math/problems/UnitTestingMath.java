package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {

        //Apply Unit testing into each classes and methods in this package.

        Factorial fnum=new Factorial();

        int result1=Factorial.Factorial(5);

        Assert.assertEquals(120,result1);

        FindLowestDifference lno=new FindLowestDifference();

        PrimeNumber pm=new PrimeNumber();

        Assert.assertEquals(true,PrimeNumber.isPrime(5));

    }
}
