package time;

import java.util.Scanner;

import time.models.TimeModel;
import time.services.TimeService;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");

        long seconds = 0L;
        seconds = scanner.nextLong();

        TimeModel time = new TimeModel(seconds);

        TimeService timeService = new TimeService(time);

        timeService.totalTime();

        scanner.close();
    }
}
