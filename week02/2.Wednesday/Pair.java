package tasks;

public class Pair {
	
	private Object obj;
	
	public Pair(Object input){
		this.obj = input;
	}
	public Pair(){
		this.obj = null;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	
	public String pair(Pair element){
		return this.toString() + element.toString();
	}
	
	@Override
	public String toString(){
		return obj.toString(); 
	}
	@Override
	public boolean equals(Object other){
		if((this.getClass() != other.getClass()) || other == null){
			return false;
		}
		if(other == this){
			return true;
		}
		Pair helper = (Pair) other;
		
		return this.obj == helper.obj;
	}
	@Override
	public int hashCode(){
		int hash = 7;
		hash = 31 * hash;
		hash = 31 * hash + (obj == null ? 0 : obj.hashCode());
		return hash;
		
	}
	
	public static void main(String[] args) {
		Pair first = new Pair(2.4);
		Pair second = new Pair(2.5);
		
		System.out.println(second.pair(first));
		
		
		System.out.println(first.equals(second));
	}
}
