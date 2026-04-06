package week2;

import week2.package1.Lion;

import java.util.Scanner;

public class Bonus {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("이름을 입력해주세요: ");
        String name = sc.nextLine();
        System.out.print("전공을 입력해주세요: ");
        String specialty = sc.nextLine();
        System.out.print("기수를 입력해주세요: ");
        int corps = sc.nextInt();
        sc.nextLine();

        Lion lion = new Lion(name, specialty, corps);
        System.out.println("객체가 생성 되었습니다.");
        System.out.println("이름: " + lion.name);
        System.out.println("전공: " + lion.specialty);
        System.out.println("기수: " + lion.corps);

        System.out.println("===========================");

        while(true) {
            System.out.println("정보를 수정하시겠습니까? (네/아니오)");

            String answer = sc.nextLine();

            if(answer.equals("아니오")) break;
            while (!answer.equals("네")) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                answer = sc.nextLine();
            }

            System.out.println("수정 할 정보를 입력해주세요.(이름 / 전공 / 기수)");

            boolean bool = false;
            while (true) {
                bool = modifyLionInfo(lion);
                if(bool) break;
            }
            System.out.println("수정 한 정보입니다. 이름: " + lion.name +
                    " 전공: " + lion.specialty + " 기수: " + lion.corps);
        }
    }

    public static boolean modifyLionInfo(Lion lion){

        boolean bool = false;
        String modify = sc.nextLine();
        switch (modify) {
            case "이름":
                System.out.print("변경 할 이름을 입력해주세요: ");
                lion.ModifyNameLion(sc.nextLine());
                bool=true;
                break;
            case "전공":
                System.out.print("변경 할 전공을 입력해주세요: ");
                lion.ModifySpecialtyLion(sc.nextLine());
                bool=true;
                break;
            case "기수":
                System.out.print("변경 할 기수를 입력해주세요: ");
                lion.ModifyCorpsLion(sc.nextInt());
                sc.nextLine();
                bool=true;
                break;
        }
        if(!bool) System.out.println("잘못 입력하셨습니다. 이름, 전공, 기수만 입력해주세요.");
        return bool;

    }


}
