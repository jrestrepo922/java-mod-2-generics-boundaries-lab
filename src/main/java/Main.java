import java.util.List;

public class Main {
    // implement the public averageList method here
    public static Double averageList(List<? extends Number> numList){
        double size = numList.size(); 
        double sum = 0.0;
        for (Number number : numList) {
            sum = sum + number.doubleValue(); 
        }
        return (sum/size); 
    }
    
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(averageList(intList)); // 3.0

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(averageList(doubleList)); // 3.0    
    }
}

// Learning Goals
// Create a generic static method with an upper bound
// Instructions
// Create a method that returns the average of a list of numbers. Make sure the method is restricted to dealing with numbers and that your code will not compile if you try to pass in a list of objects that not actually numbers.

// Hints:

// You need to use an upper bound wildcard
// You can use the Double class as the precision for your calculation
// The average is the sum divided by the number of elements in the list