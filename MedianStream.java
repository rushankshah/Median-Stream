import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MedianStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(52);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(26);
        list.add(13);
        Collections.sort(list);
        System.out.println(list);
        List<Float> medians = new ArrayList<>();
        int prevSum = 0;
        int size = list.size();
        for (int i = 1; i <= size; i++) {
            int currentNumber = list.remove(0);
            prevSum += currentNumber;
            float num = (float) prevSum / i;
            medians.add(num);
        }
        System.out.println(medians);
    }
}