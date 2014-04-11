/*****************************************************************
 *
 *  Letter Generator
 *
 *  Date: 01 Oct 2013
 *  @author SleepyOrange
 *
 *  Maths.Random() retunrns a positive number between 0 and 1
 *  to get a number in a range that you want e.g. 1 to 6 for a dice
 *  you multiply the value produced by the random method by your upper bound e.g. 6
 *  and add on the value of your lower bound e.g. 1 inthis case
 *  BUT as we have an array that starts at 0 we don't add 1
 *
 *****************************************************************/

class LetterGenerator
{
    // DATA
    //............................................................

    private char [] allowedLetters = {'A','E','I','O','U'};


    // CONSTRUCTORS
    //............................................................
    public LetterGenerator()
    {
        //no init to do in this constructor
    }

    // METHODS
    //............................................................
    public char getLetter()
    {
        return( this.allowedLetters[ (int) (Math.random() * 5) ] );
    }


    public boolean checkLetter( char letterToCheck )
	{
        
		int matchCount = 0;

        for (int i = 0; i < allowedLetters.length; i=i+1)
		{
			if ( letterToCheck == allowedLetters[i] )
			{
				//should equal at least one
				   matchCount = matchCount + 1;
	
			}
		}

		if ( matchCount == 0 )
		{ 
			//not in allowed letter set
			return false;
		}
		else
		{ 
			//in allowed letter set
			return true;
		}
	}


	public char[] testLetters( int numberToGenerate )
	{
		//these variables are local to this method

		char [] arrayOfLetters = new char[numberToGenerate];

		for (int i = 0; i < numberToGenerate; i=i+1)
		{
			arrayOfLetters[i] = this.allowedLetters[ (int) (Math.random() * 5) ];
		}

		return arrayOfLetters;
	}


}

