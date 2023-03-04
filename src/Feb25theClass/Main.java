package Feb25theClass;

public class Main {

    public static void main(String[] args) {


        String s1 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. ";
        String [] spliter = s1.split(" "); //whenever there is space it will split the strings and will save in the array of String --> use of 'split' method
/*
        int length = 0; //initializing an int to store the length of a String through the for loop
        String longString = ""; //A String in which i will Store the longest String through the for loop

        for (int x = 0; x< spliter.length; x++){
            if(spliter[x].length()>length){
                length = spliter[x].length();
                longString = spliter[x];
            }
        }
        System.out.println(longString);

*/
        int longString = 0;

        for (int x = 0; x< spliter.length; x++){
            if(spliter[longString].length() < spliter[x].length()){
                longString = x;
            }
        }

        System.out.println(spliter[longString]);

    }
}
