package This;

public class This {

    String bagname;
    String bagcolour;
    String bagmodel;
    double bagprice;
    int bagwarranty;

    public void bagdetais(String bagname, String bagcolour, String bagmodel, double bagprice, int bagwarranty)
    {
       this.bagname=bagname;
       this.bagcolour=bagcolour;
       this.bagmodel=bagmodel;
       this.bagprice=bagprice;
       this.bagwarranty=bagwarranty;

    }

    public static void main(String[] args) {
        This t = new This();
        t.bagdetais("wildcarft", "black","VUV123",2500, 2026);
        System.out.println("the bagname is :"+t.bagname);
        System.out.print("the bagcolours is :"+t.bagcolour);
        System.out.print("the bagmodel is :"+t.bagmodel);
        System.out.print("the bagprice is :"+t.bagprice);
        System.out.print("bagwarraanty is :"+t.bagwarranty);

    }



}
