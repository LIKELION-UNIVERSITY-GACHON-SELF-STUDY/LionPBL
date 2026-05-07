package package2;

import role.Lion;
import role.Member;
import role.Staff;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // [Step 2] 전체 명단(List) + 파트별 보관함(Map)
        List<Member> memberList = new ArrayList<>();
        Map<String, List<Member>> partMap = new HashMap<>();
        boolean run = true;

        while (run) {
            System.out.println("\n=== [Step 2] 메뉴 ===");
            System.out.println("1.등록 2.전체조회 3.이름검색 4.파트목록 5.파트별조회 6.종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("역할(1.아기사자 2.운영진), 이름, 전공, 기수, 파트, 기타(학번/직책): ");
                    int type = sc.nextInt();
                    String name = sc.next();
                    String major = sc.next();
                    int gen = sc.nextInt();
                    String part = sc.next();
                    String extra = sc.next();

                    // 중복 체크
                    boolean isDuplicate = false;
                    for (Member m : memberList) {
                        if (m.getName().equals(name)) isDuplicate = true;
                    }

                    if (isDuplicate) {
                        System.out.println("❌ 등록 거부: 이미 존재하는 이름입니다.");
                    } else {
                        Member newMember = (type == 1) ?
                            new Lion(name, major, gen, part, extra) :
                            new Staff(name, major, gen, part, extra);

                        // 1. 전체 명단(List)에 추가
                        memberList.add(newMember);

                        // 2. 파트별 보관함(Map)에도 추가 (핵심!)
                        partMap.computeIfAbsent(part, k -> new ArrayList<>()).add(newMember);

                        System.out.println("✅ 등록 성공!");
                    }
                    break;
                case 2:
                    System.out.println("\n--- 전체 명단 ---");
                    for (Member m : memberList) m.printInfo();
                    break;
                case 3:
                    System.out.print("검색 이름: ");
                    String target = sc.next();
                    for (Member m : memberList) {
                        if (m.getName().equals(target)) m.printInfo();
                    }
                    break;
                case 4:
                    // Map의 keySet()을 이용해 존재하는 파트 목록만 추출
                    System.out.println("현재 등록된 파트: " + partMap.keySet());
                    break;
                case 5:
                    // List처럼 전체를 뒤지지 않고, Map에서 해당 파트 바구니만 바로 꺼냄
                    System.out.print("조회할 파트명: ");
                    String searchPart = sc.next();
                    List<Member> partMembers = partMap.get(searchPart);

                    if (partMembers == null || partMembers.isEmpty()) {
                        System.out.println("해당 파트에 멤버가 없습니다.");
                    } else {
                        for (Member m : partMembers) m.printInfo();
                    }
                    break;
                case 6:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
        sc.close();
    }
}
