package com.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] nums = {12, 34, 23, 8, 8, 10, 10, 8};
		int target = 10;
		
		int[] ans = searchRange(nums, target);
		
		System.out.println(Arrays.toString(ans));

	}
	
	static int[] searchRange(int[] nums, int target) {
		int[] ans = {-1, -1};
		
		//check for first occurrence if target first
		ans[0] = search(nums, target, true);
		if(ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}
		
		return ans;
	}
	
	//this function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		
		while(start <= end) {
			//find the middle element
			int mid = start + (end - start) / 2;
			
			if(target < nums[mid]) {
				end = mid - 1;
			}else if(target > nums[mid]) {
				start = mid + 1;
			}else {
				//potential ans found
				ans = mid;	
				if(findStartIndex) {					
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
		}
		
		return ans;
	}

}
