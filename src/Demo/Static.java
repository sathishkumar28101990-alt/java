package Demo;

public class Static {

        static String school ="rvm";
        static String place ="vpm";
        static double salary =10000;

        public static void personaldetail()
        {
            System.out.println("the name of the school;"+school);
            System.out.println("the plce of towm:"+place);
            System.out.println("the salary of the person;"+salary);

        }
        public static void main (String[] args)
        {
            personaldetail();
            System.out.println(school);
        }


}
