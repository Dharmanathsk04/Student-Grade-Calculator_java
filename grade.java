import java.util.Scanner;

class studentGradecalculator {

    String name;
    int marks1,marks2,marks3;
    float percentage;
    char grade;
    int total;

    void inputDetales() {


        Scanner sc = new Scanner(System.in);

        System.out.print("enter student name : ");
        name = sc.nextLine();


        System.out.print("Enter marks 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        marks3 = sc.nextInt();



    }


    void calculateResult() {

        total = marks1 + marks2 + marks3;

        percentage = total / 3.0f;

        if(percentage >= 90) 

            grade = 'A';

        else if(percentage >= 75)
            
            grade = 'B';

        else if (percentage >= 60)

            grade = 'C';

        else
            
            grade = 'D';

    }

    void displayResult() {

        System.out.println("\n------student result-----------");
        System.out.println("name : "+name);
        System.out.println("Total marks : "+total);
        System.out.println("percentage : "+percentage+"%");
        System.out.println("Grade : "+grade);
    }

    public static void main(String[] args) {
        
        studentGradecalculator student = new studentGradecalculator();


        student.inputDetales();
        student.calculateResult();
        student.displayResult();

       
    }

    
}