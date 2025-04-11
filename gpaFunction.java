import java.util.Scanner;

public class gpaApp {

    static Scanner userinput = new Scanner(System.in);

    static double computeGPA (double [] grades, double [] credits){
        double gpa = 0;
        double creditTotal = 0;
        int location =0;

        for(int i=0; i<credits.length; i++){
            gpa += credits[location]*grades[location];
            creditTotal += credits[location];
            location++;

        }

        gpa = gpa/creditTotal;

        return gpa;
    }

    public static void main(String[] args) {

        int location = 0;
        int num = 1;
        int numberOfClasses;

        System.out.println("How many classes did you take?");
        numberOfClasses = userinput.nextInt();

        double [] grades =  new double[numberOfClasses];
        double [] credits = new double[numberOfClasses];

        for(int j =0; j < numberOfClasses; j++){
            System.out.println("What was your grade in class " +num);
            grades[location] = userinput.nextDouble();

            System.out.println("How many credits was class " +num);
            credits[location] = userinput.nextDouble();

            num++;
            location++;
        }

        double gpa = computeGPA(grades, credits);

        System.out.println(gpa);

    }
}
