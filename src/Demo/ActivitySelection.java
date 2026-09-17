package Demo;
import java.util.Arrays;
import java.util.Comparator;

class Activity {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 3),
            new Activity(2, 4),
            new Activity(3, 5),
            new Activity(5, 7),
            new Activity(5, 9),
            new Activity(8, 10)
        };

        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        int count = 0;
        int lastFinish = 0;

        for (Activity activity : activities) {
            if (activity.start >= lastFinish) {
                System.out.println("Selected: " + activity.start + " - " + activity.finish);
                lastFinish = activity.finish;
                count++;
            }
        }

        System.out.println();
        System.out.println("Maximum activities = " + count);
    }
}