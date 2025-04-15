package leetcode;

import java.util.Arrays;

public class Koko {
    public static void main(String[] args) {
        int[] piles ={30,11,23,4,20};
        Arrays.sort(piles);
        int h = 8;

        int result = minEatingSpeed(piles,h);
        System.out.println(result);

    }
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length-1];
        while (low<high){
            int middle = (low+high)/2;
            int hours = totalHours(piles,middle);
            if (hours <= h) {
                high = middle ; // Try a slower speed
            } else {
                low = middle +1; // Need a faster speed
            }
        }

        return low;


        }

    public static int totalHours(int[] piles, int speed) {
        int time = 0;
        for (int pile : piles) {
            time += (pile + speed - 1) / speed; // Same as ceil(pile / speed)
        }
        return time;
    }
    }

