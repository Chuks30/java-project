package tdd;

public class Comparison {
    public int addThreeIntegers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int findminmim(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else if (num3 < num1 && num3 < num2) {
            return num3;
        }
        return num1;
    }

    public int findProduct(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int findMaximum(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3){
            return  num1;
    }
        else if(num2 > num1 && num2 > num3){
            return num2;
        }
        else {
            return num3;
        }

    }

    public int findAverage(int num1, int num2, int num3) {
        return num1 + num2 + num3 / num2;
    }
}
