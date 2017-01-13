
class item{
	String Name;
	String Cat;
	float Price;
	
	public void SetName(String n){
		Name = n;
	}
	
	public void SetCat(String c){
		Cat = c;
	}
	
	public void SetPrice(float p){
		Price = p;
	}
	//penya gwapo
	public String GetName(){
		return Name;
	}
	
	public String GetCat(){
		return Cat;
	}
	
	public float GetPrice(){
		return Price;
	}
	
	public item(String n, String c, float p){
		Name = n;
		Cat = c;
		Price = p;
	}
}
