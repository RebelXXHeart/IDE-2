public class Membership
{
   private String name;
   private String email;
   private boolean hasCodingSkills;
   private boolean hasLinuxSkills;
   private boolean hasDatabaseSkills;
   private boolean hasHardwareSkills;
   private boolean hasServerSkills;
   public Membership(String name, String email, boolean c, boolean l, boolean d, boolean h, boolean s)
   {
      this.name = name;
      this.email = email;
      hasCodingSkills = c;
      hasLinuxSkills = l;
      hasDatabaseSkills = d;
      hasHardwareSkills = h;
      hasServerSkills = s;
   } 
   public String getName()
   {

      return name;
   }
   public String getEmail()
   {

      return email;
   }
   public boolean getHasCodingSkills()
   {

      return hasCodingSkills;
   }
   public boolean getHasLinuxSkills()
   {

      return hasLinuxSkills;
   }
   public boolean getHasDatabaseSkills()
   {

      return hasDatabaseSkills;
   }
   public boolean getHasHardwareSkills()
   {

      return hasHardwareSkills;
   }
   public boolean getHasServerSkills()
   {

      return hasServerSkills;
   }
}