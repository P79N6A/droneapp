package com.fimi.soul.media.player.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface CalledByNative
{
  String value() default "";
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/annotations/CalledByNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */