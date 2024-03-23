/**
 * This is the test class of the Social Media Assignement.
 *
 * @author (Rebecca)
 * @version (Oct.16th/23)
 */
//import ArrayList class library to access all functions of an arraylist
import java.util.ArrayList;
//import Date class from Java library to create real time generated dates
import java.util.Date;
public class LiSocialMediaTestClass{
    public static void main(String[] args){
        SocialMediaManager socialMediaManager = new SocialMediaManager();

        UserProfile user1 = new UserProfile(1, "Jack Skellington", "JackS@example.com");
        UserProfile user2 = new UserProfile(2, "Sally", "Sally@example.com");
        UserProfile user3 = new UserProfile(3, "Oogie Boogie", "OogieB@example.com");

        Content textContent = new TextContent(1, "The Nightmare before Christmas is the best movie!.");
        Content textContent2 = new TextContent(2, "Best Halloween movie to watch?.");
        Content imageContent = new ImageContent(3, "The Nightmare before Christmas poster", "jpg");
        Content videoContent = new VideoContent(4, "Click to watch The Nightmare before Christmas Movie", "video_url.mp4");
        Content videoContent2 = new VideoContent(5, "Click to watch Saunders Fright Fest videos", "frightfest.mp4");

        socialMediaManager.createUserProfile(user1);
        socialMediaManager.createUserProfile(user2);
        socialMediaManager.createUserProfile(user3);

        socialMediaManager.createPost(user1, textContent);
        socialMediaManager.createPost(user3, textContent2);
        socialMediaManager.createPost(user2, imageContent);
        socialMediaManager.createPost(user1, videoContent);
        socialMediaManager.createPost(user3, videoContent2);
        
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user1).get(0), "Love that Poster!");
        socialMediaManager.addComment(user3, socialMediaManager.listPostsByUser(user1).get(0), "Best Movie to watch. Thanks!");
        socialMediaManager.addComment(user1, socialMediaManager.listPostsByUser(user2).get(0), "Great image! Love that movie");
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user3).get(0), "Friday the 13th is the best one to watch!");
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user3).get(0), "The best halloween movie is definitely \"Halloween\"");

        System.out.println("\nPosts by " + user1.getUserName() + ":");
        //call method from SocialMediaManager to output all posts
        System.out.println(SocialMediaManager.listPostsByUser(user1));
        
        System.out.println("\nComments on " + user1.getUserName() + "'s post:");
        //call method from SocialMediaManager to output all comments under user1's posts
        System.out.println(user1.UsersPosts.get(0).PostsComments);
        
        System.out.println("\nPosts by " + user2.getUserName() + ":");
        //call method from SocialMediaManager to output all posts
        System.out.println(SocialMediaManager.listPostsByUser(user2));
        
        System.out.println("\nComments on " + user2.getUserName() + "'s post:");
        //call method from SocialMediaManager to output all comments under user2's posts
        System.out.println(user2.UsersPosts.get(0).PostsComments);
        
        System.out.println("\nPosts by " + user3.getUserName() + ":");
        //call method from SocialMediaManager to output all posts
        System.out.println(SocialMediaManager.listPostsByUser(user3));
        
        System.out.println("\nComments on " + user3.getUserName() + "'s post:");
        //call method from SocialMediaManager to output all comments under user3's posts
        System.out.println(user3.UsersPosts.get(0).PostsComments);
        
    }
}
