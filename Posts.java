package MicroBlog;

public class Posts {
    private Users author;
    private int orderPosted;
    private static int nextPosted = 1;
    private String content;
    private String url;


//wanted to set a default for url in case one is not entered (early masterclass constructor pt 2)


    public Posts(Users author, String content) {
        this.author = author;
        this.content = content;
        this.url = url;
        this.orderPosted = nextPosted + 1;
        nextPosted++;

    }

    public int getOrderPosted() {

        return orderPosted;
    }

    public String toString() {
        return this.author + " " + this.content;
    }
    public static void main(String[]args){
//        Posts one = new Posts(Users me, "This is a very difficult exercise!);


    }
}



