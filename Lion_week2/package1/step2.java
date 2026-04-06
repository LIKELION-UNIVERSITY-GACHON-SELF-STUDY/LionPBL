package package1;
import java.util.Scanner;

public class step2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input_name;
        String input_major;
        int input_th;

        System.out.println("\uD83E\uDD81 아기 사자 이름을 입력해주세요.");
        input_name = scanner.nextLine();
        System.out.println("\uD83C\uDF93 전공을 입력해주세요.");
        input_major = scanner.nextLine();
        System.out.println("\uD83D\uDCCC 기수를 입력해주세요.");
        input_th = scanner.nextInt();
        scanner.nextLine();

        Lion lion = new Lion(input_name,input_major,input_th);
        System.out.println("⏩ 객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");

        if(lion.IsValidName()&&lion.IsValidMajor()&&lion.IsValid_th()){
            System.out.println("✅ 아기사자 객체가 자신의 상태를 정상적으로 판단했습니다.");
            System.out.println("\uD83E\uDD81 아기사자 정보를 출력합니다.");
            System.out.println("\uD83E\uDDD4 이름: " + lion.name + " | \uD83C\uDF93 전공: " +
                lion.major + " | \uD83D\uDCCC 기수: " + lion.getTh());

        }else
            System.out.println("❌ 잘못된 아기사자 정보입니다.");

    }
}
