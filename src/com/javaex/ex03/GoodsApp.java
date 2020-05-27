package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Goods> gList = new ArrayList<Goods>();
		int sum = 0, price = 0, count = 0;
		String name;
		System.out.println("삼품을 입력해주세요(종료 q)");

		while (true) {
			try {
				System.out.print(">>");
				String Line = sc.nextLine();
				String gArray[] = Line.split(",");

				if (Line.equals("q")) {//종료
					System.out.println("[입력완료]\n===============");
					break;
				} else if (gArray.length == 3) {//상품 등록
					name = gArray[0];
					price = Integer.parseInt(gArray[1].trim());// trim 앞뒤 공백
					count = Integer.parseInt(gArray[2].trim());
					gList.add(new Goods(name, price, count));
					System.out.println("[상품등록 완료]");
				} else {//잘못된 값 입력
					System.out.println("잘못입력하였습니다.");
				}
			} catch (NumberFormatException e) {//예외처리
				System.out.println("error");
			}
		}//while
		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
			sum += gList.get(i).getCount();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
		sc.close();
	}

}
