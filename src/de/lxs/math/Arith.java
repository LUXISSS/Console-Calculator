package de.lxs.math;

public class Arith {
	
	public static float SigmaSummation(int startVal, int endVal)
	{
		float result = 0;
		
		for(int i = startVal; i <= endVal; i++)
		{
			result += i;
		}
		
		return result;
	}
	
    public static int Factorial(int value)
    {
        int result = 1;

        for (int i = 0; i < value; i++)
        {
            result *= value - i;
        }

        return result;
    }
    
    public static float IntPower(float base, int exponent)
    {
    	float result = base;
    	
    	if(exponent > 0)
    	{
    		for(int i = 1; i < exponent; i++)
        	{
        		result *= base;
        	}
    		
    		return result;
    	}
    	
    	if(exponent < 0)
    	{
    		for(int i = -1; i > exponent; i--)
        	{
        		result *= base;
        	}
    		
    		return 1 / result;
    	}
    	
    	if(exponent == 0)
    		return 1;
    	
    	
    	return -1;
    }

}
