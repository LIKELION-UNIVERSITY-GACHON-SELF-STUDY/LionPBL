import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("저장할 아기사자 수를 5이상 입력해주세요.");
    int n=sc.nextInt();
    sc.nextLine();

    if(n<5){
      System.out.println("[오류] 5 이상 입력해주세요.");
      System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
      n=sc.nextInt();
      sc.nextLine();
      System.out.println("아기사자 이름을 입력해주세요.");
      String[] name =new String[n];
      for(int i=0; i<n; i++){
        name[i]=sc.nextLine();
      }
      System.out.println("아기사자 명단을 최종적으로 출력합니다.");
      for(int i=0; i<n; i++){
        System.out.println(i+1+"번: "+name[i]);
      }

    }
    else{
      System.out.println("아기사자 이름을 입력해주세요.");
      String[] name =new String[n];
      for(int i=0; i< n; i++){
        name[i]=sc.nextLine();
      }

      System.out.println("아기사자 명단을 최종적으로 출력합니다.");
      for(int i=0; i<n; i++){
        System.out.println(i+1+"번: "+name[i]);
      }
    }
    //String[] name =new String[n];

  }
}