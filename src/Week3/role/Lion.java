package Week3.role;

import Week3.policy.Policy;

import java.util.Scanner;

public abstract class Lion {
//    protected Policy policy;
    protected String name, major, part;
    protected int generation;


    public Lion() {

    }
    Scanner input = new Scanner(System.in);

    abstract public void seePolicy();
    abstract public void showInfo();
    abstract  public void inputLionInformation();
    abstract public Policy getPolicy();


}
