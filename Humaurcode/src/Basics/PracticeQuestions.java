import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        //factorial 5! = 5*4*3*2*1
//        int factorial=1;
//        for(int i=5;i>=1;i--){
//            factorial *=i;
//        }
//        System.out.println(factorial);
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int userInput=sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(userInput + " x " + i + " = " + userInput*i);
//        }

//        int num=123;
//        int a=num%10;//3
//        num=num/10;//12
//        int b=num%10;//2
//        num=num/10;//1
//        System.out.print(a);
//        System.out.print(b);
//        System.out.print(num);


//        int num=1234;
//        int result=0;
//        while(num>0){
//            result=result*10+num%10;
//            num=num/10;
//        }
//
//        System.out.println(result);

//        int num=9;
//        int square=num*num;
//        int sum=0;
//        int i=1;
//        while(i<50){
//            int n=square%10;
//            sum +=n;
//            square=square/10;
//        }
//        if(sum==num){
//            System.out.println("Neon");
//        }

        int num=24697;
        int count=0;
        while(num>0){
            int a=num%10;
            num=num/10;
            count++;
        }
        System.out.println(count);

    }
}
