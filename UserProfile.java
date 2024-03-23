/**
 * This class represent users on the platform. 
 * Stores all information of a user.
 *
 * @author (Rebecca)
 * @version (Oct.16th/23)
 */
//import ArrayList class library to access all functions of an arraylist
import java.util.ArrayList;
//import Date class from Java library to create real time generated dates
import java.util.Date;
public class UserProfile{
    //declare variables for a user
        //create a variable for user's number in the social media, represent the xth user of the platform
        private int intUserID;
            //using int because FaceBook has roughly 3 billion users
        //create a variable to store the user's username
        private String strUserName;
        //create a variable to store the user's email
        private String strEmail;
        //create a variable to store the the current date when the user's account is created
        private Date datDateJoined;
        //declare an arraylist to store all posts created by the user
        ArrayList<Posts> UsersPosts;
    
    //constructors
    public UserProfile(int ID, String N, String E){
        //parameters: ID = user's ID number; N = user name; E = user's email
        
        //initialize instance variables
        this.intUserID = ID;
        this.strUserName = N;
        this.strEmail = E;
        this.datDateJoined = new Date();
            //date is not passed through the parameter because it is autogenerated by the program
        //create the an arraylist for all users
        this.UsersPosts = new ArrayList<Posts>();
    }
    
    //getters for all private variables necessary
    public int getUserID(){
        return this.intUserID;
    }
    public String getUserName(){
        return this.strUserName;
    }
    public String getEmail(){
        return this.strEmail;
    }
    public Date getDateJoined(){
        return this.datDateJoined;
    }
    
    //setters for all private variables necessarily
    public void setUserName(String N){
        this.strUserName = N;
    }
    public void setEmail(String E){
        this.strEmail = E;
    }
}
