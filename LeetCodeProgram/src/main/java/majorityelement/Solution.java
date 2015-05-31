package majorityelement;

public class Solution {
	public int majorityElement(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
		return nums[(nums.length / 2)];
	}

	private void simpleSort(int[] src, int from, int to) {
		int[] tmp = new int[to - from + 1];
		int size = 0;
		// insert sort
		for (int i = 0; i < tmp.length; i++) {
			int j = 0;
			for (; j < size; j++) {
				if (tmp[j] > src[i + from]) {
					//pay attention to the correct start position of original array
					break;
				}
			}
			for (int k = size; k > j; k--) {
				tmp[k] = tmp[k - 1];
			}
			tmp[j] = src[i + from];
			size++;
		}

		for (int i = from; i <= to; i++) {
			src[i] = tmp[i - from];
		}
	}

	private void mergeSort(int[] src, int from, int to) {
		if (to - from <= 2) {
			simpleSort(src, from, to);
		} else {
			int middle = (to + from) / 2;
			mergeSort(src, from, middle);
			mergeSort(src, middle + 1, to);

			int left = from;
			int right = middle + 1;
			int[] tmp = new int[to - from + 1];
			int index = 0;
			while (left <= middle && right <= to) {
				if (src[left] > src[right]) {
					tmp[index++] = src[right++];
				} else {
					tmp[index++] = src[left++];
				}
			}
			while (left <= middle) {
				tmp[index++] = src[left++];
			}
			while (right <= to) {
				tmp[index++] = src[right++];
			}

			for (int i = 0; i < tmp.length; i++) {
				src[from + i] = tmp[i];
			}
		}
	}
}
