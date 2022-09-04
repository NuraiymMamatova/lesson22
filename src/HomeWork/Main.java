package HomeWork;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1, 100);
            arrayList.add(a);

            if(arrayList.get(i)%2==0){
                arrayList1.add(a);
            }
            else{
                arrayList2.add(a);
            }
        }

        System.out.println("tak sundar: ");
        for (int nums:arrayList1) {
            System.out.print(nums+"   ");
        }

        System.out.println("\nzhup sundar: ");
        for (int nums:arrayList2) {
            System.out.print(nums+"   ");
        }


    }
}
