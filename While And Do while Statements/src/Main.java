public class Main {
    public static void main(String[] args) throws Exception {
        // int number = 4;
        // int finishedNumber =20;
        // while (number <= finishedNumber) {
        //     number++;
        //     if (!isEvenNumber(number)) {
        //         continue;
        //     }
        //     System.out.println("Even number " + number);
        // }

        int number = 4;
        int finishedNumber =20;
        int evenNumbersFound = 0;
        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found " + evenNumbersFound);
    }



    public static boolean isEvenNumber(int number) {
        if ((number % 2)== 0) {
            return true;
            
        }
        return false;
        
    }
}
