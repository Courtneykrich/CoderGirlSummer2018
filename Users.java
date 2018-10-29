package MicroBlog;

import java.util.*;

public class Users {
    private String avatarUrl;
    private String userName;
    private String realName;
    private String email;
    private int idNumber;
    private static int nextIdNumber = 1;
//    Posts allPosts[] = new Posts[100]; (as an array)
    private ArrayList <Posts> allPost = new ArrayList<Posts>();


    public Users (String realName,String userName,String email, String avatarUrl){
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.realName = realName;
        this.email = email;
        this.idNumber = nextIdNumber;
        nextIdNumber++;
    }
    public String toString(){
        return this.idNumber+" "+ this.userName;
    }

    public void addPost(Posts currentPost){
        allPost.add(currentPost);


//        Posts post = new Posts(this,"This is the content for my first post.");
//        allPost.add(post);
//        Posts default1 = new Posts(this,"Thanks the the help!");
//        allPost.add(default1);
//        Posts default2 = new Posts(this,"Way to got in that last game, guys!");
//        allPost.add(default2);
//        Posts default3 = new Posts(this,"Ready to play again?");
//        allPost.add(default3);

    }
    public ArrayList<Posts> getAllPost(){
        return allPost;

    }

//
//    }

    // void addPost inputs (Post p)

    public void setUrl(String url){

        this.avatarUrl = url;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setRealName(String realName){
        this.realName = realName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getUrl(){

        return avatarUrl;
    }
    public String getUserName(){
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void displayLastPost(){
        if (!allPost.isEmpty())
        System.out.println(allPost.get(allPost.size()-1));

    }

    public static void  main(String[]args){



    }



}