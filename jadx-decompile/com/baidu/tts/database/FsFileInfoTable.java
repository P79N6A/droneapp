package com.baidu.tts.database;

import com.baidu.tts.tools.SqlTool;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

public class FsFileInfoTable {

    public enum Field {
        ABS_PATH("absPath", "varchar primary key"),
        STATE(XiaomiOAuthConstants.EXTRA_STATE_2, "integer");
        
        private final String c;
        private final String d;

        private Field(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public String getColumnName() {
            return this.c;
        }

        public String getDataType() {
            return this.d;
        }
    }

    public static String a() {
        return SqlTool.sqlCreateTable("fsFileInfo", Field.values());
    }

    public static String b() {
        return SqlTool.sqlDropTable("fsFileInfo");
    }
}
