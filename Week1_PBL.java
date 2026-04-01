import java.util.Scanner;

public class Week1_PBL {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //initializing size of array;
        System.out.print("🦁몇 명의 아기사자들을 입력하실 건가요? (최소 다섯명 이상) : ");
        int n =scanner.nextInt();
        if(n<5){
            System.out.print("\n⚠️ 다섯명 이상의 아기사자들을 입력해야합니다! 다시 입력해주세요.: ");
        }

        //get the names of students
        System.out.print("\n🦁 다섯명 이상의 아기사자 이름을 입력해주세요. : ");


        String[] arr= new String[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.next();

        }

        System.out.print("\n✏️최종 아기사자 명단\n");
        for(int j=0; j<n; j++){
        System.out.print("\n" + arr[j]);
        }
        scanner.close();
    }
}