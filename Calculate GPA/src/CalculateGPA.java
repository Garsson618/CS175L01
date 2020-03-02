import java.util.Scanner;
public class CalculateGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		boolean run = true;
		double GP = 0;
		double TotalCH=0.0;
		double TotalGP=0.0;
		while (run = true){
			System.out.print("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit: ");
			String info = in.nextLine();
			if (info.contentEquals("Q"))
			{
				run = false;
				break;
			}
			String[] info1=info.split(","); 
			String title = info1[0];
			String credit = info1[1];
			double creditInt = Double.parseDouble(credit);
			String grade = info1[2];

			if (grade.contentEquals("A"))
				GP = 4;
			else if (grade.contentEquals("A-"))
				GP = 3.7;
			else if (grade.contentEquals("B+"))
				GP = 3.3;
			else if (grade.contentEquals("B"))
				GP = 3;
			else if (grade.contentEquals("B-"))
				GP = 2.7;
			else if (grade.contentEquals("C+"))
				GP = 2.3;
			else if (grade.contentEquals("C"))
				GP = 2;
			else if (grade.contentEquals("C-"))
				GP = 1.7;
			else if (grade.contentEquals("D+"))
				GP = 1.3;
			else if (grade.contentEquals("D"))
				GP = 1;
			else if (grade.contentEquals("D-"))
				GP = 0.7;
			else if (grade.contentEquals("F") || grade.contentEquals("WF"))
				GP = 0;
			double GPR = GP*creditInt;
			TotalCH=TotalCH+creditInt;
			TotalGP=TotalGP+GPR;
			System.out.println("Course    Credit Hours    Grade    Grade Points");
			System.out.println(title+"     "+credit+"               "+grade+"        "+GPR);
			System.out.println();
		}
		Double GPA=TotalGP/TotalCH;
		System.out.println();
		System.out.println(TotalCH+" Total Credit Hours    "+TotalGP+" Total Grade Points");
		System.out.print("GPA = "+TotalGP+"/"+TotalCH+" = ");
		System.out.printf("%1.2f",GPA);
	}

}
