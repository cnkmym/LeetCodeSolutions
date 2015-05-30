package compareversionnumbers;

public class Solution {
	public int compareVersion(String version1, String version2) {
		if (version1.equals("") || version2.equals("")) {
			return 0;
		}
		int index1 = 0;
		int versionPart1 = 0;
		int index2 = 0;
		int versionPart2 = 0;
		while (versionPart1 == versionPart2 && (index1 >= 0 || index2 >= 0)) {
			if (index1 < 0) {
				versionPart1 = 0;
			} else {
				int newIndex1 = version1.indexOf('.', index1);
				versionPart1 = parseVersion(version1, index1, newIndex1);
				index1 = newIndex1 < 0 ? -1 : newIndex1 + 1;
			}
			//
			if (index2 < 0) {
				versionPart2 = 0;
			} else {
				int newIndex2 = version2.indexOf('.', index2);
				versionPart2 = parseVersion(version2, index2, newIndex2);
				index2 = newIndex2 < 0 ? -1 : newIndex2 + 1;
			}
			//
		}
		if (versionPart1 < versionPart2) {
			return -1;
		} else if (versionPart1 > versionPart2) {
			return 1;
		} else {
			return 0;
		}
	}

	private int parseVersion(String version, int from, int to) {
		if (to < 0) {
			String part = version.substring(from);
			return Integer.valueOf(part);
		} else {
			String part = version.substring(from, to);
			return Integer.valueOf(part);
		}
	}

}
