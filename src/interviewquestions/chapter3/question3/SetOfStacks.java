package interviewquestions.chapter3.question3;

import java.util.EmptyStackException;

public class SetOfStacks {

	private Node node; 
	private int thresHold = 4;
	
	public void push(int plate){
		if (node == null){
			node = new Node(plate);
		}else{
			node.push(plate);
		}
	}
	
	public int pop(){
		if (node == null){
			throw new EmptyStackException();
		}
		int result = node.value;
		node = node.next;
		return result;
	}
	
	public int popOf(int index){
		
		Node result = node;
		
		for (int i = 0; i < index * thresHold; i++){

			if (result == null){
				throw new EmptyStackException();
			}

			result = result.next;
		}

		if (result == null){
			throw new EmptyStackException();
		}
		
		Node auxNode = result;
		result = auxNode.next;		
		auxNode.next = result.next;
		
		return result.value;
	}
	
	private class Node{
		Node next;
		int value;
		
		Node(int value){
			this.value = value;
		}
		
		void push(int value){
			next = new Node(this.value);
			this.value = value;
		}
	}
	
}
