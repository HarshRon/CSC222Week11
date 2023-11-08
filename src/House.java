public class House
{
   private String address;
   private int bedrooms;
   private double bathrooms;
   public void setAddress(String add)
   {
      address = add;
   }
   public String getAddress()
   {
      return address;
   }

   public void setBedrooms(int bed) {bedrooms=bed;}
   public int getBedrooms() {return bedrooms;}

   //same thing for bathrooms, forsale house inherits this
}