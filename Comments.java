/**
 * This is a class that represent comments on posts. 
 * Stores information of a single user's comment.
 *
 * @author (Rebecca)
 * @version (Oct.16th/23)
 */
//import Date class from Java library to create real time generated dates
import java.util.Date;
public class Comments{
    //declare variables for a comment
        //create a variable for the comment's ID
        private long lngCommentID;
            //using long because FaceBook has roughly 3.2 billion comments per day
        //create a variable to store the user name of the commenter
        private String strCommenter;
        //create a variable to store the text of the comment
        private String t1;
        //create a variable to store the time in which the comment is publisized
        private Date d1;
    
        //create a variable to store the number of posts created ever
            //the variable will be static as it is counting throughout all comment objects
        static long lngNumComment = 0;
    
    //counter for post ID
    public static void CountComments(){
        //increase the value of lngNumPost by one every time this method is called
        lngNumComment += 1;
    }
        
    //constructors
    public Comments(UserProfile UP, String T){
        //parameters: UP = user making the comment; T = the text of the comment
        
        //initialize the instance variables
        this.lngCommentID = lngNumComment;
        this.strCommenter = UP.getUserName();
            //call getter of username of the commenter
        this.t1 = T;
        this.d1 = new Date();
            //date is not passed through the parameter because it is autogenerated by the program
    }
    
    //toString method to format the output
    public String toString(){
        //return the formated string back to where it was called
        return this.t1;
    }
}
