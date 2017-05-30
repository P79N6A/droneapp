package org.codehaus.jackson.map;

import java.text.DateFormat;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.type.TypeFactory;

public class MapperConfig$Base {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final ClassIntrospector<? extends BeanDescription> _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final HandlerInstantiator _handlerInstantiator;
    protected final PropertyNamingStrategy _propertyNamingStrategy;
    protected final TypeFactory _typeFactory;
    protected final TypeResolverBuilder<?> _typeResolverBuilder;
    protected final VisibilityChecker<?> _visibilityChecker;

    public MapperConfig$Base(ClassIntrospector<? extends BeanDescription> classIntrospector, AnnotationIntrospector annotationIntrospector, VisibilityChecker<?> visibilityChecker, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, TypeResolverBuilder<?> typeResolverBuilder, DateFormat dateFormat, HandlerInstantiator handlerInstantiator) {
        this._classIntrospector = classIntrospector;
        this._annotationIntrospector = annotationIntrospector;
        this._visibilityChecker = visibilityChecker;
        this._propertyNamingStrategy = propertyNamingStrategy;
        this._typeFactory = typeFactory;
        this._typeResolverBuilder = typeResolverBuilder;
        this._dateFormat = dateFormat;
        this._handlerInstantiator = handlerInstantiator;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public ClassIntrospector<? extends BeanDescription> getClassIntrospector() {
        return this._classIntrospector;
    }

    public DateFormat getDateFormat() {
        return this._dateFormat;
    }

    public HandlerInstantiator getHandlerInstantiator() {
        return this._handlerInstantiator;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._propertyNamingStrategy;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public TypeResolverBuilder<?> getTypeResolverBuilder() {
        return this._typeResolverBuilder;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._visibilityChecker;
    }

    public MapperConfig$Base withAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return new MapperConfig$Base(this._classIntrospector, annotationIntrospector, this._visibilityChecker, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator);
    }

    public MapperConfig$Base withClassIntrospector(ClassIntrospector<? extends BeanDescription> classIntrospector) {
        return new MapperConfig$Base(classIntrospector, this._annotationIntrospector, this._visibilityChecker, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator);
    }

    public MapperConfig$Base withDateFormat(DateFormat dateFormat) {
        return new MapperConfig$Base(this._classIntrospector, this._annotationIntrospector, this._visibilityChecker, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormat, this._handlerInstantiator);
    }

    public MapperConfig$Base withHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        return new MapperConfig$Base(this._classIntrospector, this._annotationIntrospector, this._visibilityChecker, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, handlerInstantiator);
    }

    public MapperConfig$Base withPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        return new MapperConfig$Base(this._classIntrospector, this._annotationIntrospector, this._visibilityChecker, propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator);
    }

    public MapperConfig$Base withTypeFactory(TypeFactory typeFactory) {
        return new MapperConfig$Base(this._classIntrospector, this._annotationIntrospector, this._visibilityChecker, this._propertyNamingStrategy, typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator);
    }

    public MapperConfig$Base withTypeResolverBuilder(TypeResolverBuilder<?> typeResolverBuilder) {
        return new MapperConfig$Base(this._classIntrospector, this._annotationIntrospector, this._visibilityChecker, this._propertyNamingStrategy, this._typeFactory, typeResolverBuilder, this._dateFormat, this._handlerInstantiator);
    }

    public MapperConfig$Base withVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        return new MapperConfig$Base(this._classIntrospector, this._annotationIntrospector, visibilityChecker, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator);
    }
}
