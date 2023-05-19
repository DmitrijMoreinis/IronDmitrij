package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,1,9,5,0,1,1,2,0,0,0};
        findDifference(numbers);
        findSmallest2(numbers);
        calculateTerm(1.5,1.4);
    }

    /*
    The Method finds the highest  and the smallest Value of the array and
    then returns the difference between this Values
    its public but would also work private. It need to be static to work without instances and
    returns an int because the parameters are only numbers without decimal places. As paramters,
    it gets an array of integer numbers

     */
    public static int findDifference(int [] numbers) {
        int MIN_VALUE = numbers[0];//a variable to store the minimum value. I take the first value of the array. Its important, because with the initialization with zero, zero would be always the smallest number.
        int MAX_VALUE = numbers[0];// a variable to store the maximum value
//in a foreach loop i go through every number. If the actual number is bigger as the stored number,
        // i write it in the variable as the new biggest number. This happens the same way to find the smallest Value.
        for (int number : numbers){
            if (number > MAX_VALUE) {
                MAX_VALUE = number;
            }
            if (number < MIN_VALUE) {
                MIN_VALUE = number;
            }
        }
//finding out the difference between the biggest and the smallest number by dividing.
        int difference = MAX_VALUE - MIN_VALUE;
        return difference;
    }
//the method finds the two smallest numbers. I took an array, because i want to return the values.This is only possible with an array. But this Method would also work with as "void" and two variables.

    public static int[]/*void*/ findSmallest2(int[] numbers) {
        int[] smallest={numbers[0],numbers[0]};//filling the array with the first number of the "parameter-array".
        // The smallest at the beginnig.
        //   int MIN_VALUE = numbers[0];
        //   int MIN_VALUE2 = numbers[0];
//iterating with a foreach loop, to fill the array with the smaller values. On the first position is the smallest value, on the second position, the second smallest.
        for (int number:numbers){
            if(number < smallest[0]){//checking if the number smaller as the first stored number
                smallest[1]=smallest[0];smallest[0]=number;}//if yes, writing the smallest number on the first position and the previously smallest number on the second
            else if (number>smallest[0]&&number<smallest[1]) {smallest[1]=number;}//if the number is not the smallest, but smaller then the second smallest, writing the number as the second smallest
        }
        return smallest;}

    //calculating a given Mathemtical Term in Steps without using the math-package. Using double, because decimal places possible.
    public static double calculateTerm(double x, double y) {
        double z=0; // a variable to store the result
        z=4*y-x; //inside the brackets
        z=x*x+z*z;//doubling x and the new z (n²) and adding both
        return z;}

    public void test() {

    }
}