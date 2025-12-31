import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'searchRotatedTimestamps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY nums
     *  2. INTEGER target
     */

    public static int searchRotatedTimestamps(List<Integer> nums, int target) {
        if(nums.size()==0){
            return -1;
        }
        int left=0;
        int end=nums.size()-1;


        while(left<=end){
            int mid=left+(end-left)/2;
            if(nums.get(mid)==target){
                return mid;
            }
            //left sorted check
            if(nums.get(left)<=nums.get(mid)){
                if(nums.get(left)<=target && nums.get(mid)>target){
                    end=mid-1;
                }
                else{
                    left=mid+1;}
            }
            else{
                if(nums.get(mid)<target && nums.get(end)>target){
                    left=mid+1;
                }
                else{
                    end=mid-1;
                }

            }}
        return -1;

    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int target = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.searchRotatedTimestamps(nums, target);

        System.out.println(result);

        bufferedReader.close();
    }
}
