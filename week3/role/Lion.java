public class Lion extends Role{
  int number;
  public Lion(String name, String major ,int generation, String part, int number){

    super(name, major, generation, part);
    this.number = number;
  }
  @Override
  SubmissionPolicy getPolicy(){
    return new LionSubmissionPolicy();
  }

  @Override
  void SubmissionStatus() {
    if(getPolicy().canHomework()){
      System.out.println("📝 과제 제출 가능 여부: ✅");
    }
  }

  @Override
  String getInfo(){
    return getBasicInfo() + "\n🆔 학번: "+ this.number;

  }
}

