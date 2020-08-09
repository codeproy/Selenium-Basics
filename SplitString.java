
public class SplitString {
	public static void main(String[] args) {
		
		/*
		String a = "10000.0";
		
		String b = "200.0";
		
		String[] n_a = a.split("\\.");
		System.out.println(n_a[0]);
		n_a = b.split("\\.");
		System.out.println(n_a[0]);
		
		*/
		String s = " ";
		if (s.isEmpty()) { System.out.println("Yes");}
		//s = s.replaceAll("[ ?.,!_@']+"," ");
		//System.out.println(s);	
		String[] arr_of_str = s.trim().split("[ ?.,!_@']+");
        
        System.out.println(arr_of_str.length);

        for (String a: arr_of_str){
            System.out.println(a);
        }
		
	}

}
