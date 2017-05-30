package com.fimi.soul.biz.update.a;

import android.util.Xml;
import com.fimi.soul.biz.update.h;
import com.fimi.soul.entity.FirmwareInfo;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class a implements h {
    public String a(List<FirmwareInfo> list) {
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        Writer stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
        newSerializer.startTag("", "firmwares");
        for (FirmwareInfo firmwareInfo : list) {
            newSerializer.startTag("", "firmware");
            newSerializer.attribute("", "sysId", firmwareInfo.getSysId() + "");
            newSerializer.startTag("", "model");
            newSerializer.text(firmwareInfo.getModel() + "");
            newSerializer.endTag("", "model");
            newSerializer.startTag("", "sysName");
            newSerializer.text(firmwareInfo.getSysName());
            newSerializer.endTag("", "sysName");
            newSerializer.startTag("", "version");
            newSerializer.text(firmwareInfo.getVersion() + "");
            newSerializer.endTag("", "version");
            newSerializer.startTag("", "isLowVersion");
            newSerializer.text(firmwareInfo.getIsLowVersion() + "");
            newSerializer.endTag("", "isLowVersion");
            newSerializer.startTag("", "inputTime");
            newSerializer.text(firmwareInfo.getInputTime() + "");
            newSerializer.endTag("", "inputTime");
            newSerializer.startTag("", "sort");
            newSerializer.text(firmwareInfo.getSort() + "");
            newSerializer.endTag("", "sort");
            newSerializer.endTag("", "firmware");
        }
        newSerializer.endTag("", "firmwares");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public List<FirmwareInfo> a(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, "UTF-8");
        List<FirmwareInfo> list = null;
        FirmwareInfo firmwareInfo = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            switch (eventType) {
                case 0:
                    list = new ArrayList();
                    break;
                case 2:
                    if (!newPullParser.getName().equals("firmware")) {
                        if (!newPullParser.getName().equals("sysId")) {
                            if (!newPullParser.getName().equals("model")) {
                                if (!newPullParser.getName().equals("sysName")) {
                                    if (!newPullParser.getName().equals("status")) {
                                        if (!newPullParser.getName().equals("isLowVersion")) {
                                            if (!newPullParser.getName().equals("inputTime")) {
                                                if (!newPullParser.getName().equals("sort")) {
                                                    if (!newPullParser.getName().equals("version")) {
                                                        if (!newPullParser.getName().equals("fileName")) {
                                                            break;
                                                        }
                                                        newPullParser.next();
                                                        firmwareInfo.setFileName(newPullParser.getText());
                                                        break;
                                                    }
                                                    newPullParser.next();
                                                    firmwareInfo.setVersion(newPullParser.getText());
                                                    break;
                                                }
                                                newPullParser.next();
                                                firmwareInfo.setSort(Integer.valueOf(newPullParser.getText()).intValue());
                                                break;
                                            }
                                            newPullParser.next();
                                            firmwareInfo.setInputTime(newPullParser.getText());
                                            break;
                                        }
                                        newPullParser.next();
                                        firmwareInfo.setIsLowVersion(Integer.valueOf(newPullParser.getText()).intValue());
                                        break;
                                    }
                                    newPullParser.next();
                                    firmwareInfo.setStatus(newPullParser.getText());
                                    break;
                                }
                                newPullParser.next();
                                firmwareInfo.setSysName(newPullParser.getText());
                                break;
                            }
                            newPullParser.next();
                            firmwareInfo.setModel(Integer.valueOf(newPullParser.getText()).intValue());
                            break;
                        }
                        newPullParser.next();
                        firmwareInfo.setSysId(Integer.valueOf(newPullParser.getText()).intValue());
                        break;
                    }
                    firmwareInfo = new FirmwareInfo();
                    break;
                case 3:
                    if (!newPullParser.getName().equals("firmware")) {
                        break;
                    }
                    list.add(firmwareInfo);
                    firmwareInfo = null;
                    break;
                default:
                    break;
            }
        }
        return list;
    }
}
