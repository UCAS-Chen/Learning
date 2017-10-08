package bubbleSort;

public class ArrayBub {
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max)
	{
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) 
	{
		a[nElems] = value;
		nElems++;
	}
	
	public void display() 
	{
		for(int i = 0; i < nElems; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public void bubbleSort()
	{
		for(int out = nElems - 1; out > 0; out--)
		{
			for(int in = 0; in < out; in++) 
			{
				if(a[in] > a[in + 1])
					swap(in, in + 1);
			}
		}
	}
	
	public void swap(int one, int two) 
	{
		long temp;
		temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	public boolean find(long keyValue) 
	{
		int i;
		for(i = 0; i < nElems; i++)
		{
			if(keyValue == a[i])
				break;
		}
		if(i == nElems)
			return false;
		else
			return true;
	}
	
	public void delete(long value)
	{
		int i;
		for(i = 0; i< nElems; i++)
		{
			if(value == a[i])
				break;
		}
		if(i == nElems)
			return;
		else
		{
			for(int k = i; k < nElems; k++)
			{
				a[k] = a[k+1];
			}
			nElems--;
		}
		
	}

}
