package package1;
import java.util.Scanner;

public class step1 {
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

        System.out.println("\uD83D\uDCCC 입력값 검증을 진행합니다");
        if(!input_name.isBlank()){
            if(!input_major.isBlank()){
                if(input_th >= 1){
                    System.out.println("⏩ 입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
                    Lion lion = new Lion(input_name,input_major,input_th);
                    System.out.println("✅ 아기사자 객체를 성공적으로 생성하였습니다.");
                    System.out.println("\uD83E\uDD81 아기사자 정보를 출력합니다.");
                    System.out.println("\uD83E\uDDD4 이름: " + lion.name + " | \uD83C\uDF93 전공: " +
                        lion.major + " | \uD83D\uDCCC 기수: " + lion.getTh());
                }
                else{
                    System.out.println("❌ 기수는 1이상이여야 합니다");
                }
            }
            else{
                System.out.println("❌ 전공은 비어있을 수 없습니다.");
            }
        }
        else{
            System.out.println("❌ 이름은 비어있을 수 없습니다.");
        }





    }
}
