public class Main 
{
	public static void main(String[] args) 
    {
      Customers customerObj1=new Customers(1001,"Saakshi",9000000000L,"Bangalore","16-jul-1990",'F',"Lakme Kajal,Salwar");
      Customers customerObj2=new Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      Suppliers supplierObj1=new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75);
      Suppliers supplierObj2=new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35);
      
      customerObj1.displayProfile();
      customerObj2.displayProfile();
      supplierObj1.displayProfile();
      supplierObj2.displayProfile();
      
      customerObj1.editAddress("Coimbatore");
      supplierObj1.editAddress("Delhi");
      
      customerObj1.placeOrder();
      
      supplierObj1.increaseStock(5);
      supplierObj2.increaseStock(10);
    }	
}

class Users 
{
  int id;
  String name;
  long mobileNumber;
  String address;
  public void displayProfile()
  {
    System.out.println(name+", "+mobileNumber);
  }
  public void editAddress(String newAddress)
  {
    System.out.println(name+", "+address);
    address=newAddress;
    System.out.println(name+", "+address);
  }
}

class Customers extends Users
{
  String dateOfBirth;
  char gender;
  String orderHistory;
  Customers(int id,String name,long mobileNumber,String shippingAddress,String dateOfBirth,char gender,String orderHistory)
  {
  this.id=id;
  this.name=name;
  this.mobileNumber=mobileNumber;
  this.address=shippingAddress;
  this.dateOfBirth=dateOfBirth;
  this.gender=gender;
  this.orderHistory=orderHistory;
  }
  public void placeOrder()
  {
  System.out.println("Order placed successfully!");
  }
}
class Suppliers extends Users 
{
  int itemsStock;
  String paymentStatus;
  Double feedbackRating;
  Suppliers(int id,String name,long mobileNumber,String billingAddress,int itemsStock,String paymentStatus,Double feedbackRating)
  {
  this.id=id;
  this.name=name;
  this.mobileNumber=mobileNumber;
  this.address=billingAddress;
  this.itemsStock=itemsStock;
  this.paymentStatus=paymentStatus;
  this.feedbackRating=feedbackRating;
  }
  public void increaseStock(int inc)
  {
  System.out.println(name+", "+(itemsStock+inc));
  }
}