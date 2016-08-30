public class Banking
{
      private String name;
      private int checkMoney;
      private int saveMoney;

       public Banking(String who, int checking, int saving)
       {
         name = who;
         checkMoney = checking;
         saveMoney = saving;
       }

       public String getName()
       {
         return name;
       }

       public int getCheckMoney()
       {
         return checkMoney;
       }

       public int getSaveMoney()
       {
         return saveMoney;
       }

       public int getTotalMoney()
       {
         return(checkMoney+saveMoney);
       }

       public void setCheckMoney(int amt)
       {
         checkMoney = amt;
       }

       public void setSaveMoney(int amt)
       {
         saveMoney = amt;
       }

       public String toString()
       {
         return(name + " checking: " + checkMoney + " savings: " + saveMoney);
       }

   }
