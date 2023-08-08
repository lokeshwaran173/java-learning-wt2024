public class Q75 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner (System.in);
        double [] numbers = new double[10];
        System.out.print("Enter numbers: ");
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = input.nextDouble();
        }

        int Evens = 0;
        int Odd = 0;

        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]%2 == 0){
                Evens++;
            }else{
                Odd++;
            }
        }
        System.out.println("The number of odd numbers: " + Odd);
        System.out.println("The number of even numbers: " + Evens);
