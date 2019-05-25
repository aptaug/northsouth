package azimjava;

import java.util.Scanner;

public class work1 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to NSU");
		System.out.println("Enter your Score");
		Scanner grade= new Scanner(System.in);
		float userinput = grade.nextFloat();
				
				if (userinput >=93) {
					System.out.println("your grade is A" );
					int userdata = (int) userinput;
					switch (userdata) {
					case 100:
						System.out.println("SCL");
						break;
					case 99:
						System.out.println("MCL");
						break;
					case 98:
						System.out.println("CL");
						break;
					default:
						break;
					}
				}else if (userinput >=80 && userinput <93) {
					System.out.println("Your garde is B");
					
				}
				else if (userinput >=70 && userinput <80) {
					System.out.println("Your garde is c");
					
				}
				else if (userinput >=60 && userinput <70) {
					System.out.println("Your garde is d");
				}
		
				else {
					System.out.println("you failed");
				}
	}

}
