class gen<T>
{
	private T value;
	public void setValue(T value)
	{
		this.value =value;
	}
	public T getValue()
	{
		return value;
	}
		
}

public class generics 
{
	public static void main(String[] args)
	{

		gen<Integer> a = new gen<>();	
		a.setValue(3);
		System.out.println( a.getValue() );

		gen<String> b = new gen<>();	
		b.setValue("c");
		System.out.println( b.getValue() );

	}
}
