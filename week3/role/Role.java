abstract class Role {
  private String name, major, part;
  private int generation;

  private Role(String name, String major, int generation, String part){
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
  }
  abstract SubmissionPolicy getPolicy();

  abstract void SubmissionStatus();

}


