public class OrdArray {
	private int nElems;
	private long[] a;
	
	public OrdArray(int max)
	{
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value)
	{
		int j;
		for(j = 0; j<nElems;++j)
		{
			if(a[j]>value)
				break;
		}
		
		for(int k = nElems; k > j; k--)
		{
			a[k] = a[k-1];
		}
		a[j] = value;
		nElems++;
	}
	
	public int find(long searchKey)
	{
		int lowBound = 0;
		int upBound = nElems - 1;
		int curIndex;
		
		while(true) {
			curIndex = (lowBound + upBound) / 2;
			if(a[curIndex] == searchKey)
				return curIndex;
			else if(lowBound > upBound)
				return nElems;
			else
			{
				if(a[curIndex] < searchKey)
					lowBound = curIndex + 1;
				else
					upBound = curIndex - 1;
			}
		}
	}
	
	public boolean delete(long value)
	{
		int i = find(value);
		if(nElems == i)
			return false;
		else
		{
			for(int k = i;k < nElems; k++)
			{
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
	}
	
	public void display() 
	{
		int i = 0;
		while(i < nElems)
		{
			System.out.print(a[i] + " ");
			i++;
		}
	}

	public static void main(String[] args)
	{
		int maxSize = 100;
		OrdArray arr;
		arr = new OrdArray(maxSize);
		
		arr.insert(10);
		arr.insert(9);
		arr.insert(19);
		arr.insert(20);
		arr.insert(5);
		
		arr.display();
		System.out.print("\n");
		if(0 != arr.find(10))
			System.out.print("find the value:" + arr.find(10));
		System.out.print("\n");
		arr.delete(19);
		arr.display();
	}

}
