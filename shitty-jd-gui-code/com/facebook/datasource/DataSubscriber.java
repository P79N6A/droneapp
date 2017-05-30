package com.facebook.datasource;

public abstract interface DataSubscriber<T>
{
  public abstract void onCancellation(DataSource<T> paramDataSource);
  
  public abstract void onFailure(DataSource<T> paramDataSource);
  
  public abstract void onNewResult(DataSource<T> paramDataSource);
  
  public abstract void onProgressUpdate(DataSource<T> paramDataSource);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/datasource/DataSubscriber.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */