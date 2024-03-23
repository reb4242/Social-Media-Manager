/**
 * This class uses arraylists to manage user profiles, posts, and comments.
 * A varity of methods are used to manage the uses of user profiles, posts, and comments. 
 *
 * @author (Rebecca)
 * @version (Oct.17th/23)
 */
//import ArrayList class library to access all functions of an arraylist
import java.util.ArrayList;
public class SocialMediaManager{
    //declare an arraylist to organize user profiles
    static ArrayList<UserProfile> Users = new ArrayList<>();
        //static because this arraylist collects data of all users
    
    //methods to manage the social media
        //creating user profiles - updating the arraylist of that stores all user profiles
        public static void createUserProfile(UserProfile UP){
            //parameter: UP = user's profile
            
            //add an element to the array that stores all user profiles
            Users.add(UP);
        }
        
        //making posts - creating a post object and stores it in corresponding arraylists to manage
        public static void createPost(UserProfile UP, Content C){
            //parameters: UP = the user that's making a new post; C = content of the post
            
            //call method from Posts class
            Posts.CountPosts();
                //to update number of posts ever, meaning another post is being created
            
            //add an element to the array of posts for the specific user 
            UP.UsersPosts.add(new Posts(Posts.lngNumPost, C));
                //using computer generated post ID from Posts class and parameter content
        }
        
        //adding comments - creating a comment object and stores it in corresponding arraylists to manage
        public static void addComment(UserProfile UP, Posts P, String C){
            //parameters: UP = commenter; P = the post in which the comment is added to; C = string of the comment
            
            //call method from Posts class
            Comments.CountComments();
                //to update number of comments ever, meaning another comment is being created
            
            //add an element to the array of comments for the post provided by the parameter
            P.PostsComments.add(new Comments(UP, C));
        }
        
        //listing posts by a user - output all posts by a given user object
        public static ArrayList<Posts> listPostsByUser(UserProfile UP){
            //parameter: the userprofile to access all their posts
            
            //return the arraylist back to where it was called
            return UP.UsersPosts;
        }
        
        //listing comments on a post - output all comments on all posts of a user
        public static void ViewComments(UserProfile UP){
            //parameter: UP = the userprofile to access all their posts, then all their comments
            
            //use a for each loop to output every element
            for (int i = 0; i < UP.UsersPosts.size(); i++){
                    //loop until the last post of the user
                for(int j = 0; i < UP.UsersPosts.get(i).PostsComments.size(); i++){
                        //loop until the last comment of post number i
                    
                    //output every element/comment of post i
                    System.out.println(UP.UsersPosts.get(i).PostsComments.get(j));
                        //i = the index of the post in the array of posts
                        //j = the index of the comment in the array of comments
                }
            }
        }
}
