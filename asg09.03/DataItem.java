
public class DataItem<T> implements Item{
	private T value;

    public DataItem(T value){
    	this.value = value;
    }
    public Item clone(){
    	return new DataItem<T>(value);
    }
    public String toString(){
    	return value.toString();
    }
}