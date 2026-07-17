public class Functions {

//     static void sayHello(String name){
//        System.out.println("Hello " + name);
//    }

//    static int add(int a,int b){
//        return a+b;
//    }

    static String isEven(int n){
        if(n%2==0){
            return "Even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {
//         sayHello("Latif");
//         sayHello("Tony");
//        int sum=add(5,6);
//        System.out.println("Answer = "  + sum);
        String answer=isEven(20);
        System.out.println(answer);
    }
}
