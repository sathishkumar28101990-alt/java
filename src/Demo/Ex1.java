package Demo;

public class Ex1 {
        public static void add(int a, int b){
            System.out.println("add the value of a and b:"+(a+b));


    }

    public void sub(int a, int b){
            System.out.println("sub the value of a and b:"+(a-b));

    }
    public static void collegename(String cullegename) {
        System.out.println("the name of the college is :" + cullegename);

    }
    public void studentname(String studentname){
            System.out.println("the name of the student is:"+studentname);
    }
    public static void square(int a){
         System.out.println("the square root is:"+a*a);

    }
    public void cube(int a){
            System.out.println("the cube root of :"+a*a*a);

    }
    public static void main(String[] args){
            Ex1 s=new Ex1();
            add(5,2);
            s.sub(10,5);
            collegename("sns");
            s.studentname("sathish");
            square(2);
            s.cube(65);
    }


}
