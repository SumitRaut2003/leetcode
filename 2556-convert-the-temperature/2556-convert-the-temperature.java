class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        double celsius = 36.50;
        double[] result = s.convertTemperature(celsius); 
        System.out.println("The temperature in Kelvin: " + result[0]);
        System.out.println("The temperature in Fahrenheit: " + result[1]);
    }
}
