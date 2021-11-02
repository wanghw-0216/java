package 关闭资源;

import java.io.*;
import java.util.Scanner;

public class demo {
    public demo() throws FileNotFoundException {
    }

    public static void main(String[] args) {

    }

    public void finallyToClose(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D://read.txt"));
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }


    public void tryResourcesClose(){
        try(Scanner scanner = new Scanner(new File("D://read.txt"))){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //多个资源关闭
    public void moreClose(){
        try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("test.txt")));
            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("out.txt")))){
            int b;
            while ((b = bin.read()) !=-1){
                bout.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
