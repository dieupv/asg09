class Pair<T>
{
	private T first;
	private T second;
	
	public Pair() { first = null; second = null; }
	
	public Pair(T first, T second)
	{ this.first = first; this.second = second; }
	
	public T getFirst() { return first; }
	
	public T getSecond() { return second; }
	
	public void setFirst(T newValue) { first = newValue; }
	
	public void setSecond(T newValue) { second = newValue; }
	
	public String toString(){
		return "("+ first + ", " + second +")";
		}
}

public class TestPair{
	public static void main(String avg[]){
		Pair<String> mm = new Pair<String> ("1st", "2nd");
		System.out.println(mm.toString());
		
		Pair<Integer> in = new Pair<Integer> (1, 2);
		System.out.println(in.toString());
		
		}
	}