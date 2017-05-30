package com.fimi.soul.biz.update.a;

import android.util.Xml;
import com.fimi.soul.biz.update.h;
import com.fimi.soul.entity.FirmwareInfo;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class a
  implements h
{
  public String a(List<FirmwareInfo> paramList)
  {
    XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
    StringWriter localStringWriter = new StringWriter();
    localXmlSerializer.setOutput(localStringWriter);
    localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(true));
    localXmlSerializer.startTag("", "firmwares");
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      FirmwareInfo localFirmwareInfo = (FirmwareInfo)paramList.next();
      localXmlSerializer.startTag("", "firmware");
      localXmlSerializer.attribute("", "sysId", localFirmwareInfo.getSysId() + "");
      localXmlSerializer.startTag("", "model");
      localXmlSerializer.text(localFirmwareInfo.getModel() + "");
      localXmlSerializer.endTag("", "model");
      localXmlSerializer.startTag("", "sysName");
      localXmlSerializer.text(localFirmwareInfo.getSysName());
      localXmlSerializer.endTag("", "sysName");
      localXmlSerializer.startTag("", "version");
      localXmlSerializer.text(localFirmwareInfo.getVersion() + "");
      localXmlSerializer.endTag("", "version");
      localXmlSerializer.startTag("", "isLowVersion");
      localXmlSerializer.text(localFirmwareInfo.getIsLowVersion() + "");
      localXmlSerializer.endTag("", "isLowVersion");
      localXmlSerializer.startTag("", "inputTime");
      localXmlSerializer.text(localFirmwareInfo.getInputTime() + "");
      localXmlSerializer.endTag("", "inputTime");
      localXmlSerializer.startTag("", "sort");
      localXmlSerializer.text(localFirmwareInfo.getSort() + "");
      localXmlSerializer.endTag("", "sort");
      localXmlSerializer.endTag("", "firmware");
    }
    localXmlSerializer.endTag("", "firmwares");
    localXmlSerializer.endDocument();
    return localStringWriter.toString();
  }
  
  public List<FirmwareInfo> a(InputStream paramInputStream)
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setInput(paramInputStream, "UTF-8");
    int i = localXmlPullParser.getEventType();
    Object localObject1 = null;
    InputStream localInputStream = null;
    if (i != 1)
    {
      paramInputStream = localInputStream;
      Object localObject2 = localObject1;
      switch (i)
      {
      default: 
        localObject2 = localObject1;
        paramInputStream = localInputStream;
      }
      for (;;)
      {
        i = localXmlPullParser.next();
        localInputStream = paramInputStream;
        localObject1 = localObject2;
        break;
        localObject2 = new ArrayList();
        paramInputStream = localInputStream;
        continue;
        if (localXmlPullParser.getName().equals("firmware"))
        {
          paramInputStream = new FirmwareInfo();
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("sysId"))
        {
          localXmlPullParser.next();
          localInputStream.setSysId(Integer.valueOf(localXmlPullParser.getText()).intValue());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("model"))
        {
          localXmlPullParser.next();
          localInputStream.setModel(Integer.valueOf(localXmlPullParser.getText()).intValue());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("sysName"))
        {
          localXmlPullParser.next();
          localInputStream.setSysName(localXmlPullParser.getText());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("status"))
        {
          localXmlPullParser.next();
          localInputStream.setStatus(localXmlPullParser.getText());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("isLowVersion"))
        {
          localXmlPullParser.next();
          localInputStream.setIsLowVersion(Integer.valueOf(localXmlPullParser.getText()).intValue());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("inputTime"))
        {
          localXmlPullParser.next();
          localInputStream.setInputTime(localXmlPullParser.getText());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("sort"))
        {
          localXmlPullParser.next();
          localInputStream.setSort(Integer.valueOf(localXmlPullParser.getText()).intValue());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else if (localXmlPullParser.getName().equals("version"))
        {
          localXmlPullParser.next();
          localInputStream.setVersion(localXmlPullParser.getText());
          paramInputStream = localInputStream;
          localObject2 = localObject1;
        }
        else
        {
          paramInputStream = localInputStream;
          localObject2 = localObject1;
          if (localXmlPullParser.getName().equals("fileName"))
          {
            localXmlPullParser.next();
            localInputStream.setFileName(localXmlPullParser.getText());
            paramInputStream = localInputStream;
            localObject2 = localObject1;
            continue;
            paramInputStream = localInputStream;
            localObject2 = localObject1;
            if (localXmlPullParser.getName().equals("firmware"))
            {
              ((List)localObject1).add(localInputStream);
              paramInputStream = null;
              localObject2 = localObject1;
            }
          }
        }
      }
    }
    return (List<FirmwareInfo>)localObject1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */