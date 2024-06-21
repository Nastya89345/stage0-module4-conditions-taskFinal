package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        String result = switch (month){
            case 4, 6, 9, 11 -> "30";
            case 1, 3, 5, 7, 10, 12 -> "31";
            case 2 ->{
                if(isleap(year)){
                    yield "29";
                }else {
                    yield "28";
                }
            }
            default -> "invalid date";
        };
        System.out.println(result);
    }
    private static boolean isleap (int year){
        boolean result;
        if(year % 400 == 0){
            result = true;
        }else if(year % 100 == 0){
            result = false;
        }else if(year % 4 == 0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
