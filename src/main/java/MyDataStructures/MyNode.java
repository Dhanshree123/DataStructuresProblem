package MyDataStructures;

public class MyNode<K> implements INode<K> {

	private K key;
	private INode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	public INode getNext() {
		return next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K Key) {
		this.key = key;

	}

}
