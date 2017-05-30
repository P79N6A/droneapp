package it.a.a.c;

import it.a.a.n;
import it.a.a.q;
import it.a.a.r;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
  implements r
{
  private static final Pattern a = Pattern.compile("^(\\d{2})-(\\d{2})-(\\d{2})\\s+(\\d{2}):(\\d{2})(AM|PM)\\s+(<DIR>|\\d+)\\s+([^\\\\/*?\"<>|]+)$");
  private static final DateFormat b = new SimpleDateFormat("MM/dd/yy hh:mm a");
  
  public n[] a(String[] paramArrayOfString)
  {
    int j = paramArrayOfString.length;
    n[] arrayOfn = new n[j];
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Object localObject3 = a.matcher(paramArrayOfString[i]);
        if (((Matcher)localObject3).matches())
        {
          ??? = ((Matcher)localObject3).group(1);
          Object localObject2 = ((Matcher)localObject3).group(2);
          String str1 = ((Matcher)localObject3).group(3);
          String str2 = ((Matcher)localObject3).group(4);
          String str3 = ((Matcher)localObject3).group(5);
          String str4 = ((Matcher)localObject3).group(6);
          String str5 = ((Matcher)localObject3).group(7);
          localObject3 = ((Matcher)localObject3).group(8);
          arrayOfn[i] = new n();
          arrayOfn[i].a((String)localObject3);
          if (str5.equalsIgnoreCase("<DIR>"))
          {
            arrayOfn[i].a(1);
            arrayOfn[i].a(0L);
            localObject2 = (String)??? + "/" + (String)localObject2 + "/" + str1 + " " + str2 + ":" + str3 + " " + str4;
          }
          try
          {
            synchronized (b)
            {
              localObject2 = b.parse((String)localObject2);
              arrayOfn[i].a((Date)localObject2);
              i += 1;
              continue;
              try
              {
                long l = Long.parseLong(str5);
                arrayOfn[i].a(0);
                arrayOfn[i].a(l);
              }
              catch (Throwable paramArrayOfString)
              {
                throw new q();
              }
            }
            throw new q();
          }
          catch (ParseException paramArrayOfString)
          {
            throw new q();
          }
        }
      }
    }
    return arrayOfn;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */