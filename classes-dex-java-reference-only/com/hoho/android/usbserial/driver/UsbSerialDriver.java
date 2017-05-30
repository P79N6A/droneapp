package com.hoho.android.usbserial.driver;

public abstract interface UsbSerialDriver
{
  public static final int DATABITS_5 = 5;
  public static final int DATABITS_6 = 6;
  public static final int DATABITS_7 = 7;
  public static final int DATABITS_8 = 8;
  public static final int FLOWCONTROL_NONE = 0;
  public static final int FLOWCONTROL_RTSCTS_IN = 1;
  public static final int FLOWCONTROL_RTSCTS_OUT = 2;
  public static final int FLOWCONTROL_XONXOFF_IN = 4;
  public static final int FLOWCONTROL_XONXOFF_OUT = 8;
  public static final int PARITY_EVEN = 2;
  public static final int PARITY_MARK = 3;
  public static final int PARITY_NONE = 0;
  public static final int PARITY_ODD = 1;
  public static final int PARITY_SPACE = 4;
  public static final int STOPBITS_1 = 1;
  public static final int STOPBITS_1_5 = 3;
  public static final int STOPBITS_2 = 2;
  
  public abstract void close();
  
  public abstract boolean getCD();
  
  public abstract boolean getCTS();
  
  public abstract boolean getDSR();
  
  public abstract boolean getDTR();
  
  public abstract boolean getRI();
  
  public abstract boolean getRTS();
  
  public abstract void open();
  
  public abstract boolean purgeHwBuffers(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt);
  
  public abstract void setDTR(boolean paramBoolean);
  
  public abstract void setParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void setRTS(boolean paramBoolean);
  
  public abstract int write(byte[] paramArrayOfByte, int paramInt);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/hoho/android/usbserial/driver/UsbSerialDriver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */