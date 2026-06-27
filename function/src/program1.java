import java.io.*;
public class program1 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            reader = new BufferedReader(isr);
            System.out.print("Enter some text: ");
            String line = reader.readLine();
            System.out.println("You entered: " + line);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                if(reader != null)
                    reader.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}