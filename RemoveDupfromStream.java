import java.util.stream.*;
import java.util.*;

public class RemoveDupfromStream
{
	public static void main(String args[])
	{
	Stream<Integer> str=Stream.of(2,2,1);
	Set<Integer> items = new HashSet<>(); 
    Stream<Integer> stream1= str.filter(n-> !items.add(n)).collect(Collectors.toSet());
	System.out.println(stream1);
	}
}