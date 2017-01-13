import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader; //waz knowing how 2 use

class inventory{
	
	public static void main(String [] args){
		System.out.println("Penya pens!");
		
		
		item a = new item("Titus", "Ball point", 7.00f);
		item b = new item("G-Tec", "Rollerball", 20.00f);
		item c = new item("Parker", "Affluent", 2500.00f);
		
		List<item> bolpen = new ArrayList();
		bolpen.add(a);
		bolpen.add(b);
		bolpen.add(c);
		
		
		//System.out.println( a.GetName() );
		
		System.out.println( "print using c style for loop" );	
		for(int i=0; i<bolpen.size(); i++){
			a=bolpen.get(i);
			printpen(a);
		}


		System.out.println( "print using java oop iterator" );
		for(item i : bolpen){
			printpen(i);
		}
		
		
		
		
		
	}
	
	public static void printpen(item a){
		System.out.println( a.GetName() );
		System.out.println( a.GetCat() );
		System.out.println( a.GetPrice() );
		System.out.println() ;
	}

}
