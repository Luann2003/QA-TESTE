import java.util.Arrays;
import java.util.Comparator;

public class Strings {

	public static void main(String[] args) {
		
		String strings[] = {"elefante", "cão", "borboleta", "gato"};
		
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(strings));

	}

}
