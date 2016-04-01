import static org.junit.Assert.*;

import org.junit.Test;


public class testSorting {

	Sorting s;
	Sorting s2;
	Sorting []m;
	
	int[]a;
	@Test
	public void test() {
		s=new Sorting();
		a=new int[]{3,2,1};
		s.insertionSort(a);
		assertEquals(true,s.isSorted(a));
		a=new int[]{3,2,1};
		Sorting.quicksort(a);
		assertEquals(true,s.isSorted(a));
		Sorting.swap(a, 1, 2);
		assertEquals(false,s.isSorted(a));
		s2=new Sorting();
		m=new Sorting[]{s,s2};
		Sorting.swapReferences(m, 0, 1);
		
		a=new int[]{8,2,1,8,6,5,4,1,2,3,4,9,6,11,13};
		Sorting.quicksort(a);
		assertEquals(true,s.isSorted(a));
		a=new int[]{8,2,1,8,6,5,4,1,2,3,4,9,6,11,13};
		s.insertionSort(a);
		assertEquals(true,s.isSorted(a));
		
		a=new int[]{8,2,1,8,6,5,4,9,2,3,4,9,6,11,7};
		Sorting.quicksort(a);
		assertEquals(true,s.isSorted(a));
	}

}
