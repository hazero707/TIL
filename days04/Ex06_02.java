package days04;

public  class Ex06_02{
    public static void main(String [] args) {
        int sum =0;
        for(int i =1 ; i<=10 ; i++){ 
        	System.out.printf(i ==10? "%d" : "%d+",i);
        sum =sum +i;
        } 
        System.out.printf("=%d\n",sum);
       }
    }