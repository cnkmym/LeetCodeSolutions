package uniquepath;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;
	int[][] obstacleGrid;

	@Before
	public void init() {
		s = new Solution2();
	}

	@Test
	public void test0() {
		obstacleGrid = new int[][] { new int[] { 0 } };
		assertEquals(1, s.uniquePathsWithObstacles(obstacleGrid));
	}

	@Test
	public void test1() {
		obstacleGrid = new int[][] { new int[] { 0, 0, 0, 0, 0 } };
		assertEquals(1, s.uniquePathsWithObstacles(obstacleGrid));
		obstacleGrid = new int[][] { new int[] { 0, 0, 1, 0, 0 } };
		assertEquals(0, s.uniquePathsWithObstacles(obstacleGrid));
	}

	@Test
	public void test2() {
		obstacleGrid = new int[][] { //
		new int[] { 0, 0 }, //
				new int[] { 0, 0 } //
		};
		assertEquals(2, s.uniquePathsWithObstacles(obstacleGrid));

		obstacleGrid = new int[][] { //
		new int[] { 0, 1 }, //
				new int[] { 0, 0 } //
		};
		assertEquals(1, s.uniquePathsWithObstacles(obstacleGrid));

		obstacleGrid = new int[][] { //
		new int[] { 0, 1 }, //
				new int[] { 1, 0 } //
		};
		assertEquals(0, s.uniquePathsWithObstacles(obstacleGrid));

		obstacleGrid = new int[][] { //
		new int[] { 0, 0 }, //
				new int[] { 0, 1 } //
		};
		assertEquals(0, s.uniquePathsWithObstacles(obstacleGrid));
	}

	@Test
	public void test3() {
		obstacleGrid = new int[][] { //
		new int[] { 0, 0, 0 }, //
				new int[] { 0, 1, 0 } //
		};
		assertEquals(1, s.uniquePathsWithObstacles(obstacleGrid));
		obstacleGrid = new int[][] { //
		new int[] { 0, 0, 0 }, //
				new int[] { 0, 0, 0 } //
		};
		assertEquals(3, s.uniquePathsWithObstacles(obstacleGrid));
		obstacleGrid = new int[][] { //
		new int[] { 0, 0, 0 }, //
				new int[] { 1, 0, 0 } //
		};
		assertEquals(2, s.uniquePathsWithObstacles(obstacleGrid));
	}
}
