package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import org.codehaus.jackson.map.util.Annotations;

public final class AnnotationMap implements Annotations {
    protected HashMap<Class<? extends Annotation>, Annotation> _annotations;

    protected final void _add(Annotation annotation) {
        if (this._annotations == null) {
            this._annotations = new HashMap();
        }
        this._annotations.put(annotation.annotationType(), annotation);
    }

    public void add(Annotation annotation) {
        _add(annotation);
    }

    public void addIfNotPresent(Annotation annotation) {
        if (this._annotations == null || !this._annotations.containsKey(annotation.annotationType())) {
            _add(annotation);
        }
    }

    public <A extends Annotation> A get(Class<A> cls) {
        return this._annotations == null ? null : (Annotation) this._annotations.get(cls);
    }

    public int size() {
        return this._annotations == null ? 0 : this._annotations.size();
    }

    public String toString() {
        return this._annotations == null ? "[null]" : this._annotations.toString();
    }
}
