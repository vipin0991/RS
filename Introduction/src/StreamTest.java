import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamTest {

	//@Test
	public void testOne() {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vipin");
		names.add("Vpn");
		names.add("Vinay");
		names.add("Ram");
		names.add("Vibhor");
		int count = 0;
		/*
		for(int i=0;i<names.size();i++) {
			if(names.get(i).startsWith("V")) {
				count++;
			}
		}
		System.out.println(count);
		*/
		//Long c = names.stream().filter(s->s.startsWith("V")).count();
		//System.out.println(c);
		//can directly put data into stream instead of creating collection first and then conversion to stream
		long d = Stream.of("Vipin","VPN","Vinay","Ram","Vinay").filter(s->
		{
			s.startsWith("V");
			return true;
		}).count();
		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	//@Test
	//print names in upper case which ends with a
	public void testTwo() {
		Stream.of("Rama", "Don", "Alekhya", "Adam", "Abhijeet").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	//@Test
	//print names in upper case in sorted order which start with A
	public void testThree() {
		List<String>names=Arrays.asList("Rama", "Don", "Alekhya", "Adam", "Abhijeet");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	//@Test
	//Concatenate two strings
	public void testFour() {
		List<String> li1 = Arrays.asList("Rama", "Don", "Alekhya", "Adam", "Abhijeet");
		List<String> li2 = Arrays.asList("Vinay","Sameer","Ajay","Mohit");
		Stream<String> newStream = Stream.concat(li1.stream(), li2.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag =  newStream.anyMatch(s->s.equalsIgnoreCase("Adam2"));
		Assert.assertTrue(flag);
	}
	
	//@Test
	//take list, convert to stream, manipulate, convert to list again
	public void testFive() {
		List<String> liNew = Stream.of("Vipin","VPN","Vinay","Ram","Vikasy").filter(s->s.endsWith("y")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(liNew.get(0));
	}
	
	@Test
	public void testSix() {
		List<Integer> li = Arrays.asList(3,2,2,7,5,1,9,7);
		//li.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> lm = li.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(lm.get(2));
	}
	
	
	
	
	
	
	
}
