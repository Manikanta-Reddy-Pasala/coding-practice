package arrays;

import java.util.Arrays;

public class MinNumberOfPlatforms {

    public static void main(String args[]) {

        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 210, 230, 300, 315, 600};

        System.out.println(minimumStationsRequired(arr, dep, 6));

    }

    /*
    sort both arrays
    check arrival and departure time
    if departures time is more than arrival then increment arrival array
    if not increment departure array and decrement platforms since arrival is greater than departure so no need of platform
     */
    private static int minimumStationsRequired(int[] arr, int[] dep, int n) {

        int platform_needed = 0, maxPlatforms = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;

        // Similar to merge in merge sort
        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms)
                    maxPlatforms = platform_needed;
            } else {
                if (platform_needed > 0)
                    platform_needed--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
