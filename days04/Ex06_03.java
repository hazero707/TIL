package days04;

public  class Ex06_03{
    public static void main(String [] args) {
        int sum =0;
        for(int i =1 ; i<=10 ; i++){ 
        	System.out.printf( "%d+", i);
        sum  +=i;
        } 
        System.out.printf("\b=%d\n",sum);
       }
    }