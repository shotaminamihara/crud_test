package test04;

import java.time.Instant;

public class cytech04 {
    public static void main(String[] args) {
        long epochSecond = Instant.now().getEpochSecond();
        
        switch((int)(epochSecond % 2)) {
        case 0:
        	System.out.println("偶数です");
        	break;
        case 1:
        	System.out.println("奇数です");
        	break;
        }
    }
}
