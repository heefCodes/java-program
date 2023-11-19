package chapterSix;

import java.security.SecureRandom;

public class Rolling {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int roll = 1; roll <= 10; roll++) {
            int face = 1 + 1 * random.nextInt(6);

            System.out.printf("%d ", face);

            if (roll % 5 == 0)
                System.out.println();
        }
    }
    
}
