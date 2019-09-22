import java.util.Scanner;
public class Encryption {
	public static String encrypt(String fourDigit) {//create a static class that will encrypt the 4 digit integer
	       int arr[] = new int[4]; //create and initialize array
	       for(int i=0;i<4;i++) { //create for loop that counts up to 4 characters
	           char ch = fourDigit.charAt(i); //create and initialize character
	           arr[i] = Character.getNumericValue(ch);
	       }
	       for(int i=0;i<4;i++) {
	           int temp = arr[i] ;
	           temp += 7 ;
	           temp = temp % 10 ;
	           arr[i] = temp ;
	       }
	       int temp = arr[0];
	       arr[0] = arr[2];
	       arr[2]= temp ;
	       temp = arr[1];
	       arr[1] =arr[3];
	       arr[3] = temp ;
	       int encrypt = 0 ;
	       for(int i=0;i<4;i++)
	           encrypt = encrypt * 10 + arr[i];
	       String output = Integer.toString(encrypt);
	       if(arr[0]==0)
	           output = "0"+output;
	       return output;
	   }
	   public static String decrypt(String fourDigit) {//create static class that decrypts the 4 digit integer
	       int arr[] = new int[4];
	       for(int i=0;i<4;i++) {
	           char ch = fourDigit.charAt(i);
	           arr[i] = Character.getNumericValue(ch);
	       }
	       int temp = arr[0];
	       arr[0]=arr[2];
	       arr[2]=temp;
	       temp = arr[1];
	       arr[1]=arr[3];
	       arr[3]=temp;
	       for(int i=0;i<4;i++) {
	           int digit = arr[i];
	           switch(digit) { //use a switch statements to form original number
	               case 0:
	                   arr[i] = 3;
	                   break;
	               case 1:
	                   arr[i] = 4;
	                   break;
	               case 2:
	                   arr[i] = 5;
	                   break;
	               case 3:
	                   arr[i] = 6;
	                   break;
	               case 4:
	                   arr[i] = 7;
	                   break;
	               case 5:
	                   arr[i] = 8;
	                   break;
	               case 6:
	                   arr[i] = 9;
	                   break;
	               case 7:
	                   arr[i] = 0;
	                   break;
	               case 8:
	                   arr[i] = 1;
	                   break;
	               case 9:
	                   arr[i] = 2;
	                   break;
	           }
	       }
	       int encrypt = 0 ;
	       for(int i=0;i<4;i++)
	           encrypt = encrypt * 10 + arr[i];
	       String output = Integer.toString(encrypt);
	       if(arr[0]==0)
	           output = "0"+output;
	       return output;

	   }

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	       String fourDigit = sc.nextLine();
	       String encryptedNumber = encrypt(fourDigit);
	       System.out.println("Encrypted number is: "+ encrypt(encryptedNumber));
	       System.out.println("Decrypted number is: "+ decrypt(encryptedNumber));
	}

}
