package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Goods> gList = new ArrayList<Goods>();
		int sum = 0, num01 = 0, num02 = 0;

		System.out.println("삼품을 입력해주세요(종료 q)");

		while (true) {
			System.out.print(">>");
			String Line = sc.nextLine();
			String gArray[] = Line.split(",");
			if (Line.equals("q")) {
				System.out.println("[입력완료]\n===============");
				for (int i = 0; i < gList.size(); i++) {
					gList.get(i).showInfo();
					sum += gList.get(i).getCount();
				}
				System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
				break;
			} else if (gArray.length == 3) {
				num01 = Integer.parseInt(gArray[1]);
				num02 = Integer.parseInt(gArray[2]);
				Goods good= new Goods(gArray[0], num01, num02);
				gList.add(good);
			} else {
				System.out.println("잘못입력하였습니다.");
			}

		}
	}

}
