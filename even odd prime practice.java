public class numberclassifier
{
    public static void main(String args[])
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10
    };
    int evenCount = 0;
    int oddCount = 0;
    int primeCount = 0;
     
    for (int number : numbers)
    {
      if (isEven(number))
      {
          evenCount++;
      }
      else 
      {
        oddCount++;
      }
      if (isPrime(number))
      {
          primeCount++;
      }
    }
}
System.out.println("no of even numbers: " +evenCount);
