// Lab09bvst.java
// The Rational Class Program II
// This is the student, starting version of the Lab09b assignment.


import java.util.Scanner;


public class Lab09bvst
{
	private static int num1, den1;   // numerator and denominator of the 1st rational number
	private static int num2, den2;   // numerator and denominator of the 2nd rational number

	public static void main (String args[])
	{
		enterData();

		Rational r1 = new Rational(num1,den1);
		Rational r2 = new Rational(num2,den2);
		Rational r3 = new Rational();

		r3.multiply(r1,r2);
		System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced());
		r3.divide(r1,r2);
		System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced());

//		100 Point Version Only
//		r3.add(r1,r2);
//		System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced());
//		r3.subtract(r1,r2);
//		System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced());
		System.out.println();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
		num1 = input.nextInt();
		System.out.print("\nEnter the 1st denominator --> ");
		den1 = input.nextInt();
		System.out.print("\nEnter the 2nd numerator ----> ");
		num2 = input.nextInt();
		System.out.print("\nEnter the 2nd denominator --> ");
		den2 = input.nextInt();
	}
}


class Rational
{
	//Attributes
	private int firstNum;	   // entered numerator
	private int firstDen;	   // entered denominator
	private int reducedNum;		// reduced numerator
	private int reducedDen;		// reduced denominator
  private int gcf;           // greatest common factor
	 //Constructor
	 public Rational(){
		 num1 = 2;
		 den1 = 5;
		 num2 = 5;
		 den2 = 7;
	 }
	 public Rational(int firstNum, int firstDen){
		 this.firstNum = num1;
		 this.firstDen = den1;
		 reduce();
	 }
	 public int reduce(){
		 getGCF(firstNum, firstDen);
		 reducedNum = firstNum/gcf;
		 reducedDen = firstDen/gcf;
	 }

	 //Methods
	 public String getOriginal(){
 	 String Original = " " + firstNum + "/" + firstDen;
	 return Original;

	 }
	 public int getReduced(){ return reduced; }

	 public void multiply(Rational r1, Rational r2){
		 this.firstNum = r1.firstNum * r2.firstDen;
		 this.firstDen = r1.firstDen * r2.firstNum;
		 reduce();
	 }
	 public void divide(){
		 this.firstNum = r1.firstNum * r2.firstDen;
		 this.firstDen = r1.firstDen * r2.firstNum;
		 reduce();
	 }
	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}


}
