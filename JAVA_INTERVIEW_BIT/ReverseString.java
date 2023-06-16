class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to the World";

        // int i = 0, j = str.length() - 1;
        // char[] reverseString = new char[j+i];

        // while(i<j) {
        //     reverseString[j] = str.charAt(i);
        //     reverseString[i] = str.charAt(j);
        //     i++;
        //     j--;
        // }
        // System.out.println("Reversed String = " + String.valueOf(reverseString));
        String revString = "";
        for(int i=str.length()-1; i>=0 ;i--) {
            revString += str.charAt(i);
        }
        String newRev = "";
        char[]rev = revString.toCharArray();
        for (int i = 0; i < rev.length; i++) {
            if (rev[i] == ' ') {
                // skip
                i++;
            }
            
            newRev += rev[i];
        }
        System.out.println("Reversed String = " + newRev.toLowerCase());
    }
}