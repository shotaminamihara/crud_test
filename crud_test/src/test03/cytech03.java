package test03;

import java.time.Instant;

public class cytech03 {
    public static void main(String[] args) {
        long epochSecond = Instant.now().getEpochSecond();
        
        if (epochSecond % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
    }
}
