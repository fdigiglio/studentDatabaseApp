import java.util.Arrays;
import java.util.Scanner;

public class Student{

    private String name;
    private int year;
    private String id;
    private String gradeLevel;
    private String courses;
    private int balance;
    private int tuition;
    private int passLength = 4;
    private static int defaultCourseSize = 20;
    public static String[] history101 = new String[defaultCourseSize];
    public static String[] math101 = new String[defaultCourseSize];
    public static String[] english101 = new String[defaultCourseSize];
    public static String[] chemistry101 = new String[defaultCourseSize];
    public static String[] compsci101 = new String[defaultCourseSize];

    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        this.name = input.nextLine();
        System.out.println("Enter Grad Year: ");
        this.year = input.nextInt();
        input.nextLine();

        System.out.println("Enter Grade Level: ");
        this.gradeLevel = input.nextLine();;

        System.out.println("How much money do you have?");
        this.balance = input.nextInt();
        
        //System.out.println(this.name + "\n" + this.year + "\n" + this.gradeLevel);
    
        this.id = generateID(passLength);
        System.out.println("Your ID: " + this.gradeLevel  + this.id);
        


    
    
    }

    public Student(String nameInput, int yearInput, String gradeLevelInput){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        this.name = nameInput = input.nextLine();
        System.out.println("Enter Graduation Year: ");
        this.year = yearInput = input.nextInt();
        input.nextLine();
        System.out.println("Enter Grade Level: ");
        this.gradeLevel = gradeLevelInput = input.nextLine();
        
        System.out.println(nameInput + "\n" + yearInput + "\n" + gradeLevelInput);
        this.id = generateID(passLength);
        System.out.println(generateID(passLength));

      
    
    }

    //Generate ID

    private String generateID(int length){
        String keys = "0123456789";
        char[] id = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int)(Math.random() * keys.length());
            id[i] = keys.charAt(rand);
        }
        return new String(id);
    }

    //Enroll in course

    public void enrollCourse(){


        System.out.println(this.name + " Enter course to enroll (Q to quit)\n1) Math 101 \n2) History 101 \n3) Chemistry 101 \n4) Computer Science 101 \n5) English 101 ");
        String course;
        do{
            Scanner input = new Scanner(System.in);
            course = input.nextLine();


            if(course.equals("1")){
            
                for(int i = 0; i < defaultCourseSize; i++){
                    if(math101[i] == null){
                        math101[i] = this.name;
                        balance -= 600;
                        break;
                    } 
                    
                }

            }

            if(course.equals("2")){
            
                for(int i = 0; i < defaultCourseSize; i++){
                    if(history101[i] == null){
                        history101[i] = this.name;
                        balance -= 600;
                        break;
                    } 
                    
                }

            }

            if(course.equals("3")){
            
                for(int i = 0; i < defaultCourseSize; i++){
                    if(chemistry101[i] == null){
                        chemistry101[i] = this.name;
                        balance -= 600;
                        break;
                    } 
                    
                }

            }

            if(course.equals("4")){
            
                for(int i = 0; i < defaultCourseSize; i++){
                    if(compsci101[i] == null){
                        compsci101[i] = this.name;
                        balance -= 600;
                        break;
                    } 
                    
                }

            }

            if(course.equals("5")){
            
                for(int i = 0; i < defaultCourseSize; i++){
                    if(english101[i] == null){
                        english101[i] = this.name;
                        balance -= 600;
                        break;
                    } 
                    
                }

            }

        }while(!course.equalsIgnoreCase("Q"));

        
    }

    //Displays Status of course
    public static void displayClass(){
        // System.out.println("Math: " + Arrays.toString(math101));
        // System.out.println("History: " + Arrays.toString(history101));
        // System.out.println("Chemistry: " + Arrays.toString(chemistry101));
        // System.out.println("Computer Science: " + Arrays.toString(compsci101));
        // System.out.println("English: " + Arrays.toString(english101));
        
        //Math
        int m = 0;
        String tempMath = "";
        while(math101[m] != null){
            tempMath += math101[m] + ", ";
            m++;
        }
        if(tempMath.length() - 2 <= 0){
            System.out.println("Math is empty.");
        } else {
            tempMath = "Math class: " + tempMath.substring(0, tempMath.length() - 2);
        }
        System.out.println(tempMath);

        //History
        int h = 0;
        String tempHistory = "";
        while(history101[h] != null){
            tempHistory += history101[h] + ", ";
            h++;
        }
        if(tempHistory.length() - 2 <= 0){
            System.out.print("History is empty.");
        } else {
            tempHistory = "History class: " + tempHistory.substring(0, tempHistory.length() - 2);
        }
        System.out.println(tempHistory);


        int chemIndex = 0;
        String tempChem = "";
        while(chemistry101[chemIndex] != null){
            tempChem += chemistry101[chemIndex] + ", ";
            chemIndex++;
        }
        if(tempChem.length() - 2 <= 0){
            System.out.print("Chemistry is empty.");
        } else {
            tempChem = "Chemistry class: " + tempChem.substring(0, tempChem.length() - 2);
        }
        
        
        System.out.println(tempChem);


        int cs = 0;
        String tempCS = "";
        while(compsci101[cs] != null){
            tempCS += compsci101[cs] + ", ";
            cs++;
        }
        if(tempCS.length() - 2 <= 0){
            System.out.print("Computer Science is empty.");
        } else {
            tempCS = "Computer Science class: " + tempCS.substring(0, tempCS.length() - 2);
        }
        System.out.println(tempCS);


        int e = 0;
        String tempEng = "";
        while(english101[e] != null){
            tempEng += english101[e] + ", ";
            e++;
        }
        if(tempEng.length() - 2 <= 0){
            System.out.print("English is empty.");
        } else {
            tempEng = "English class: " + tempEng.substring(0, tempEng.length() - 2);
        }
        System.out.println(tempEng);
        


    }
   

    //View Balance
    public int getBalance(){
        return this.balance;
    }

    public void displayBalance(){
        System.out.println(this.name + "'s " + "total balance: " + "$" + this.balance);
    }

    //Reset balance
    public void setBalance(int newBalance){
        this.balance = newBalance;
    }


    //Pay Tuition
    public void payTuition(){
        this.tuition -= this.balance;
    }


    //Show status


}

    
    
    
