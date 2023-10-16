package days04;

public  class EX06{
    public static void main(String [] args) {
        int sum =0;
        for(int i =1 ; i<=10 ; i++){ 
        	if (i==10) {
				System.out.printf("%d",i);
			} else {
				System.out.printf("%d+",i);
			}
        System.out.printf("%d+",i);
        sum =sum +i;
        } 
        System.out.printf("=%d\n",sum);
       }
    }