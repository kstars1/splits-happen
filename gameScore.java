/*

 */
package splitshappen;

/**
 *
 * @author Keenan
 */
public class gameScore {
    
    public static int calc(String line)
    {
        int score = 0, i;
        for(i=0; i<line.length(); i++)
        {
            //calculate a Strike
            if(line.charAt(i) == 'X')
            {
                //check for end cases to prevent overscoring
                if(i >= line.length()-2)
                {
                    continue;
                }
                
                else if(i == line.length()-3 && line.charAt(i+1) != 'X')
                {
                    score += 10;
                }
                
                //otherwise calculate normally
                else if(i < line.length()-2)
                {
                    score += strikeFrame(line, i);
                }
            }
            //Calculate a spare
            else if(line.charAt(i) == '/')
            {  
                if(i >= line.length()-2)
                {
                    score += 10-Character.getNumericValue(line.charAt(i-1));
                }
                else
                {
                    score += 10-Character.getNumericValue(line.charAt(i-1));
                    if(line.charAt(i+1) == 'X')
                        score +=10;
                    if(line.charAt(i+1)== '-')
                        score += 0;
                    else
                        score += Character.getNumericValue(line.charAt(i+1));
                }
                
            }
            //dont add for a miss
            else if(line.charAt(i) == '-')
                continue;
            //add roll value
            else
                score += Character.getNumericValue(line.charAt(i));
        }
        //System.out.println(i);
        return score;
    }
    
    public static int strikeFrame(String line, int frame)
    {
        //get the score for a strike
        char r1=line.charAt(frame), r2=line.charAt(frame+1), r3=line.charAt(frame+2);
        int score=0;
        //get roll 1 value
        if(r1 == 'X')
            score += 10;
        else if(r1 == '-')
            score +=0;
        else
            score += Character.getNumericValue(r1);
        // get roll 2 value
        if(r2 == 'X')
            score += 10;
        else if(r2 == '-')
            score +=0;
        else
            score += Character.getNumericValue(r2);

        //get roll 3 value, only roll possible to be a spare
        if(r3 == 'X')
            score += 10;
        else if(r3 == '-')
            score +=0;
        else if(r3 == '/')
            score += 10-Character.getNumericValue(r2);
        else
            score += Character.getNumericValue(r3);
        
        return score;
    }
    
    
    
}
