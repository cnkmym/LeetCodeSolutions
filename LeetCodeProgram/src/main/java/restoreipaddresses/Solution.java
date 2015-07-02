package restoreipaddresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> restoreIpAddresses(String s) {
		char[] digits = s.toCharArray();
		List<String> ips = new ArrayList<String>();
		for (int dot1 = 0; dot1 < digits.length - 3; dot1++) {
			if (digits[0] == '0' && dot1 > 0) {
				break;
			}
			if (dot1 >= 3) {
				break;
			}
			if (dot1 < digits.length - 10) {
				continue;
			}
			for (int dot2 = dot1 + 1; dot2 < digits.length - 2; dot2++) {
				if (digits[dot1 + 1] == '0' && dot2 > dot1 + 1) {
					break;
				}
				if (dot2 >= dot1 + 4) {
					break;
				}
				if (dot2 < digits.length - 7) {
					continue;
				}
				for (int dot3 = dot2 + 1; dot3 < digits.length - 1; dot3++) {
					if (digits[dot2 + 1] == '0' && dot3 > dot2 + 1) {
						break;
					}
					if (dot3 >= dot2 + 4) {
						break;
					}
					if (dot3 < digits.length - 4) {
						continue;
					}
					if (digits[dot3 + 1] == '0' && dot3 + 1 < digits.length - 1) {
						continue;
					}
					String newIp = convertIp(digits, dot1, dot2, dot3);
					if (!newIp.equals("")) {
						ips.add(newIp);
					}
				}
			}
		}
		return ips;
	}

	private String convertIp(char[] digits, int dot1, int dot2, int dot3) {
		String p1 = String.valueOf(digits, 0, dot1 + 1);
		String p2 = String.valueOf(digits, dot1 + 1, dot2 - dot1);
		String p3 = String.valueOf(digits, dot2 + 1, dot3 - dot2);
		String p4 = String.valueOf(digits, dot3 + 1, digits.length - dot3 - 1);
		if (Integer.valueOf(p1) > 255 || Integer.valueOf(p2) > 255 || Integer.valueOf(p3) > 255
				|| Integer.valueOf(p4) > 255) {
			return "";
		}
		return p1 + "." + p2 + "." + p3 + "." + p4;
	}
}
