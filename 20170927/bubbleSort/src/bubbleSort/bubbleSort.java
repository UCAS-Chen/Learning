package bubbleSort;

public class bubbleSort {

	public static void main(String[] args) 
	{
		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);
		
		arr.insert(10);
		arr.insert(11);
		arr.insert(9);
		arr.insert(2);
		arr.insert(14);
		arr.insert(13);
		arr.display();
		
		System.out.println(" ");
		
		arr.bubbleSort();
		arr.display();
		
		System.out.println(" ");
		
		arr.delete(10);
		arr.delete(2);
		arr.display();
		
		System.out.println(" ");
		
		if(arr.find(2))
		{
			System.out.print("Find this value!");
		}
		else
		{
			System.out.print("Can't find this value!");
		}
	}
}
