package com.baidu.tts.client.model;

import com.baidu.tts.tools.StringTool;
import java.util.HashSet;
import java.util.Set;

public class AvailableConditions {
    private Set<String> a;
    private Set<String> b;

    public void appendGender(String str) {
        if (!StringTool.isEmpty(str)) {
            if (this.a == null) {
                this.a = new HashSet();
            }
            this.a.add(str);
        }
    }

    public void appendSpeaker(String str) {
        if (!StringTool.isEmpty(str)) {
            if (this.b == null) {
                this.b = new HashSet();
            }
            this.b.add(str);
        }
    }

    public Set<String> getGenders() {
        return this.a;
    }

    public Set<String> getSpeakers() {
        return this.b;
    }

    public void setGenders(Set<String> set) {
        this.a = set;
    }

    public void setSpeakers(Set<String> set) {
        this.b = set;
    }
}
