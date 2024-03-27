package foodcatering_package;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Foodcatering {

  
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
      ArrayList<order> orr=new ArrayList<>();
       customer[] c=new customer[20];
       item[] m =new item[7];
       item[] di=new item[6];
       item[] dr=new item[7];
       item[] de=new item[7];
       item m1=new item("fish","main dishs",100,1,50);
       item m2=new item("quarter chicken","main dishs",90,1,30);
       item m3=new item("half chicken","main dishs",150,2,50);
       item m4=new item("Beef Stroganoff","main dishs",120,1,40);
       item m5=new item("Burgers.","main dishs",130,1,60);
       item m6=new item("Goulash","main dishs",125,1,49);
       item m7=new item("Macaroni and Cheese","main dishs",110,1,25);
       m[0]=m1;
       m[1]=m2;
       m[2]=m3;
       m[3]=m4;
       m[4]=m5;
       m[5]=m6;
       m[6]=m7;
         for (int i=0;i<m.length;i++){
           
           m[i].disblayitem();
       }
       item di1=new item("Sticky Baked Chicken Wings.","appetizers",100,1,50);
       item di2=new item("Crab Cakes with Horseradish Cream","appetizers",90,1,40);
       item di3=new item("Caramelized Onion Dip","appetizers",110,1,45);
       item di4=new item("Deviled Eggs With Country Ham","appetizers",120,1,60);
       item di5=new item("Hogs in a Blanket","appetizers",135,1,55);
       item di6=new item("Caesar Salad Spears","appetizers",100,1,65);

       di[0]=di1;
       di[1]=di2;
       di[2]=di3;
       di[3]=di4;
       di[4]=di5;
       di[5]=di6;
       
       for (int i=0;i<di.length;i++){
           di[i].disblayitem();
       }

       item de1=new item(" eclair","desert",120,1,20);
       item de2=new item("Danish pastry.","desert",130,1,30);
       item de3=new item(" French toast","desert",135,1,40);
       item de4=new item(" gingerbread","desert",140,1,43);
       item de5=new item(" gelato","desert",150,1,44);
       item de6=new item("gelatin","desert",160,1,52);
       item de7=new item(" devil's food cake","desert",165,1,30);

       de[0]=de1;
       de[1]=de2;
       de[2]=de3;
       de[3]=de4;
       de[4]=de5;
       de[5]=de6;
       de[6]=de7;

       item dr1=new item("Agent Orange","drink",120,1,500);
       item dr2=new item(" Apple Martini or Appletini","drink",130,1,20);
       item dr3=new item(" Astro pop","drink",140,1,30);
       item dr4=new item(" Batida (traditionally made with cachaça)","drink",150,1,40);
       item dr5=new item(" Bay Breeze","drink",144,1,45);
       item dr6=new item(" IBA. Black Russian.","drink",155,1,60);
       item dr7=new item(" IBA.Bloody Mary","drink",160,1,55);

       dr[0]=dr1;
       dr[1]=dr2;
       dr[2]=dr3;
       dr[3]=dr4;
       dr[4]=dr5;
       dr[5]=dr6;
       dr[6]=dr7;
    
                          customer cu;
                           cu = new loy();
                           ((loy)cu).sup("a", "a");
                           c[0]=cu;
           for(int j=0 ;j<c.length;j++){
            System.out.println("enter 1 if   un subscriper");
            System.out.println("enter 2 if   subscriper");
            System.out.println("enter 4 to   supscripe");
            System.out.println("enter 3 to    break");
            String en=sc.next();
            if(en.equals("4")){
                 System.out.print("enter the user name");
                   String use=sc.next();
                   System.out.print("enter the password");
                   String password=sc.next();
                   for(int i=0;i<c.length;i++){
                       if(c[i]==null){
                           customer p;
                           p = new loy();
                           ((loy)p).sup(use, password);
                           c[i]=p;
                           break;
                       }
                   }
            }
            if(en.equals("3"))
            {
                break;
            }
            if(en.equals("1"))
            {
                try{
              for(int i=0;i<c.length;i++){
                
                if(c[i]==null){
                        customer cus=new gust();
                        c[i]=cus;
                        System.out.println("enter a to add order");
                        System.out.println("enter c to cancel order");
                        System.out.println("enter w to wish list ");
                        System.out.println("enter u to update order ");
                        System.out.println("enter d to extend the date");
                        System.out.println("enter r for report");
                        String enter=sc.next();
                        if(enter.equals("r")){
                            System.out.print("enter your report :");
                            String repor=sc.next();
                            c[i].report(repor);
                            for(int d=0;d<c[i].report.size();d++){
                                System.out.println(c[i].report);
                            }
                        }
                        if(enter.equals("a")){
                            ArrayList<String> or=new ArrayList<>();
                            System.out.println("enter your adress : ");
                            String address=sc.next();
                            System.out.print("enter your id :");
                           int id=Integer.parseInt(sc.next());
                           System.out.print("enter the number of day to delevery the order :");
                           int day=Integer.parseInt(sc.next());
                           System.out.print("enter number of meal:");
                           
                           int number=Integer.parseInt(sc.next());
                          for(int f=0;f<number;f++){
                              System.out.print("enter the meal :");
                              String me=sc.next();
                              or.add(me);
                          }
                           ((gust) c[i]).create(id, address, day, or);
                           c[i].order.disblay();
                        }
                        if(enter.equals("d")){
                            System.out.print("enter the date to extend");
                            int ext=Integer.parseInt(sc.next());
                            c[i].update(ext);
                            c[i].order.disblay();
                        }
                        if(enter.equals("u")){
                            ArrayList<String> or=new ArrayList<>();
                            System.out.print("enter the number of meal :");
                            int update=Integer.parseInt(sc.next());
                            for(int d=0;d<update;d++){
                                System.out.print("enter the meal :");
                                String ff=sc.next();
                                or.add(ff);
                                
                            }
                            c[i].update(or);
                            c[i].order.disblay();
                        }
                        if(enter.equals("w")){
                            ArrayList<String> qw=new ArrayList<>();
                            System.out.print("enter the number of meal");
                            int ee=Integer.parseInt(sc.next());
                            for(int u=0;u<ee;u++){
                                System.out.print("enter the meal :");
                                String ed=sc.next();
                                qw.add(ed);
                            }
                            c[i].wishlist(qw);
                            for(int d=0;d<c[i].w.size();d++){
                                System.out.println(c[i].w.get(d));
                            }
                            
                        }
                        
                        if(enter.equals("c")){
                            ((loy) c[i]).cancel();
                        }
                        break;
                    
                    
                }
                }
                }
                catch(Exception ee){
                    System.out.println("enter integeer please");
                }
            }
            if(en.equals("2")){
            System.out.print("enter the user name :");
            String user=sc.next();
            System.out.print("enter the password : :");
            String passw=sc.next();
             try{
            for(int i=0;i<c.length;i++){
                System.out.print("in");
                if(c[i]!=null){
                
                    if(c[i] instanceof loy){
                    if(((loy)c[i]).chea(passw, user)){
                        
                        System.out.println("enter a to add order");
                        System.out.println("enter c to cancel order");
                        System.out.println("enter w to wish list");
                        System.out.println("enter u to update order");
                        System.out.println("enter d to extend the date");
                        System.out.println("enter r for report");
                        String enter=sc.next();
                        if(enter.equals("r")){
                            System.out.print("enter your report :");
                            String repor=sc.next();
                            c[i].report(repor);
                            for(int d=0;d<c[i].report.size();d++){
                                System.out.println(c[i].report);
                            }
                        }
                        if(enter.equals("a")){
                            ArrayList<String> or=new ArrayList<>();
                            System.out.println("enter your adress : ");
                            String address=sc.next();
                            System.out.print("enter your id :");
                           int id=Integer.parseInt(sc.next());
                           System.out.print("enter the number of day to delevery the order :");
                           int day=Integer.parseInt(sc.next());
                           System.out.print("enter number of meal");
                           
                           int number=Integer.parseInt(sc.next());
                          for(int f=0;f<number;f++){
                              System.out.print("enter the meal :");
                              String me=sc.next();
                              or.add(me);
                          }
                           ((loy) c[i]).create(id, address, day, or);
                           
                        }
                        if(enter.equals("d")){
                            System.out.print("enter the date to extend :");
                            int ext=Integer.parseInt(sc.next());
                            c[i].update(ext);
                            c[i].order.disblay();
                        }
                        if(enter.equals("u")){
                            ArrayList<String> or=new ArrayList<>();
                            System.out.print("enter the number of meal :");
                            int update=Integer.parseInt(sc.next());
                            for(int d=0;d<update;d++){
                                System.out.print("enter the meal:");
                                String ff=sc.next();
                                or.add(ff);
                                
                            }
                            c[i].update(or);
                            c[i].order.disblay();
                        }
                        if(enter.equals("w")){
                            ArrayList<String> qw=new ArrayList<>();
                            System.out.print("enter the number of meal :");
                            int ee=Integer.parseInt(sc.next());
                            for(int u=0;u<ee;u++){
                                System.out.print("enter the meal :");
                                String ed=sc.next();
                                qw.add(ed);
                            }
                            c[i].wishlist(qw);
                            for(int d=0;d<c[i].w.size();d++){
                                System.out.println(c[i].w.get(d));
                            }
                            
                        }
                        
                        if(enter.equals("c")){
                            ((loy) c[i]).cancel();
                        }
                        break;
                    } 
                       
                    }
                    }
                   
                }
            
            
                }
             catch(Exception ec){
                            System.out.println("enter Integer please");
                            }
            }
            
            }
}
       }
       

 class item{
    String name;
    String cat;
    int num;
    double price;
    int porition;
    item(String name,String cat,int num,int porition,double price){
        this.name=name;
        this.num=num;
        this.cat=cat;
        this.price=price;
        this.porition=porition;
    }

    public void disblayitem(){
        System.out.println("the item name :"+this.name);
        System.out.println("the item categery :"+this.cat);
        System.out.println("the item num of calirs :"+this.num);
        System.out.println("the item price :"+this.price);
        System.out.println("the num of person for the item  :"+this.porition);
    }
 
}
 class order{
   static ArrayList<String> ar=new ArrayList<>();
    int id;
    Date s;
    Date d;
  static  String del_address;
    order(int id,Date s,Date d,String del_address){
        this.id=id;
        this.s=s;
        this.d=d;
        this.del_address=del_address;
    }
   static void orderitem(String it){
        ar.add(it);
    }
    void disblay (){
        
        try{
        
            System.out.println(this.id);
            System.out.println(this.s);
            System.out.println(this.d);
            System.out.println(this.del_address);
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
            if(id==0){
                throw new exx("no order:");
            }
        }
        catch(exx ee){
            System.out.println(ee.getMessage());
        }
    }
}
/**
 * interface 
 *
 */
 interface cc {
    void cancel();
    void update(int ext);
    void wishlist(ArrayList<String> w);
     void update(ArrayList<String> p);
    void report(String report);
}
abstract class customer implements cc{
    int ordernumber=0;
    String address;
    order order;
    int num_date;
   
