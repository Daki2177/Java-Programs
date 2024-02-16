import java.util.*;
public class Main {
    public static void main(String[] args) {

            Patient patient = new Patient("Dakalo", 24,
                    new Eye("Left eye", "Short sighted","Black"),
                    new Eye("Right eye", "Normal", "Black"),
                    new Heart("Heart", "Normal", 65),
                    new Stomach("Stomach", "PUD", true),
                    new Skin("Skin", "Burnt"));

            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());

        boolean shouldfinish = false;
        while(!shouldfinish){

            System.out.println("\n\t1. Left eye" +
                    "\n\t2. Right eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    patient.getLeftEye().Details();
                    break;

                case 2:

                    patient.getRightEye().Details();
                    break;

                case 3:
                    patient.getHeart().Details();

                    Scanner rate = new Scanner(System.in);
                    System.out.println("Enter new heart rate");

                    int newRate = rate.nextInt();

                    System.out.println("New heart rate" + newRate);

                    break;

                case 4:
                    patient.getStomach().Details();
                    break;

                case 5:

                    patient.getSkin().Details();
                    break;

                default:
                    shouldfinish = true;
                    break;


            }


        }

        }

    }
