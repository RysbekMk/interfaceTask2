public class Superman implements CanFly,CanRun,CanSwim{
    private String name;
    private int weight;

    public Superman(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println(name+" flying ");
    }

    @Override
    public void run() {
        System.out.println(name+" run speed");
    }

    @Override
    public void swimm() {
        System.out.println(name+" swimm the best");
    }
}
