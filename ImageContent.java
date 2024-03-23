/**
 * This class is inherited from the Content class. 
 * Contains all information for the content of type images.
 *
 * @author (Rebecca)
 * @version (Oct.17th/23)
 */
//keyword extends shows that this class is a subclass of Content
public class ImageContent extends Content{
    //declare variables for type images content only
        //create a variable to store the image type
        private String strImage;
        
    //constructors
    public ImageContent(long ID, String M, String I){
        //parameters: ID = contend ID; M = message associated with the image; I = image type
        
        //call the superclass constructor and send in values
        super(ID, M);
        //initialize variables for text content variables
        this.strImage = I;
    }
}
