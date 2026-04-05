package lion_step_1_2;

public class Lion {
  public String name;
  String major;
  private int grade;

  public Lion(String name, String major, int grade){
    this.name = name;
    this.major = major;
    this.grade = grade;
  }

public void check() {
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

  System.out.println("입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다. ");
}

public void print(){
  System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다. ");
  System.out.println("아기사자 정보를 출력합니다. ");
  System.out.println("이름: "+ name + " | 전공: " + major + " | 기수: " + grade);
}

}
