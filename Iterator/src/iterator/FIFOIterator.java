package iterator;

import java.util.ArrayList;

public class FIFOIterator<T> implements Iterator<T> {

	private ArrayList<T> list;
	private Integer currIndex;
	
	public FIFOIterator(ArrayList<T> list) {
		super();
		this.list = list;
		currIndex = 0;
	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			return list.get(currIndex++);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currIndex < list.size();
	}
	
}
