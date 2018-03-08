import java.util.Scanner;
import java.util.Random;

public class RunnerTreasureHunt {
public static void main(String[] args) {


Person player1 = new Person((int) (Math.random() * 100), (int) (Math.random() * 100));
Treasure treasure = new Treasure((int) (Math.random() * 100), (int) (Math.random() * 100));
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the best game you will play probably ever");
player1.mainNavigate(player1, treasure);
System.out.println("Congrats");




	}


				

}
