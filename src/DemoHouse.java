public class DemoHouse
{
   public static void main(String[] args)
   {
      ForSaleHouse aListedHouse = new ForSaleHouse();
      aListedHouse.setAddress("56 Oak");
      aListedHouse.setPrice(186000);
      System.out.println("The house at " +
         aListedHouse.getAddress() +
         " is for sale for $" +
         aListedHouse.getPrice());

      House myHouse = new House();
      myHouse.setAddress("129 Valley View Drive");

      //for sale house
      ForSaleHouse ronniesHouse = new ForSaleHouse();
      ronniesHouse.setAddress("929 canyon ridge rd");
      ronniesHouse.setPrice(495000);

      //myHouse.setPrice
      System.out.println("The house at " + ronniesHouse.getAddress() +  " is for sale for $" + ronniesHouse.getPrice());

      //want to start keeping track of num bedrooms and baths per house

   }
}