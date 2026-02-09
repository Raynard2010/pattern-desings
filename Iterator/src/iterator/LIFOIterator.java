package iterator;

public class LIFOIterator<T> implements Iterator<T> {
	private T[] list;
	private Integer currIndex;
	
	public LIFOIterator(T[] list, int size) {
		super();
		this.list = list;
		currIndex = size - 1;
	}
	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			return list[currIndex--];
		}
		return null;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currIndex >= 0;
	}
}
