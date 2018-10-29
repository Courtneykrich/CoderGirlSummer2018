package MicroBlog;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Users currentUser;
//    Scanner keyboard = new Scanner(System.in);
    ArrayList<Users> allUsers;
   // ArrayList<Posts> allPost;

    public Menu(Users currentUser) {
        this.currentUser = currentUser;
        this.allUsers = new ArrayList<Users>();
    }

//        public void promptForNewUser() {
//            Scanner keyboard = new Scanner(System.in);
//            out.println("Enter full name");
//            String fullName = keyboard.next();
//            out.println("Enter desired username");
//            keyboard.nextLine();
//            String userName = keyboard.next();
//            out.println("Enter email address");
//            String email = keyboard.next();
//            out.println("Enter url");
//            String url = keyboard.next();
//
//            actuallyCreateUser(fullName, userName, email, url);
//        }
//
//        public void actuallyCreateUser(String fullName, String userName, String email, String url) {
//            Users newUser = new Users(fullName, userName, email, url);
//            allUsers.add(newUser);
//        }

        public void createNewUser () {

            Scanner keyboard = new Scanner(System.in);
            out.println("Enter full name");
            String fullName = keyboard.next();
            out.println("Enter desired username");
            keyboard.nextLine();
            String userName = keyboard.next();
            out.println("Enter email address");
            String email = keyboard.next();
            out.println("Enter url");
            String url = keyboard.next();

            Users newUser = new Users(fullName, userName, email, url);
            allUsers.add(newUser);
        }

        //public ArrayList<Posts> getPosts;


        public static void printMenu () {
            out.println();
            out.println("    MAIN MENU");
            out.println();
            out.println(" 1. CREATE USER");
            out.println(" 2. BECOME EXISTING USER");
            out.println(" 3. WRITE A POST");
            out.println(" 4. PRINT ALL POSTS");
            out.println(" 5. PRINT ALL USERS");
            out.println(" 9. EXIT");


        }
        public void processChoice ( int choice){

            if (choice == 5) {
                printUserList();
            } else if (choice == 1) {
                createNewUser();
            } else if (choice == 3) {
                createPost();
            } else if (choice == 4) {
                printPosts();
            } else if (choice == 2) {
                setCurrentUser();
            } else if (choice == 6 || choice == 7 || choice == 8) {
                System.out.println("Invalid choice, please make another selection.");
            }

        }


        public void createPost () {
            // find most recent (highest orderPosted number) post by currentUser
            // print users that post
            //ask user to write next post
            //pass that post to add.post method (below)




            //Users newUser = new Users(fullName, userName, email, url);
            //        allUsers.add(newUser);



            currentUser.displayLastPost();
            System.out.println("What would you like to post?");
            Scanner keyboard = new Scanner(System.in);
            String c = keyboard.nextLine();
            Posts currentPost = new Posts(currentUser, c);
            currentUser.addPost(currentPost);
        }





//            for (int i = 0; i <currentUser.getAllPost().size(); i++){
//            int counter = currentUser.getAllPost().size();
//            System.out.println(currentUser.getAllPost().get(currentUser.getAllPost().size()-1));
////
//        }


        public void setCurrentUser () {
            System.out.println(allUsers);
            System.out.println("Choose your ID number");
            Scanner keyboard = new Scanner(System.in);
            int choice = keyboard.nextInt();
            for (int i = 0; i < allUsers.size(); i++) {
                int j = allUsers.get(i).getIdNumber();
                if (j == choice) {
                    currentUser = allUsers.get(i);
                }
                //System.out.println("Currrent User is now " + allUsers.get((choice - 2)) + ".");
            }
        }

        public void printUserList () {

            for (int counter = 0; counter < allUsers.size(); counter++) {
                System.out.println(allUsers.get(counter));
            }
        }

        public void printPosts () {
            for (int iUsers = 0; iUsers < allUsers.size(); iUsers++) {
                Users loopUser = allUsers.get(iUsers);
                for (int iPosts = 0; iPosts < loopUser.getAllPost().size(); iPosts++){
                    System.out.println(loopUser.getAllPost().get(iPosts));
                }



            }
        }


        public static void main (String[]args){



            Scanner keyboard = new Scanner(System.in);
            Users preMenu = new Users("default", "default", "default@email.com", "default.url");
            Menu now = new Menu(preMenu);
            int answer;

            //create some sample data


            do {
                printMenu();
                answer = keyboard.nextInt();
                now.processChoice(answer);
            } while (answer < 9);

            System.out.println("You have exited the menu.");
        }

    }












