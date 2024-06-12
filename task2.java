
import java.util.Scanner;
public class task2 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();

        int [] marks = new int[n];
        int totalmarks=0;

        for(int i=0;i<n;i++)
        {   
            System.out.print("Enter the marks for subject"+(i+1)+":");
            marks[i] = sc.nextInt();
            totalmarks += marks[i];
        }
        double avgPer =(double)(totalmarks/n);
        String grade;
        if(avgPer >= 90)
        {
            grade ="A+";
        }
        else if(avgPer<90 && avgPer>80)
        {
            grade="A";
        }
        else if(avgPer<80 && avgPer>70)
        {
            grade="B+";
        }
        else if(avgPer<70 && avgPer>60)
        {
            grade="B";
        }
        else if(avgPer<60 && avgPer>50)
        {
            grade="C+";
        }
        else if(avgPer<50 && avgPer>40)
        {
            grade="C";
        }
        else{
            grade= "fail";
        }
        System.out.println("TOTAL MARKS: "+totalmarks);
        System.out.println("AVERAGE PERCENTAGE: "+avgPer);
        System.out.println("GRADE ACHIEVED: "+grade);

        sc.close();



    }
    
}
