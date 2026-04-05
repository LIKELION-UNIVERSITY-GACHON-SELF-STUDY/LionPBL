package Week2;

import Week2.Package1.Lion;

import java.util.Scanner;

public class Step4 {
    Scanner input= new Scanner(System.in);

    public void main() {


        System.out.print("이름: ");
        String name = input.nextLine();
        System.out.print("전공: ");
        String major = input.nextLine();
        System.out.print("기수: ");
        int generation = input.nextInt();
        input.nextLine();

        LionBonus lion = new LionBonus(name,major,generation);
        System.out.println("=================");
        while(isRetry()) {
            inputChangeField(lion);
        }

    }
    public void inputChangeField (LionBonus lion) {
        System.out.println("수정할 정보를 입력해주세요.(이름 / 전공 / 기수)");
        String field = input.nextLine();
        if(field.equals("이름")) {
            System.out.println("변경할 이름을 입력해주세요.");
            lion.setName(input.nextLine());
        } else if (field.equals("전공")) {
            System.out.println("변경할 전공을 입력해주세요.");
            lion.setMajor(input.nextLine());
        } else if (field.equals("기수")) {
            System.out.println("변경할 기수를 입력해주세요.");
            lion.setGeneration(input.nextInt());
            input.nextLine();
        } else {
            System.out.println("유효하지 않은 값입니다.");
        }

        lion.showField();
        System.out.println("=================");
    }
    public boolean isRetry() {
        System.out.println("아기사자 정보를 수정하겠습니까? (네 / 아니요)");
        String retry = input.nextLine();
        if(retry.equals("네")) {
            return true;
        } else if (retry.equals("아니요")) {
            System.out.println("프로그램을 종료합니다.");
            return false;
        }
        System.out.println("값을 정확하게 넣어주세요.");
        return true;
    }

    // 모든 입력 끝
}
