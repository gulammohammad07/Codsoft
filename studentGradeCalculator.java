import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks out of 100 in each subject ");
        int english =0,maths=0,science =0, physics=0, biology =0;
        int totalMarks =0;
        int avgPercentage =0;
        System.out.println("\n Enter your english marks :- ");
        english=sc.nextInt();
        System.out.println("\n Enter your maths marks :- ");
        maths=sc.nextInt();
        System.out.println("\n Enter your science marks :- ");
        science=sc.nextInt();
        System.out.println("\n Enter your physics marks :- ");
        physics=sc.nextInt();
        System.out.println("\n Enter your biology marks :- ");
        biology=sc.nextInt();

        totalMarks=english+maths+science+physics+biology;
        avgPercentage=(totalMarks/5);
        System.out.println("your total marks out 500 = "+totalMarks);
        System.out.println("your scored percentage is = "+avgPercentage+"%.");

        if (avgPercentage>=60){
            System.out.println("Your GRADE is A  ");
        } else if (avgPercentage>=50 && avgPercentage<60) {
            System.out.println("Your GRADE is B  ");
        } else if (avgPercentage>=40 && avgPercentage<50) {
            System.out.println("Your GRADE is C  ");
        } else if (avgPercentage>=35 && avgPercentage<40) {
            System.out.println("Your GRADE is D  ");
        }else {
            System.out.println("Your Grade is F , & you are Fail.");
        }


    }
}
