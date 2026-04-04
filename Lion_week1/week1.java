import java.util.InputMismatchException;
import java.util.Scanner;

public class week1 {

    public static void main(String[] args) {

        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            int Baby_lion;
            while (true) {
                try
                {
                    System.out.println("\uD83E\uDD81 저장할 아기사자 수를 5 이상 입력해주세요.");
                    Baby_lion = scanner.nextInt();
                    if (Baby_lion >= 5) {
                        scanner.nextLine();
                        break;
                    }
                    System.out.println("⚠\uFE0F[오류] 5 이상 입력해주세요.\n");
                    scanner.nextLine();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("⚠\uFE0F[오류] 숫자만 입력할 수 있습니다.\n");
                    scanner.nextLine();
                }
            }
            String[] Baby_lion_Name = new String[Baby_lion];

            System.out.println("✏\uFE0F 아기사자 이름을 입력해주세요.");
            int cnt = 0;

            while(true)
            {
                if(cnt == Baby_lion)
                    break;
                String name = scanner.nextLine();
                if(cnt == 0)
                {
                    if(name.trim().isEmpty())
                    {
                        System.out.println("\uD83D\uDC40 이름이 비어있습니다. 다시 입력해주세요.");
                        continue;
                    }
                    else
                    {
                        Baby_lion_Name[cnt] = name;
                        cnt++;
                        continue;
                    }
                }
                if(name.trim().isEmpty())
                {
                    System.out.println("\uD83D\uDC40 이름이 비어있습니다. 다시 입력해주세요.");
                    continue;
                }
                int check = 0;
                for(int i = 0; i<cnt; i++)
                {
                    if(name.equals(Baby_lion_Name[i]))
                    {
                        System.out.println("❌ 이미 등록된 이름입니다. 다시 입력해주세요.");
                        check++;
                        break;
                    }
                }
                if(check != 1)
                {
                    Baby_lion_Name[cnt] = name;
                    cnt++;
                }

            }

            System.out.println("\uD83D\uDDD2\uFE0F 아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i < Baby_lion; i++) {
                System.out.println("\uD83E\uDD81 " + (i + 1) + ". " + Baby_lion_Name[i]);

            }
            System.out.println("=========================================");
            System.out.println("⛔ 프로그램을 종료하려면 'exit'을 입력하세요.");
            System.out.println("\uD83D\uDD04 계속 아기사자를 등록하려면 'restart'를 입력하세요.");

            String ex = scanner.nextLine();
            if(ex.equals("exit"))
            {
                System.out.println("⛔ 아기사자 명단 관리 프로그램을 종료합니다.");
                break;
            }
            else if (ex.equals("restart"))
            {
                continue;
            }
            else
            {
                System.out.println("\uD83E\uDD1A 아기사자 명단 관리 프로그램을 종료합니다.");
                break;
            }
        }
    }
}


