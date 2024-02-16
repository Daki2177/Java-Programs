public class Eye extends Organ{

    private String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    @Override
    public void Details() {
        super.Details();

        System.out.println("Color: " + this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
