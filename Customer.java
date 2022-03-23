public class Customer{
    public String customername;
    public String customerId;
    public String customeraddress;
    public long customernumber;
    
    public void displaycustomerdetails(){
        System.out.println("Customer details are:");
        System.out.println("Customer name:" +customername);
        System.out.println("Customer name:" +customerId);
        System.out.println("Customer name:" +customeraddress);
        System.out.println("Customer name:" +customernumber);
        System.out.println();
    }
    public static void main(String args[]){
       Customer cust1=new Customer();
      Customer cust2=new Customer();
      cust1.customername="Rahul";
      cust1.customerId="18B427";
       cust1.customeraddress="2-2-1104/D,Tilak Nagar,Hyd";
      cust1.customernumber=95504;
      cust1.displaycustomerdetails();
    
       cust2.customername="Vamsi";
       cust2.customerId="18B448";
      cust2.customeraddress="Gurramguda ,Rangareddi";
      cust2.customernumber=63;
      cust2.displaycustomerdetails();
    }
    
}
