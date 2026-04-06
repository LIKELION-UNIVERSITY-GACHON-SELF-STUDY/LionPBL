package package2;
import package1.Lion;

public class step3 {
    public static void main(String[] args){

        System.out.println("\uD83E\uDD81 아기사자 객체를 생성합니다.");
        Lion lion = new Lion("백승훈","소프트웨어학과",14);

        System.out.println("\uD83E\uDD81 아기사자 정보를 출력합니다.");
        System.out.println("\uD83E\uDDD4 이름: " + lion.name + " | \uD83C\uDF93 전공: " +
            lion.getMajor() + " | \uD83D\uDCCC 기수: " + lion.getTh());

        System.out.println("\n\uD83D\uDCCC Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("\uD83D\uDC49 name 필드 값을 변경합니다.");
        System.out.println("✅ Public 필드 접근 성공");
        lion.name = "심바";

        System.out.println("\uD83E\uDD81 아기사자 정보를 출력합니다.");
        System.out.println("\uD83E\uDDD4 이름: " + lion.name + " | \uD83C\uDF93 전공: " +
            lion.getMajor() + " | \uD83D\uDCCC 기수: " + lion.getTh());

        // lion.major = "인공지능학과";
        // lion.th = 13;

    }
}
