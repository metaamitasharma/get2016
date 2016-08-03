package DSassignment4;

public class Validation {
	
	public boolean checkInteger(int value)
    {
        if(value<=0){
            
            //System.out.println("Enter positive number");
            return false;
        }
        else{
            return true;
        }
    }
    public boolean checkString(String str){
        if(str.equals(null)){
            return false;
        }
        else
        {
            return true;
        }
    }

}
