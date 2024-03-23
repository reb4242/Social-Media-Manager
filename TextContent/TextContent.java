/**
 * This class is inherited from the Content class. 
 * Contains all information for the content of type text.
 *
 * @author (Rebecca)
 * @version (Oct.17th/23)
 */
//keyword extends shows that this class is a subclass of Content
public class TextContent extends Content{
    //declare variables for type text content only
        //create a variable for the text's length
        private int intTextLength;
            //using int because Facebook has a post limit of 63,206 characters 
    
    //constructors
    public TextContent(long ID, String M){
        //parameters: ID = content ID; M = message text itself
        
        //call the superclass constructor and send in values
        super(ID, M);
        //initialize variables for text content variables
        this.intTextLength = M.length();
    }
}
