import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    while (true) {
      int babylions;
      Scanner sc = new Scanner(System.in);

      while (true) {
        System.out.println("아기사자 수를 5 이상 입력해 주세요!");
        babylions = sc.nextInt();

        if (babylions >= 5) {
          break;
        }
        System.out.println("[오류] 아기사자는 5 이상부터 등록 가능합니다.");
      }

      String babylionsArr[] = new String[babylions];
      System.out.println("\n입력한 아기사자 수 " + babylions + "크기의 배열이 생성되었습니다!");

      System.out.println("아기사자 이름을 입력해 주세요!");
      for (int i=0; i<babylions; i++) {
        babylionsArr[i] = sc.next();
      }

      System.out.println("\n아기사자 명단을 최종적으로 출력합니다.");
      for (int i=0; i<babylions; i++) {
        System.out.println(i+1 + ". " + babylionsArr[i]);
      }

      while (true) {
        System.out.println("======================");
        System.out.println("프로그램을 종료하려면 'exit'를 입력하세요.");
        System.out.println("새로운 아기사자 명단을 등록하려면 'restart'를 입력하세요.");
        String answer = sc.next();

        if (Objects.equals(answer, "exit")) {
          System.out.println("프로그램을 종료합니다.");
          System.exit(0);
        } else if (Objects.equals(answer, "restart")) {
          System.out.println("프로그램을 재시작합니다.\n");
          break;
        } else {
          System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
          continue;
        }
      }

    }
  }
}