package rectanglearea;

public class Solution2 {
	// compute unite area
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		return (C - A) * (D - B) + (G - E) * (H - F) - computeIntersectionArea(A, B, C, D, E, F, G, H);
	}

	// compute intersection area
	public int computeIntersectionArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		// condition 1
		// vertically non intersection
		if (B >= H || F >= D) {
			return 0;
		}
		// horizontally non intersection
		if (E >= C || A >= G) {
			return 0;
		}

		// special rectangle
		if (A == C || B == D || E == G || F == H) {
			return 0;
		}

		int overlappedX = 0;
		int overlappedY = 0;
		// condition 2
		// vertically totally overlapped
		if (B <= F && D >= H) {
			// rectangle 1 is bigger
			overlappedY = H - F;
		} else if (B >= F && D <= H) {
			// rectangle 2 is bigger
			overlappedY = D - B;
		} else if (B <= F) {
			// rectangle 1 is below intersection
			overlappedY = D - F;
		} else {
			// rectangle 1 is above intersection
			overlappedY = H - B;
		}

		// horizontally totally overlapped
		if (A <= E && C >= G) {
			// rectangle 1 is bigger
			overlappedX = G - E;
		} else if (A >= E && C <= G) {
			// rectangle 2 is bigger
			overlappedX = C - A;
		} else if (A <= E) {
			// rectangle 1 is left intersection
			overlappedX = C - E;
		} else {
			// rectangle 1 is right intersection
			overlappedX = G - A;
		}

		return overlappedX * overlappedY;
	}
}
