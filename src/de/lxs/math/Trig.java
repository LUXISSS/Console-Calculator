package de.lxs.math;

public class Trig {

	public static float sqrt(float x)
	{
        float interations = 10000;
        float guess = 2.6F;

        for (int i = 0; i < interations; i++)
        {
            guess = (guess + (x / guess)) / 2;
        }

        return guess;
	}

	
	public static float sin(float degree)
	{
		float radiant = degree / 180 * (1146408F / 364913F);
        float sum = 0;
        float sign = 1;

        for (int i = 1; i < 70; i += 2)
        {
            float x = 1;
            for (int j = 0; j < i; j++)
            {
                x *= radiant;
            }

            float f = 1;
            for (int j = 2; j <= i; j++)
            {
                f *= j;
            }

            float t = sign * x / f;

            sign = -sign;

            sum += t;
        }

        return sum;
	}
}
