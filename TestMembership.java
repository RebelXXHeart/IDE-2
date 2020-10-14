/*
Stephen Morrow
CSC 201
IDE 2
*/

public class TestMembership
{
   public static void main(String[] args)
   {
      //Each member has their name, a true or false statement for each skill set, and their email address
      Membership member1 = new Membership("Lord Shaxx", "Crucible@bungie.net",
            true, false, true, false, true);

      Membership member2 = new Membership("Lord Saladin", "ironbanana@bungie.net",
              false, true, true, true, false);

      Membership member3 = new Membership("Commander Zavallah", "Indeed@bungie.net",
              false, false, false, false, false);

      Membership member4 = new Membership("Cayde-6", "Youknowthegamehasentbeenthesamewithoutme@bungie.net",
              true, false, false, false, true);

      Membership member5 = new Membership("Leroy Jenkins", "Igotchicken@aol.net",
              false, false, true, false, false);

      //Code for if a person can join the club
      String qualifiedMsg = " can be a club member   ";

      //Code for if a person is not eligible to join the club
      String notQualifiedMsg = " cannot be a club member right now   ";

      //if/else statements for each member
      if(meetsRequirements(member1))
         output(member1, qualifiedMsg);
      else output(member1, notQualifiedMsg);

      if(meetsRequirements(member2))
         output(member2, qualifiedMsg);
      else output(member2, notQualifiedMsg);

      if(meetsRequirements(member3))
         output(member3, qualifiedMsg);
      else output(member3, notQualifiedMsg);

      if (meetsRequirements(member4))
         output(member4, qualifiedMsg);
      else output(member4, notQualifiedMsg);

      if (meetsRequirements(member5))
         output(member5, qualifiedMsg);
      else output(member5, notQualifiedMsg);
   }

   public static boolean meetsRequirements(Membership app)
   {
      int count = 0;

      boolean isQual;

      //Each potential member must have at least 3 "points" to qualify for the coding club
      final int REQUIRED_SKILLS = 3;

      //Counts each skill, adding one "point" for each true
      if (app.getHasCodingSkills())
                count=count + 1;
      if (app.getHasLinuxSkills())
                count=count + 1;
      if (app.getHasDatabaseSkills())
                count=count + 1;
      if (app.getHasHardwareSkills())
                count=count + 1;
      if (app.getHasServerSkills())
                count=count + 1;

      if(count >= REQUIRED_SKILLS)
         isQual = true;
      else
         isQual = false;

      return isQual;
   }

   public static void output(Membership member, String msg)
   {
      System.out.println(member.getName() + msg + "Email address: " + member.getEmail());
   }


}
