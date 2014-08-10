
public class MyList implements Item{
	private Node start;
	private Node end;
	private int size;

    public MyList(){
    	this.start = null;
    	this.end = null;
    }
    public Node getStart(){
    	return start;
    }
    public Node getEnd(){
    	return end;
    }
	public int length(){
		return size;
	}
    public  void append(Item data){
    	Node temp = new Node( data, null);
    	if(start == null) start = end = temp;
    	else{
    		end.next = temp;
    		end = temp;
    	}
		size++;
    }
	
    public Item clone(){
    	MyList l = new MyList();
    	Node cur = getStart();
    	while(cur != null){
    		l.append(cur.data);
    		cur = cur.next;
    	}
    	return l;
    }
    public void appendList(MyList list ){
    	/*MyList l = (MyList) list.clone();
    	if(start == null)
    	{
    		start = l.getStart();
    		end = l.getEnd();
    	}
    	else
    	{
			Node cur = getStart();
			while(cur != null)
			{
				this.append(cur.data);
				cur = cur.next;
				}

    	}*/
		Node cur = list.start;
		while (cur != null) {
			append(cur.data);
			cur = cur.next;
		}
    }
	public String toString(){
		String result = "(";
		Node cur = this.start;
		boolean first = true;
		while (cur != null) {
			if (first) {
				result += cur.data.toString();
				first = false;
			} else
				result += ", " + cur.data.toString();
			cur = cur.next;
		}
		result += ")";
		return result;
	}
}