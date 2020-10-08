package MyDataStructures;

public class SortedLinkedList<K extends Comparable> {

	public INode<K> head;
	public INode<K> tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addInSortedOrder(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;

		if (this.head == null)
			this.head = myNode;

		else {
			if (((Comparable) myNode.getKey()).compareTo(head.getKey()) < 0) {
				INode tempNode = this.head;
				this.head = myNode;
				this.head.setNext(tempNode);
			}

			else if (((Comparable) myNode.getKey()).compareTo(tail.getKey()) > 0) {
				tail.setNext(myNode);
				tail = myNode;
			}

			else {
				INode iteratorNode = head;
				while (!(((Comparable) iteratorNode.getKey()).compareTo(myNode.getKey()) < 0
						&& ((Comparable) iteratorNode.getNext().getKey()).compareTo(myNode.getKey()) >= 0)) {
					iteratorNode = iteratorNode.getNext();
				}

				INode tempNode = iteratorNode.getNext();
				iteratorNode.setNext(myNode);
				myNode.setNext(tempNode);

			}
		}

	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		if (tempNode == tail)
			myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
