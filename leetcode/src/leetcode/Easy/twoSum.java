package leetcode.Easy;

/**
 * 目的：比較陣列索引值 0 與 1 相加與實際數相等則印出索引值 0 , 1
 * @author chienlin
 *
 */
public class twoSum {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		twoSum twoSum = new twoSum();
		System.out.println(twoSum.twoSum(nums, nums[0]+nums[1]));
		int[] result = new int[2];
		result = twoSum.twoSum(nums, nums[0]+nums[1]);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		
		// 1) 宣告一個陣列裝兩數
		int[] twoNums = new int[2];
		
		// 2) 比較陣列的 0 與 1 
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				// 3) 判斷兩數相加是否等於 i + j
				if(nums[i] + nums[j] == target) {
					// 4) 放到 twoNums 陣列中
					twoNums[0] += i;
					twoNums[1] += j;
					return twoNums;
				}
			}
		}
		
		
		
		return twoNums;
		
	}
}
