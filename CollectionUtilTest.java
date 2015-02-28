import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

interface ListMapper<E, K> {
	K mapMethod(E element);
}

class IntegerMapper implements ListMapper<Integer,Integer> {
	public Integer mapMethod (Integer element){
		return (element + 1);
	}
}

public class CollectionUtilTest {
	@Test
	public void map_returns_an_integer_List_after_adding_1_to_each_element(){
		ListMapper listMapper = new IntegerMapper();
		List<Integer> numbers = new ArrayList<Integer>();
		int[] expected = {2,3,4};
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		List<Integer> mappedList = CollectionUtil.<Integer,Integer>map(numbers, listMapper);
		assertEquals((int)(mappedList.get(0)),expected[0]);
		assertEquals((int)(mappedList.get(1)),expected[1]);
		assertEquals((int)(mappedList.get(2)),expected[2]);
		assertEquals(mappedList.size(),numbers.size());
	}
}