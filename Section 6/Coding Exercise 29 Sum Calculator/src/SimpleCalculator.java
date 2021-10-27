public class SimpleCalculator {

    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber() {
        return firstNumber;

    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        // double result = this.firstNumber + this.secondNumber;
        // return result;
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
        // return (secondNumber==0) ? 0 : firstNumber/secondNumber; // ternary operator
        // //Ternary operator // looks cool and confusing
    }

}
