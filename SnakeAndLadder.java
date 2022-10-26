public class SnakeAndLadder {
    public static void main(String[] args) {
        int startPosition = 0;
        int finish = 100;
        //int dieRoll = (int) (((Math.random() * 10) % 6) + 1);

        System.out.println("Start position is :" + startPosition);
        //System.out.println("Die roll is :" + dieRoll);
        //int option = (int) (((Math.random() * 10) % 3) + 1);
        //System.out.println("Option play is : " + option);

        while (startPosition < finish) {

            int option = (int) (((Math.random() * 10) % 3) + 1);
            System.out.println("Option play is : " + option);
            int dieRoll = (int) (((Math.random() * 10) % 6) + 1);

            if (option == 1) {
                System.out.println("Player cant move");
            } else if (option == 2) {
                System.out.println("Player got ladder");
                startPosition = startPosition + dieRoll;
                System.out.println("player moves " + dieRoll + " steps forward");

            } else {
                System.out.println("Player got snake");

                if (startPosition<0) {
                    System.out.println("start from home ");
                    startPosition=0;
                } else {
                    startPosition = startPosition - dieRoll;
                    System.out.println("player moves " + dieRoll + " steps backward");
                }
                


            }


        }
        System.out.println("Player reached " +startPosition+ " position");
    }

}
