package leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* 문제주소 : https://leetcode.com/problems/3sum/
* 난이도 : 미디움
* 문제 내용 요약 : 주어진 배열에서 3개 숫자를 꺼냄. 3개 숫자를 더해서 0이 되는 경우의 집합 구하기
*/
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new LinkedList<>();

        //정렬
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2; i++){

            if(nums[i] > 0) break;

            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1; int k = nums.length-1;

            while(j<k){

                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                   answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                   while(j < k && nums[j]==nums[j-1]) j++;
                   while(j < k && nums[k]==nums[k+1]) k--;

                }
                if(sum > 0) k--;
                if(sum < 0) j++;

            }
        }

        return answer;
        
    }
    
    
    
}
