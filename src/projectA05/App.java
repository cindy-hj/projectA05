package projectA05;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] grade = new int[10];
		int total = 0; // 전체 성적
		String Menu = "1. 성적입력\n2.성적합\n3.성적평균\n선택하시오:";
		// 무한루프
		for(;;) {
			System.out.println(Menu);
			String exec = in.nextLine();
			if(exec.equals("종료")) {
				break;
			}
			if(exec.equals("1")) {
				// 함수로 작성하시오
				System.out.println("첫번째 점수는");
				grade[0] = Integer.parseInt(in.nextLine());
				System.out.println("2번째 점수는");
				grade[1] = Integer.parseInt(in.nextLine());
				System.out.println("3번째 점수는");
				grade[2] = Integer.parseInt(in.nextLine());
				System.out.println("4번째 점수는");
				grade[3] = Integer.parseInt(in.nextLine());
				System.out.println("5번째 점수는");
				grade[4] = Integer.parseInt(in.nextLine());
				System.out.println("6번째 점수는");
				grade[5] = Integer.parseInt(in.nextLine());
				System.out.println("7번째 점수는");
				grade[6] = Integer.parseInt(in.nextLine());
				System.out.println("8번째 점수는");
				grade[7] = Integer.parseInt(in.nextLine());
				System.out.println("9번째 점수는");
				grade[8] = Integer.parseInt(in.nextLine());
				System.out.println("10번째 점수는");
				grade[9] = Integer.parseInt(in.nextLine());
			}
			if(exec.equals("2")) {
				// 함수로 작성하시오
				int sum=0;
				for(int i=0; i<grade.length; i++) {
					sum = sum + grade[i];
				}
				System.out.println("성적합은: "+sum);
				total = sum;
//				성적합();
			}
			if(exec.equals("3")) {
				// 함수로 작성하시오
				System.out.println("성적평균은: "+total/grade.length);
//				성적평균();
			}
		}

	}
	
//	public int 성적합() {
//		
//	}
//	
//	public int 성적평균() {
//		
//	}

}
