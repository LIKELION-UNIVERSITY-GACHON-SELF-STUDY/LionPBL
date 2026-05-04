package role;

public abstract class total {
  String job;
  private String name;
  private String Major;
  private int Number;
  private String part;
  public total  (String name, String Major, int Number, String part) {
      this.name = name;
      this.Major = Major;
      this.Number = Number;
      this.part = part;
  }
  public abstract void Print();

  public String getName() {
    return name;
  }

  public String getMajor() {
    return Major;
  }
  public int getNumber() {
    return Number;
  }
  public String getPart() {
    return part;
  }

}
