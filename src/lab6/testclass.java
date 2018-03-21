package lab6;
import java.util.Scanner;

public class testclass {
static student[] test = new student[6];

public static void getdata() {
	 for (int i=0;i<test.length;i++) {
		 test[i]= new student();
		 System.out.println("enter name of student"+i);
		 Scanner reader1 = new Scanner(System.in);
		 test[i].name = reader1.nextLine();
		 System.out.println("enter Registration number of student"+i);
		 test[i].reg_no = reader1.nextInt();
		 if (i!=0) {
			 for(int z=0;z<i;z++) {
				 if(test[i].reg_no==test[z].reg_no) {
					 System.out.println("your registration number is duplicate, please enter another");
					 test[i].reg_no= reader1.nextInt();
				 }
			 }
		 }
		 System.out.println("enter cgpa of student"+i);
		 test[i].cgpa= reader1.nextFloat();
		 if  (test[i].cgpa>4) {
			 System.out.println("gpa not correct please enter suitable data");
			 test[i].cgpa= reader1.nextInt();
			 
		 }
				 
	 }
	
}
public static void printdata() {
	for (int i=0;i<test.length;i++) {
	 System.out.println(test[i].name + "         " + test[i].reg_no +"          " + test[i].cgpa );
}
}

public static void mingpa() {
	float min=test[0].cgpa;
	for(int i=0;i<test.length;i++) {
		if(min>test[i].cgpa) {
			min=test[i].cgpa;
		}
	}
	System.out.println("Minimum cgpa is:"+min);
}
public static void maxgpa() {
	float max=test[0].cgpa;
	for(int i=0;i<test.length;i++) {
		if(max<test[i].cgpa) {
			max=test[i].cgpa;
		}
	}
	System.out.println("Maximum cgpa is:"+max);
}

public static void avg_gpa() {
	float avg=0;
	for(int i=0;i<test.length;i++) {
		
			avg+=test[i].cgpa;
		
	}
	avg=avg/6;
	System.out.println("Average cgpa is:"+avg);
	
	System.out.println("\nStudents below average:");
	for(int i=0;i<test.length;i++) {
		if(test[i].cgpa<avg) {
			System.out.println(test[i].name);
		}
	}
}
 public static void rank() {
	 float temp= 0;
	 String temp1;
	 int temp2;
	 for(int i=0; i < test.length; i++){  
         for(int j=1; j < (test.length-i); j++){  
                  if(test[j-1].cgpa < test[j].cgpa){  
                         //swap elements  
                         temp = test[j-1].cgpa;  
                         test[j-1].cgpa = test[j].cgpa;  
                         test[j].cgpa = temp;
                         temp1 = test[j-1].name;  
                         test[j-1].name = test[j].name;  
                         test[j].name = temp1;
                         temp2 = test[j-1].reg_no;  
                         test[j-1].reg_no = test[j].reg_no;  
                         test[j].reg_no = temp2;  
                 }  
 }

	 }
	 System.out.println("ranked students are 1st to last/n");
		for (int i=0;i<test.length;i++) {
			 System.out.println(test[i].name + "         " + test[i].reg_no +"          " + test[i].cgpa );
		}

 }
public static void main(String[] args) {
	testclass t1=new testclass();
	t1.getdata();
	t1.printdata();
	t1.mingpa();
	t1.maxgpa();
	t1.avg_gpa();
	t1.rank();

}


}
