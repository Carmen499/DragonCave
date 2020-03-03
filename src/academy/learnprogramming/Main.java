package academy.learnprogramming;



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);

        System.out.println("Enter a number, any number, be careful, you are choosing your fate!!!");

      int Option1 = option.nextInt();
      if(Option1 == 1){
        System.out.println("You are currently approaching the cave, its dark, it SPOOKY!!!"  + "\n" +
                "A large dragon jumps out in front of you....!!!!!" + "\n" + "Oh no he opens his jaws!!!!!!!!" + "\n" +
                "He gobbles you in one bite... OH NO!!!" +
                "\n" + "*****************GAME OVER ******************");
    }

      else {

          if (Option1 == 2){
              System.out.println("You made it safe from the dragon!! Good job!");
          }

      }


    }
}
