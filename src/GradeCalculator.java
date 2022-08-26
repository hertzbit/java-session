public class GradeCalculator {

    public static void main(String[] args) {

        int percentageOfStudent = 65;

        if (percentageOfStudent >= 90) {
            System.out.println("Grade A");
        } else if (percentageOfStudent >= 75 && percentageOfStudent < 90) {
            System.out.println("Grade B");
        } else if (percentageOfStudent >= 50 && percentageOfStudent < 75) {
            System.out.println("Grade C");
        } else if (percentageOfStudent >= 40){
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

    }
}
