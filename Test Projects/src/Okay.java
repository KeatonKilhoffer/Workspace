import java.util.Scanner;

public class Okay {
	public static void main(String[] args){

	for (int at = 0; at < 4; at++){
		int test = (int) (((Math.pow(at, 2) % 5) - 1) % 2);
		System.out.println(( (Math.pow(((at+5) % 6), 2) % 5) % 3));

    }
}
}