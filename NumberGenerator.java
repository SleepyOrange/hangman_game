/*****************************************************************
 *
 *	Number Generator
 *
 *	Date: 01 Oct 2013
 *  @author SleepyOrange
 *
 *	Maths.Random() retunrns a positive number between 0 and 1
 *  to get a number in a range that you want e.g. 1 to 6 for a dice
 *  you multiply the value produced by the random method by your upper bound e.g. 6
 *  and add on the value of your lower bound e.g. 1 inthis case
 *
 *****************************************************************/

class NumberGenerator
{
	// DATA
	//............................................................


	// CONSTRUCTORS
	//............................................................
	public NumberGenerator()
	{

	}

	// METHODS
	//............................................................
	public int getNumber()
	{
        return( 1 + (int) (Math.random() * 10) );
	}

}