package random_numbers;
import java.util.Random;
public class Main {
    public static void main (String[] args) {
        Random random = new Random();

        System.out.println("valor aleatório inteiro:");
        int x = random.nextInt(6)+1;
        System.out.println(x);

        System.out.println("valor aleatório duplo:");
        double y = random.nextDouble();
        System.out.println(y);

        System.out.println("valor aleatório bool:");
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
