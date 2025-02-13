class oload 
{
	private int kazu;
	private char moji;

	public void setValue(int value)
	{
		kazu = value;
	}

	public int getValue_i()
	{
		return kazu;
	}
		
	public void setValue(char value)
	{
		moji = value;
	}

	public char getValue_c()
	{
		return moji;
	}
}

public class overload 
{
	public static void main(String[] args)
	{
		oload a=new oload();	

		a.setValue(3);
		System.out.println( a.getValue_i() );

		a.setValue('a');
		System.out.println( a.getValue_c() );
	}
}
