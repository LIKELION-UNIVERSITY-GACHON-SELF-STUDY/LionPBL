public class Staff extends role{
    String position;

    public Staff(
        String name,
        String major,
        int th,
        String part,
        String position
    )
    {
        super(name, major, th, part);
        this.position = position;

    }


}
