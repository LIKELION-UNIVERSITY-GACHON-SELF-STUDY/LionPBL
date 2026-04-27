public class Staff extends Role{
  String position;
  Staff(String name, String major, int generation, String part, String position){
    super(name, major, generation, part);
    this.position = position;
  }

  @Override
  SubmissionPolicy getPolicy(){
    return new StaffSubmissionPolicy();
  }

  @Override
  void SubmissionStatus() {
    if(getPolicy().canHomework()==false){
      System.out.println("📝 과제 제출 가능 여부: ❌");
    }
  }


}
