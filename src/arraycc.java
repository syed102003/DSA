import java.util.*;


public class arraycc {
	public static int find(String food[],String key) {
	     for(int i=0;i<food.length;i++) {
	    	 if(food[i]==key) {
	    		 return i;
	    	 }
	    	 
	     }
	     return -1;
	}
	public static void main(String[] args) {
           String food[] = {"chole baturay","dosa","biryani","rogan josh"};
           String key = "biryani";
          int index =  find(food,key);
          if(index==-1) {
              System.out.println("not found ");

          }else {
           System.out.println(" index found at : " + index);
	}
	}
}
