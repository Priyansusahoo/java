public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean banda = false
        
        if (barking) 
        {
        if (barking < 8 || barking > 22) 
        {
            return true;
            
        }
        else if (hourOfDay < 0 || hourOfDay > 23) 
        {
            return false;
        }
        else{f
            return false;
        }
     }
        return banda;
    }
}
