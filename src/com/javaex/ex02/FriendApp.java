package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		List<Friend> fList = new ArrayList<Friend>();

		for (int i = 0; i < 3; i++) {
			String line = sc.nextLine();
			String fArray[] = line.split(" ");
			Friend friend = new Friend(fArray[0], fArray[1], fArray[2]);
			fList.add(friend);
		}

		for (int i = 0; i < fList.size(); i++) {
			fList.get(i).showInfo();
		}
	}
}
