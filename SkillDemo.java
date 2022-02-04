public class SkillDemo{
    public static boolean isLeapYear(int x){
        if(x<0){
            throw new IllegalArgumentException("Please enter a year after BC");
        }
        if(x%4!=0){
            return false;
        }
        if(x%100==0 && x%400!=0){
            return false;
        }
        return true;
    }
}
