package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double max;
        if(firstSide > secondSide && firstSide > thirdSide){
            max = firstSide;
        }else if(firstSide < secondSide && secondSide > thirdSide){
            max = secondSide;
        }else {
            max = thirdSide;
        }
        double sum = firstSide + secondSide + thirdSide;
        if((sum - max) > max){
            System.out.println("this is a valid triangle");
        }else {
            System.out.println("it's not a triangle");
        }
    }
}
