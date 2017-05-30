package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;

@JsonAutoDetect(creatorVisibility = Visibility.ANY, fieldVisibility = Visibility.PUBLIC_ONLY, getterVisibility = Visibility.PUBLIC_ONLY, isGetterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.ANY)
public class VisibilityChecker$Std implements VisibilityChecker<VisibilityChecker$Std> {
    protected static final VisibilityChecker$Std DEFAULT = new VisibilityChecker$Std((JsonAutoDetect) VisibilityChecker$Std.class.getAnnotation(JsonAutoDetect.class));
    protected final Visibility _creatorMinLevel;
    protected final Visibility _fieldMinLevel;
    protected final Visibility _getterMinLevel;
    protected final Visibility _isGetterMinLevel;
    protected final Visibility _setterMinLevel;

    public VisibilityChecker$Std(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
        this._getterMinLevel = visibility;
        this._isGetterMinLevel = visibility2;
        this._setterMinLevel = visibility3;
        this._creatorMinLevel = visibility4;
        this._fieldMinLevel = visibility5;
    }

    public VisibilityChecker$Std(JsonAutoDetect jsonAutoDetect) {
        JsonMethod[] value = jsonAutoDetect.value();
        this._getterMinLevel = hasMethod(value, JsonMethod.GETTER) ? jsonAutoDetect.getterVisibility() : Visibility.NONE;
        this._isGetterMinLevel = hasMethod(value, JsonMethod.IS_GETTER) ? jsonAutoDetect.isGetterVisibility() : Visibility.NONE;
        this._setterMinLevel = hasMethod(value, JsonMethod.SETTER) ? jsonAutoDetect.setterVisibility() : Visibility.NONE;
        this._creatorMinLevel = hasMethod(value, JsonMethod.CREATOR) ? jsonAutoDetect.creatorVisibility() : Visibility.NONE;
        this._fieldMinLevel = hasMethod(value, JsonMethod.FIELD) ? jsonAutoDetect.fieldVisibility() : Visibility.NONE;
    }

    public static VisibilityChecker$Std defaultInstance() {
        return DEFAULT;
    }

    private static boolean hasMethod(JsonMethod[] jsonMethodArr, JsonMethod jsonMethod) {
        for (JsonMethod jsonMethod2 : jsonMethodArr) {
            if (jsonMethod2 == jsonMethod || jsonMethod2 == JsonMethod.ALL) {
                return true;
            }
        }
        return false;
    }

    public boolean isCreatorVisible(Member member) {
        return this._creatorMinLevel.isVisible(member);
    }

    public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
        return isCreatorVisible(annotatedMember.getMember());
    }

    public boolean isFieldVisible(Field field) {
        return this._fieldMinLevel.isVisible(field);
    }

    public boolean isFieldVisible(AnnotatedField annotatedField) {
        return isFieldVisible(annotatedField.getAnnotated());
    }

    public boolean isGetterVisible(Method method) {
        return this._getterMinLevel.isVisible(method);
    }

    public boolean isGetterVisible(AnnotatedMethod annotatedMethod) {
        return isGetterVisible(annotatedMethod.getAnnotated());
    }

    public boolean isIsGetterVisible(Method method) {
        return this._isGetterMinLevel.isVisible(method);
    }

    public boolean isIsGetterVisible(AnnotatedMethod annotatedMethod) {
        return isIsGetterVisible(annotatedMethod.getAnnotated());
    }

    public boolean isSetterVisible(Method method) {
        return this._setterMinLevel.isVisible(method);
    }

    public boolean isSetterVisible(AnnotatedMethod annotatedMethod) {
        return isSetterVisible(annotatedMethod.getAnnotated());
    }

    public String toString() {
        return "[Visibility:" + " getter: " + this._getterMinLevel + ", isGetter: " + this._isGetterMinLevel + ", setter: " + this._setterMinLevel + ", creator: " + this._creatorMinLevel + ", field: " + this._fieldMinLevel + "]";
    }

    public VisibilityChecker$Std with(JsonAutoDetect jsonAutoDetect) {
        if (jsonAutoDetect == null) {
            return this;
        }
        JsonMethod[] value = jsonAutoDetect.value();
        return withGetterVisibility(hasMethod(value, JsonMethod.GETTER) ? jsonAutoDetect.getterVisibility() : Visibility.NONE).withIsGetterVisibility(hasMethod(value, JsonMethod.IS_GETTER) ? jsonAutoDetect.isGetterVisibility() : Visibility.NONE).withSetterVisibility(hasMethod(value, JsonMethod.SETTER) ? jsonAutoDetect.setterVisibility() : Visibility.NONE).withCreatorVisibility(hasMethod(value, JsonMethod.CREATOR) ? jsonAutoDetect.creatorVisibility() : Visibility.NONE).withFieldVisibility(hasMethod(value, JsonMethod.FIELD) ? jsonAutoDetect.fieldVisibility() : Visibility.NONE);
    }

    public VisibilityChecker$Std withCreatorVisibility(Visibility visibility) {
        Visibility visibility2 = visibility == Visibility.DEFAULT ? DEFAULT._creatorMinLevel : visibility;
        return this._creatorMinLevel == visibility2 ? this : new VisibilityChecker$Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, visibility2, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withFieldVisibility(Visibility visibility) {
        Visibility visibility2 = visibility == Visibility.DEFAULT ? DEFAULT._fieldMinLevel : visibility;
        return this._fieldMinLevel == visibility2 ? this : new VisibilityChecker$Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, visibility2);
    }

    public VisibilityChecker$Std withGetterVisibility(Visibility visibility) {
        Visibility visibility2 = visibility == Visibility.DEFAULT ? DEFAULT._getterMinLevel : visibility;
        return this._getterMinLevel == visibility2 ? this : new VisibilityChecker$Std(visibility2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withIsGetterVisibility(Visibility visibility) {
        Visibility visibility2 = visibility == Visibility.DEFAULT ? DEFAULT._isGetterMinLevel : visibility;
        return this._isGetterMinLevel == visibility2 ? this : new VisibilityChecker$Std(this._getterMinLevel, visibility2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withSetterVisibility(Visibility visibility) {
        Visibility visibility2 = visibility == Visibility.DEFAULT ? DEFAULT._setterMinLevel : visibility;
        return this._setterMinLevel == visibility2 ? this : new VisibilityChecker$Std(this._getterMinLevel, this._isGetterMinLevel, visibility2, this._creatorMinLevel, this._fieldMinLevel);
    }
}
