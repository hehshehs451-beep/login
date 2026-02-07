import java.util.*;

public class systemcontrol {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the subjects: ");
        int noOfSubjects = sc.nextInt();
        int marks[]=new int[noOfSubjects];
        System.out.println("enter the marks of " +noOfSubjects+"
            Subjects.Pfdss Enter to give marks for another subject"
        );
        for(int i=0,i<noOfSubjects;i++){
            marks[i]=sc.nextInt();
        }
        for(in j=0;j<noOfSubjects;j++){
            sum=sum+marks[j];
        }
        int percentage=sum/noOfSubjects;


        System.out.println(percentage);
        if(percentage>= 95){
            result="You scored A+.Well Done!";
        }
        else {
            result="you passed";
        }
        System.out.println(result);
    }
}
