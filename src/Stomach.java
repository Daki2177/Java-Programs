public class Stomach extends Organ{

    private boolean isFull;

    public Stomach(String name, String medicalCondition, boolean isFull) {
        super(name, medicalCondition);
        this.isFull = isFull;
    }

    @Override
    public void Details() {
        super.Details();

        if (isFull){

            System.out.println("The stomach is full.");
        }
        else {

            System.out.println("Stomach needs to be fed.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
