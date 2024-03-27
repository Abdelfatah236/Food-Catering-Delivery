package foodcatering;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Foodatering 
{
  public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
       System.out.println("Welcome to our restaurant"); 
       System.out.println("Menu");
       System.out.println("*****************************************************");
       Customer[] c=new Customer[20];
       Food_item[] main_dishes =new Food_item[7];
       Food_item[] Appetizers=new Food_item[6];
       Food_item[] Drinks=new Food_item[7];
       Food_item[] Desert=new Food_item[7];
       Food_item m1=new Food_item("fish","main dishs",100,1,50);
       Food_item m2=new Food_item("quarter chicken","main dishs",90,1,30);
       Food_item m3=new Food_item("half chicken","main dishs",150,2,50);
       Food_item m4=new Food_item("Beef Stroganoff","main dishs",120,1,40);
       Food_item m5=new Food_item("Burgers.","main dishs",130,1,60);
       Food_item m6=new Food_item("Goulash","main dishs",125,1,49);
       Food_item m7=new Food_item("Macaroni and Cheese","main dishs",110,1,25);
       main_dishes[0]=m1;
       main_dishes[1]=m2;
       main_dishes[2]=m3;
       main_dishes[3]=m4;
       main_dishes[4]=m5;
       main_dishes[5]=m6;
       main_dishes[6]=m7;
         for (int i=0;i<main_dishes.length;i++)
        {
           main_dishes[i].disblayitem();
        }
         System.out.println("*******************************************************************************************************************************************");
       Food_item Appetizers1=new Food_item("Sticky Baked Chicken Wings.","appetizers",100,1,50);
       Food_item Appetizers2=new Food_item("Crab Cakes with Horseradish Cream","appetizers",90,1,40);
       Food_item Appetizers3=new Food_item("Caramelized Onion Dip","appetizers",110,1,45);
       Food_item Appetizers4=new Food_item("Deviled Eggs With Country Ham","appetizers",120,1,60);
       Food_item Appetizers5=new Food_item("Hogs in a Blanket","appetizers",135,1,55);
       Food_item Appetizers6=new Food_item("Caesar Salad Spears","appetizers",100,1,65);

       Appetizers[0]=Appetizers1;
       Appetizers[1]=Appetizers2;
       Appetizers[2]=Appetizers3;
       Appetizers[3]=Appetizers4;
       Appetizers[4]=Appetizers5;
       Appetizers[5]=Appetizers6;
       
       for (int i=0;i<Appetizers.length;i++)
       {
           Appetizers[i].disblayitem();
       }
       System.out.println("*********************************************************************************************************************************************");
       Food_item de1=new Food_item("Apple crisp","desert",120,1,20);
       Food_item de2=new Food_item("Danish pastry.","desert",130,1,30);
       Food_item de3=new Food_item("French toast","desert",135,1,40);
       Food_item de4=new Food_item("gingerbread","desert",140,1,43);
       Food_item de5=new Food_item("gelato","desert",150,1,44);
       Food_item de6=new Food_item("gelatin","desert",160,1,52);
       Food_item de7=new Food_item("devil's food cake","desert",165,1,30);

       Desert[0]=de1;
       Desert[1]=de2;
       Desert[2]=de3;
       Desert[3]=de4;
       Desert[4]=de5;
       Desert[5]=de6;
       Desert[6]=de7;
       
        for (int i=0;i<Desert.length;i++)
        {
           Desert[i].disblayitem();
        }
        System.out.println("***********************************************************************************************************************************************");
       Food_item dr1=new Food_item("Agent Orange","drink",125,1,400);
       Food_item dr2=new Food_item("Pepsi","drink",130,1,20);
       Food_item dr3=new Food_item("Astro pop","drink",135,1,30);
       Food_item dr4=new Food_item("Batida (traditionally made with cachaÃ§a)","drink",160,1,40);
       Food_item dr5=new Food_item("Cofee","drink",144,1,40);
       Food_item dr6=new Food_item("IBA. Black Russian.","drink",155,1,60);
       Food_item dr7=new Food_item("IBA.Bloody Mary","drink",160,1,55);

       Drinks[0]=dr1;
       Drinks[1]=dr2;
       Drinks[2]=dr3;
       Drinks[3]=dr4;
       Drinks[4]=dr5;
       Drinks[5]=dr6;
       Drinks[6]=dr7;
       for (int i=0;i<Drinks.length;i++)
       {
           Drinks[i].disblayitem();
       }
       System.out.println("**************************************************************************************************************************************************");
                        Customer cu;
                         cu = new Loyal();
                       ((Loyal)cu).sup("a", "a");
                         c[0]=cu;
           for(int j=0 ;j<c.length;j++){
            //un un subscriper mean customer ordered for the first time
            System.out.println("enter 1 if  you enter for the first time (un subscriper)");
            //subscriper mean the customer ordered before  
            System.out.println("enter 2 if you entered here before  (subscriper)");
            //subscribe to confirm later that you entered here   
            System.out.println("enter 4 to confirm later that you entered here  (supscripe)");
            //to exit
            System.out.println("enter 3 to break");
            String en=input.next();
            if(en.equals("4"))
            {
                 System.out.print("enter the user name");
                   String use=input.next();
                   System.out.print("enter the password");
                   String password=input.next();
                   for(int i=0;i<c.length;i++){
                       if(c[i]==null){
                           Customer p;
                           p = new Loyal();
                           ((Loyal)p).sup(use, password);
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
                try
                {
              for(int i=0;i<c.length;i++)
                {
                
                if(c[i]==null){
                        Customer cus=new guest();
                        c[i]=cus;
                        System.out.println("Enter a to  Add order");
                        System.out.println("Enter c to  Cancel order");
                        System.out.println("Enter w to  Wish list ");
                        System.out.println("Enter u to  Update order ");
                        System.out.println("Enter d to  Extend the date");
                        System.out.println("Enter r for Report");
                        String enter=input.next();
                        if(enter.equals("r")){
                            System.out.print("Enter your Report :");
                            String repor=input.next();
                            c[i].Report(repor);
                            for(int d=0;d<c[i].Report.size();d++){
                                System.out.println(c[i].Report);
                            }
                        }
                        if(enter.equals("a")){
                            ArrayList<String> or=new ArrayList<>();
                            System.out.println("Enter your Adress : ");
                            String address=input.next();
                            System.out.print("enter your ID :");
                           int id=Integer.parseInt(input.next());
                           System.out.print("Enter the number of day to delevery the order :");
                           int day=Integer.parseInt(input.next());
                           System.out.print("enter number of meal:");
                           int number=Integer.parseInt(input.next());
                          for(int f=0;f<number;f++)
                          {
                              System.out.print("enter the meal :");
                              String me=input.next();
                              or.add(me);
                          }
                           ((guest) c[i]).Create_Order(id, address, day, or);
                           c[i].order.Display();
                        }
                        if(enter.equals("d"))
                        {
                            System.out.print("enter the date to extend");
                            int ext=Integer.parseInt(input.next());
                            c[i].Update(ext);
                            c[i].order.Display();
                        }
                        if(enter.equals("u"))
                        {
                            ArrayList<String> or=new ArrayList<>();
                            System.out.print("enter the number of meal :");
                            int update=Integer.parseInt(input.next());
                            for(int d=0;d<update;d++){
                                System.out.print("enter the meal :");
                                String ff=input.next();
                                or.add(ff);
                                
                            }
                            c[i].update(or);
                            c[i].order.Display();
                        }
                        if(enter.equals("w")){
                            ArrayList<String> qw=new ArrayList<>();
                            System.out.print("enter the number of meal");
                            int ee=Integer.parseInt(input.next());
                            for(int u=0;u<ee;u++){
                                System.out.print("enter the meal :");
                                String ed=input.next();
                                qw.add(ed);
                            }
                            c[i].WishList(qw);
                            for(int d=0;d<c[i].w.size();d++){
                                System.out.println(c[i].w.get(d));
                            }
                            
                        }
                        
                        if(enter.equals("c")){
                            ((Loyal) c[i]).Cancel();
                        }
                        break;             
                }
                }
                }
                catch(Exception ee){
                    System.out.println("Error please enter data suitable");
                }
            }
            if(en.equals("2")){
            System.out.print("Enter the user name :");
            String user=input.next();
            System.out.print("Enter the password  :");
            String passw=input.next();
             try
             {
            for(int i=0;i<c.length;i++)
            {
                System.out.print("in");
                if(c[i]!=null){
                
                    if(c[i] instanceof Loyal)
                    {
                    if(((Loyal)c[i]).chea(passw, user))
                    {    
                        System.out.println("enter a to add order");
                        System.out.println("enter c to cancel order");
                        System.out.println("enter w to wish list");
                        System.out.println("enter u to update order");
                        System.out.println("enter d to extend the date");
                        System.out.println("enter r for report");
                        String enter=input.next();
                        if(enter.equals("r"))
                        {
                            System.out.print("enter your report :");
                            String repor=input.next();
                            c[i].Report(repor);
                            for(int d=0;d<c[i].Report.size();d++)
                            {
                                System.out.println(c[i].Report);
                            }
                        }
                        if(enter.equals("a"))
                        {
                            ArrayList<String> or=new ArrayList<>();
                            System.out.println("enter your adress : ");
                            String address=input.next();
                            System.out.print("enter your id :");
                           int id=Integer.parseInt(input.next());
                           System.out.print("enter the number of day to delevery the order :");
                           int day=Integer.parseInt(input.next());
                           System.out.print("enter number of meal: ");
                           
                           int number=Integer.parseInt(input.next());
                          for(int f=0;f<number;f++)
                          {
                              System.out.print("Enter the meal: ");
                              String me=input.next();
                              or.add(me);
                          }
                           ((Loyal) c[i]).Create_Order(id, address, day, or);
                            c[i].order.Display();
                        }
                        if(enter.equals("d")){
                            System.out.print("enter the date to extend :");
                            int ext=Integer.parseInt(input.next());
                            c[i].Update(ext);
                            c[i].order.Display();
                        }
                        if(enter.equals("u"))
                        {
                            ArrayList<String> or=new ArrayList<>();
                            System.out.print("enter the number of meal :");
                            int update=Integer.parseInt(input.next());
                            for(int d=0;d<update;d++){
                                System.out.print("enter the meal:");
                                String ff=input.next();
                                or.add(ff);     
                            }
                            c[i].update(or);
                            c[i].order.Display();
                        }
                        if(enter.equals("w"))
                        {
                            ArrayList<String>qw=new ArrayList<>();
                            System.out.print("enter the number of meal :");
                            int ee=Integer.parseInt(input.next());
                            for(int u=0;u<ee;u++)
                            {
                                System.out.print("enter the meal :");
                                String ed=input.next();
                                qw.add(ed);
                            }
                            c[i].WishList(qw);
                            for(int d=0;d<c[i].w.size();d++)
                            {
                                System.out.println(c[i].w.get(d));
                            }
                            
                        }
                        
                        if(enter.equals("c"))
                        {
                            ((Loyal) c[i]).Cancel();
                        }
                        break;
                    } 
                       
                    }
                }
                   
                }
            
            
                }
             catch(Exception ec)
                        {
                            System.out.println("enter Integer please");
                        }
            }
            
            }
}
    }
 class Food_item
 {
     String name;
     String category;
     int number_calories;
     double price;
     int porition;
    Food_item(String name,String cat,int num,int porition,double price){
        this.name=name;
        this.number_calories=num;
        this.category=cat;
        this.price=price;
        this.porition=porition;
    }

    public void disblayitem()
    {
        System.out.println("the Food_item name:"+this.name+"\t \t"+ "categery:"+this.category+"\t \t"+" num of calirs:"+this.number_calories+"\t \t"+ "price:"+this.price+"\t \t"+"the num of person for the item "+this.porition);
    }
 
}
 class Order 
 {
   static ArrayList<String> arr =new ArrayList<>();
    int ID;
    Date Start_date;
    Date Delivery_date;
  static  String del_address;
    Order(int id,Date s,Date d,String del_address)
    {
        this.ID=id;
        this.Start_date=s;
        this.Delivery_date=d;
        this.del_address=del_address;
    }
   static void orderitem(String it)
    {
        arr.add(it);
    }
    void Display ()
    {
        
        try
        {
          System.out.println("Your Id:"+this.ID+"\t"+"Start date and time"+"\t"+this.Start_date+"\t"+"delivery date and time"+"\t"+this.Delivery_date+"\t"+this.del_address);  
          for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
            if(ID==0)
            {
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
    void Cancel();
    void Update(int ext);
    void WishList(ArrayList<String> w);
    void update(ArrayList<String> p);
    void Report(String report);
}
abstract class Customer implements cc{
    int ordernumber=0;
    String address;
    Order order;
    int num_date;
   
    ArrayList<String> w =new ArrayList<>();
    ArrayList<String> Report=new ArrayList<>();
    /**
     * abstract function
     * @param id
     * @param adre 
     */
    abstract void Create_Order(int id,String adre,int num,ArrayList<String> ord);
    /**
     * function to update the meal
     * @param p 
     */
    @Override
   final public void update(ArrayList<String> p)
   {        
        for(int i=0;i<p.size();i++)
        {
           order.orderitem(p.get(i));
        }
    }
    /**
     * overloading to update the time
     * @param ext 
     */
    @Override
    public void Update(int ext)
    {
        Calendar cal=Calendar.getInstance();
        cal.setTime(order.Delivery_date);
        cal.add(Calendar.DAY_OF_MONTH, ext);
        order.Delivery_date=cal.getTime();
    }
    /**
     * function to cancel the order
     */
    @Override
    public void Cancel()
    {
        this.order=null;
        System.out.println("cancel done");
    }
    /**
     * add to the user wish list
     * @param w 
     */
    @Override
    public void WishList(ArrayList<String> w)
    {
      this.w=w;
    }
    /**
     * to add report 
     */
    @Override
    public void Report(String report)
    {
        this.Report.add(report);
        System.out.println("donee");
    }
}
  
 class guest extends Customer
 {    
    /**  
     * create order for the gust customer
     * @param id
     * @param adress
     * @param number
     * @param order 
     */
    void Create_Order(int id,String adre,int num,ArrayList<String> or){
        Calendar cal=Calendar.getInstance();
        Date date=new Date();
        cal.add(Calendar.DAY_OF_MONTH, num);
        order=new Order(id,date,cal.getTime(),adre);
        for (int i=0;i<or.size();i++){
           order.orderitem(or.get(i));
           ordernumber++;
        }
    }
}
class Loyal extends Customer
  {
    /**
     * create order for Loyalty customer
     * @param id
     * @param adre
     * @param num
     * @param ord 
     */
     String Username;
     String Password;
      boolean chea(String pass ,String user)
      {
        boolean che=false;
        if(this.Password.equals(pass) && this.Username.equals(user))
        {
            che=true;
        }
        return che;
    }
       void sup(String user,String pass){
        this.Password=pass;
        this.Username=user;
        System.out.println("done");
    }
      
    void Create_Order(int id,String adre,int num,ArrayList<String> ord)
    {     
        Calendar cal=Calendar.getInstance();
        Date date=new Date();
        cal.add(Calendar.DAY_OF_MONTH, num_date);
        Calendar cc=Calendar.getInstance();
        cc.add(Calendar.DAY_OF_MONTH, num);
        
        order=new Order(id,date,cc.getTime(),adre);
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
 class exx extends Exception{

    public exx(String wron){
            super(wron);
        }
    }


 
