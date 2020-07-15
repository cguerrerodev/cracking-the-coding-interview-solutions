package interviewquestions.chapter3.question2;

public class StackMin {
	
	private int array[] = new int[20], index = -1, minIndex;
	
	public void push(int item){
		
		index++;
		array[index] = item;
		
		if(index > 0 && array[index - 1] > item){
			
			minIndex = item;
			
		}
	}
	
	public int pop(){
		
		if(minIndex == index){
			for (int i = 0; i < index - 1; i++ ){
				if (array[i] > array [i+1]){
					minIndex = i;
				}else{
					minIndex = i + 1;
				}
			}
		}
		
		return array[index--];
	}
	
	public int getMin(){
		return array[minIndex];
	}

}
