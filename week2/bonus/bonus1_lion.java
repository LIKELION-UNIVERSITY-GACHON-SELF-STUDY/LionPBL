package bonus;

public class bonus1_lion {
  private String name;
  private String major;
  private int grade;



  public bonus1_lion(String name, String major, int grade){

    System.out.println("입력값 검증을 진행합니다. ");

    if (name == null || name.isBlank()) {
      System.out.println("이름은 비어 있을 수 없습니다. ");
      System.exit(0);
    } else if (major == null || major.isBlank()) {
      System.out.println("전공은 비어 있을 수 없습니다. ");
      System.exit(0);
    } else if (grade < 1) {
      System.out.println("기수는 1 미만일 수 없습니다. ");
      System.exit(0);
    }


    this.name = name;
    this.major = major;
    this.grade = grade;
  }

  public static void check_name(String name){
    System.out.println("입력값 검증을 진행합니다. ");

    if (name == null || name.isBlank()) {
      System.out.println("이름은 비어 있을 수 없습니다. ");
      System.exit(0);
    }
  }
  public static void check_major(String major){
    System.out.println("입력값 검증을 진행합니다. ");

    if (major == null || major.isBlank()) {
      System.out.println("이름은 비어 있을 수 없습니다. ");
      System.exit(0);
    }
  }
  public static void check_grade(int grade){
    System.out.println("입력값 검증을 진행합니다. ");
    if (grade < 1) {
      System.out.println("기수는 1 미만일 수 없습니다. ");
      System.exit(0);
    }
  }
}


