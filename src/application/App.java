package application;

public class App {

	public static void main(String[] args) {
		
		//various ways of incrementing
		int count = 0;
		
		count = count + 1;
		
		System.out.println(count);

		count += 1;
		
		System.out.println(count);
		
		//only increases by 1
		//this is the postfix version
		count++;
		
		System.out.println(count);
		
		//this is the prefix version
		//only increases by 1
		++count;
		
		System.out.println(count);
		
		count = count -1;
		
		System.out.println(count);
		
		count -= 1;
		
		System.out.println(count);
		
		//postfix method
		count--;
		
		System.out.println(count);
		
		//prefix method
		--count;
		
		System.out.println(count);
	}

}
