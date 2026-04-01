import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
    int n = sc.nextInt();
    String[] names = new String[n];

    if (n < 5) {
      System.out.println("[오류] 5 이상 입력해주세요.");
      System.out.println("저장할 아기사자 수를 5 이상 립력해주세요.");
      exit(0);
    }
    System.out.println("아기사자 이름을 입력해주세요.");

    for(int i = 0; i<n; i++) {
      names[i] = sc.next();
    }
    System.out.println("아기사자 명단을 최종적으로 출력합니다.");
    for(int i = 0; i <n; i++) {
      System.out.println(i+1+"."+names[i]);
    }

  }
}