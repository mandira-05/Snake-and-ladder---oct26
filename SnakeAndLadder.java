public class SnakeAndLadder {
    public static void main(String[] args) {
        int startPosition=0;
        int dieRoll = (int) (((Math.random()*10)%6)+1);

        System.out.println("Start position is :" +startPosition);
        System.out.println("Die roll is :" + dieRoll);

    }

}
