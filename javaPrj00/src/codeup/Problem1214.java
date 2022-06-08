package codeup;

import java.util.Scanner;

public class Problem1214 {

	public static void main(String[] args) {
		
		// 윤년
		
		//연도, 월 입력받기
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		
		//윤년인지 판단
		int temp = 28;//기본값으로 28을 지정!!! 윤년이라고 하면 temp 값을 29로 바뀌게!!!!!
		
		if(y % 400 == 0 || (y%4 == 0 && y%100 != 0)) {
			temp = 29;
		}
		
		
		//마지막 날 출력
		switch(m) {
		case 1 : 
		case 7 :
		case 3 : 
		case 5 :	
		case 8 : 
		case 10 : 
		case 12 : System.out.println("31"); break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : System.out.println("30"); break;
		
		//else 같은 친구!!
		default : System.out.println(temp);//굳이 break 쓸 필요 없음
		
		
		}
			
		}
	}


