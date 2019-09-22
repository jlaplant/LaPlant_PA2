import java.util.Scanner;
public class Polling {

	public static void main(String[] args) {
		String[] topics={"Global","Video Games","Economic","Food","Movies"}; //Store five topics in a string
	       int[][] responses=new int[5][11]; //Rate the five topics from 1-10 using a 5row, 10column array
	       for(int i=0;i<4;i++){
	           for(int j=1;j<=10;j++){
	               responses[i][j]=0;
	           }
	       }
	       //create an integer for the number of people taking the survey
	       int numPeople;
	       Scanner scnr=new Scanner(System.in);
	       //numPeople = scnr.nextInt();
	       System.out.print("Enter the no. of people willing to Rate: ");
	    //   Scanner sc=new Scanner(System.in);
	       numPeople=scnr.nextInt();//initialize the integer so user inputs the number of people
	       int i=1;
	       //use while and for loops to print out the five topics for each person that's rating
	       while(i<=numPeople){
	           for(int j=0;j<5;j++){ //five topics so loop stops once it reaches 5
	               System.out.print(topics[j]+":");
	               int x=scnr.nextInt();
	               responses[j][x]=responses[j][x]+1;
	           }
	           i++;
	       } //not sure how to create a tabular report with five topics down left side and 10 ratings across top
	      // System.out.println("Topic "+"Total_Rating "+"Avg_Rating");
	       int high_p=0, low_p=100000, high_topics=0, low_topics=0; //create and initialize integers for the max and min total points
	       for(i=0;i<5;i++) //for loop ends at 5 cause theres only five topics
	       {
	           int total=0; //create and initialize integer total to calculate max and min
	           int j;
	           for(j=1;j<=10;j++) // for loop to go through all ratings 1-10
	           {
	               total=total+j*responses[i][j]; //calculate total by initial total + j multiplied by responses

	           }//create if loops for lowest and highest points total
	           if(high_p<total)
	           {
	               high_p=total;
	               high_topics=i;
	           }
	           if(low_p>total)
	           {
	               low_p=total;
	               low_topics=i;
	           }

	       }
	       System.out.println("High_Point_Topic "+"Total_Rating");
	       System.out.println(topics[high_topics]+" "+high_p);
	       System.out.println("Low_Point_Topic "+"Total_Rating");
	       System.out.println(topics[low_topics]+" "+low_p);
	}

}
