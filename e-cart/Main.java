//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return this.price;
  }
}
class Customer
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
    this.product=product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill
{
  public void result(int price,int quantity)
  {
   System.out.println("Total Price is : "+(price*quantity));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String product=in.nextLine();
    int price=in.nextInt();
    int quantity=in.nextInt();
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
    c.setProduct(product);
    c.setQuantity(quantity);
    Bill obj = new Bill();
    int p=i.getPrice();
    int q=c.getQuantity();
    obj.result(p,q);
  }
}