    ArrayList<String> w =new ArrayList<>();
    ArrayList<String> report=new ArrayList<>();
    /**
     * abstract function
     * @param id
     * @param adre 
     */
    abstract void create(int id,String adre,int num,ArrayList<String> ord);
    /**
     * function to update the meal
     * @param p 
     */
    @Override
   final public void update(ArrayList<String> p){        
        for(int i=0;i<p.size();i++){
           order.orderitem(p.get(i));
        }
    }
    /**
     * overloading to update the time
     * @param ext 
     */
    @Override
    public void update(int ext){
        Calendar cal=Calendar.getInstance();
        cal.setTime(order.d);
        cal.add(Calendar.DAY_OF_MONTH, ext);
        order.d=cal.getTime();
    }
    /**
     * function to cancel the order
     */
    @Override
    public void cancel(){
        this.order=null;
        System.out.println("cancel done");
    }
    /**
     * add to the user wish list
     * @param w 
     */
    @Override
    public void wishlist(ArrayList<String> w){
      this.w=w;
    }
    /**
     * to add report 
     */
    @Override
    public void report(String report){
        this.report.add(report);
        System.out.println("donee");
    }
}
  class loy extends customer{
    /**
     * create order for Loyalty customer
     * @param id
     * @param adre
     * @param num
     * @param ord 
     */
     String user;
    String pass;
      boolean chea(String pass ,String user){
        boolean che=false;
        if(this.pass.equals(pass) && this.user.equals(user)){
            che=true;
        }
        return che;
    }
       void sup(String user,String pass){
        this.pass=pass;
        this.user=user;
        System.out.println("done");
    }
      
    void create(int id,String adre,int num,ArrayList<String> ord){
      
        Calendar cal=Calendar.getInstance();
        Date date=new Date();
        cal.add(Calendar.DAY_OF_MONTH, num_date);
        Calendar cc=Calendar.getInstance();
        cc.add(Calendar.DAY_OF_MONTH, num);
        
        order=new order(id,date,cc.getTime(),adre);
         System.out.println("you have two appetizers and a drink for free");
        order.orderitem("Astro pop");
        order.orderitem("Sticky Baked Chicken Wings");
        order.orderitem("Hogs in a Blanket");
        for (int i=0;i<ord.size();i++){
           order.orderitem(ord.get(i));
           ordernumber++;
        }
    }
}
 class gust extends customer{    
    /**  
     * create order for the gust customer
     * @param id
     * @param adre
     * @param num
     * @param or 
     */
    void create(int id,String adre,int num,ArrayList<String> or){
        Calendar cal=Calendar.getInstance();
        Date date=new Date();
        cal.add(Calendar.DAY_OF_MONTH, num);
        order=new order(id,date,cal.getTime(),adre);
        for (int i=0;i<or.size();i++){
           order.orderitem(or.get(i));
           ordernumber++;
        }
    }
}
 class exx extends Exception{

    public exx(String wron){
            super(wron);
        }
    }
