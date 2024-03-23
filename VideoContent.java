/**
 * This class is inherited from the Content class. 
 * Contains all information for the content of type video.
 *
 * @author (Rebecca)
 * @version (Oct.17th/23)
 */
//keyword extends shows that this class is a subclass of Content
public class VideoContent extends Content{
    //declare variables for type videos content only
        //create a variable to store the video
        private String strVideo;
        
    //constructors
    public VideoContent(long ID, String M, String V){
        //parameters: ID = content ID; M = message associated with the video; V = video url
        
        //call the superclass constructor and send in values
        super(ID, M);
        //initialize variables for text content variables
        this.strVideo = V;
    }
}
