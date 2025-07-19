package java_core;
import java.io.*;
public class create_file {
     public static void main(String[] args) throws IOException{
        //File f = new File("C:\\Users\\gunnk\\OneDrive\\Desktop\\java.txt");
    //     try{
    //          if(f.createNewFile()){
    //     System.out.println("file created");
    // }
    // else{
    //     System.out.println("file already exist...");
    // }
    // }
    // catch(IOException i)
    // {
    //     System.out.println("exception handled"); 
    // }



    //******************************************* */
    // if(f.exists()){
    //     System.out.println("filename : "+f.getName());
    //     System.out.println("file path : "+f.getAbsolutePath());
    //     System.out.println("file writable "+f.canWrite());
    //     System.out.println("file read "+f.canRead());
    //     System.out.println("file size: "+f.length());
    //     System.out.println("file delete: "+f.delete()); // it will delete
        
    // }
    // else{
    //     System.out.println("file doesnt exists");
    // }


    //************************************* */
    //write in a file
    // try{
    //     FileWriter f = new FileWriter("C:\\Users\\gunnk\\OneDrive\\Desktop\\LC.txt");
    //     try{
    //         f.write("A java programming is the best beeezzzzz");
    //     }
    //     finally{
    //         f.close();
    //     }
    //     System.out.println("done..");
    // }
    // catch(IOException i){
    //     System.out.println(i);
    // }


    //**************************************** */
//     //read a filee
    // try{
    //     FileReader r = new FileReader("C:\\Users\\gunnk\\OneDrive\\Desktop\\LC.txt");
    //     try{
    //         int i ;
    //         while((i=r.read())!=-1){  //in bytee  no in int***************************************
    //             System.out.print((char)i);
    //         }
    //     }
    //     finally{
    //         r.close();
    //     }
    // }
    // catch(  IOException e){
    //     System.out.println("exception handled!");
    // }



//rename a file*********************************
// File f = new File("C:\\Users\\gunnk\\OneDrive\\Desktop\\LC.txt");
// File r = new File("C:\\Users\\gunnk\\OneDrive\\Desktop\\java.txt");
// if(f.exists()){
//     System.out.println(f.renameTo(r));
// }
// else{
//     System.out.println("not present");
// }

//**************************************copy one file data to another */

// FileInputStream r = new FileInputStream("C:\\Users\\gunnk\\OneDrive\\Desktop\\java.txt");
// FileOutputStream w = new FileOutputStream("C:\\Users\\gunnk\\OneDrive\\Desktop\\gunn.txt");

// int i;
// while((i=r.read()) != -1){
//     w.write((char)i);

// }
// System.out.println("done");

//*******************************************Orrrrr */

// FileReader r = new FileReader("C:\\Users\\gunnk\\OneDrive\\Desktop\\bee.txt");
// FileWriter w = new FileWriter("C:\\Users\\gunnk\\OneDrive\\Desktop\\gunn1.txt");

// int i;
// while((i=r.read()) != -1){
//     w.write((char)i);
// }
// w.close();
// r.close();
// System.out.println("done");

 }
 }




//buffered reader m hum readLine() ka use krte h

//}
