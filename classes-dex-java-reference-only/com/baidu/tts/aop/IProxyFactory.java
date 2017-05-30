package com.baidu.tts.aop;

import java.util.List;

public abstract interface IProxyFactory<T>
{
  public abstract IInterceptorHandler createInterceptorHandler();
  
  public abstract List<IInterceptor> createInterceptors();
  
  public abstract T createProxied();
  
  public abstract T makeProxy();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/aop/IProxyFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */