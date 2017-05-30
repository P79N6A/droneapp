package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@aaa
@TargetApi(14)
public class w
  extends Thread
  implements SurfaceTexture.OnFrameAvailableListener, v.a
{
  private static final float[] a = { -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F };
  private volatile boolean A;
  private volatile boolean B;
  private final v b;
  private final float[] c;
  private final float[] d;
  private final float[] e;
  private final float[] f;
  private final float[] g;
  private final float[] h;
  private final float[] i;
  private float j;
  private float k;
  private float l;
  private int m;
  private int n;
  private SurfaceTexture o;
  private SurfaceTexture p;
  private int q;
  private int r;
  private int s;
  private FloatBuffer t = ByteBuffer.allocateDirect(a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
  private final CountDownLatch u;
  private final Object v;
  private EGL10 w;
  private EGLDisplay x;
  private EGLContext y;
  private EGLSurface z;
  
  public w(Context paramContext)
  {
    super("SphericalVideoProcessor");
    this.t.put(a).position(0);
    this.c = new float[9];
    this.d = new float[9];
    this.e = new float[9];
    this.f = new float[9];
    this.g = new float[9];
    this.h = new float[9];
    this.i = new float[9];
    this.j = NaN.0F;
    this.b = new v(paramContext);
    this.b.a(this);
    this.u = new CountDownLatch(1);
    this.v = new Object();
  }
  
  private float a(float[] paramArrayOfFloat)
  {
    paramArrayOfFloat = a(paramArrayOfFloat, new float[] { 0.0F, 1.0F, 0.0F });
    return (float)Math.atan2(paramArrayOfFloat[1], paramArrayOfFloat[0]) - 1.5707964F;
  }
  
  private int a(int paramInt, String paramString)
  {
    int i1 = GLES20.glCreateShader(paramInt);
    a("createShader");
    if (i1 != 0)
    {
      GLES20.glShaderSource(i1, paramString);
      a("shaderSource");
      GLES20.glCompileShader(i1);
      a("compileShader");
      paramString = new int[1];
      GLES20.glGetShaderiv(i1, 35713, paramString, 0);
      a("getShaderiv");
      if (paramString[0] == 0)
      {
        Log.e("SphericalVideoRenderer", 37 + "Could not compile shader " + paramInt + ":");
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(i1));
        GLES20.glDeleteShader(i1);
        a("deleteShader");
        return 0;
      }
    }
    return i1;
  }
  
  private void a(String paramString)
  {
    int i1 = GLES20.glGetError();
    if (i1 != 0) {
      Log.e("SphericalVideoRenderer", String.valueOf(paramString).length() + 21 + paramString + ": glError " + i1);
    }
  }
  
  private void a(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = 0.0F;
    paramArrayOfFloat[4] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[5] = ((float)-Math.sin(paramFloat));
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = ((float)Math.sin(paramFloat));
    paramArrayOfFloat[8] = ((float)Math.cos(paramFloat));
  }
  
  private void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[1] * paramArrayOfFloat3[3] + paramArrayOfFloat2[2] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[1] + paramArrayOfFloat2[1] * paramArrayOfFloat3[4] + paramArrayOfFloat2[2] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[2] + paramArrayOfFloat2[1] * paramArrayOfFloat3[5] + paramArrayOfFloat2[2] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[3] + paramArrayOfFloat2[5] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[4] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[1] + paramArrayOfFloat2[4] * paramArrayOfFloat3[4] + paramArrayOfFloat2[5] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[5] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[2] + paramArrayOfFloat2[4] * paramArrayOfFloat3[5] + paramArrayOfFloat2[5] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[6] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[3] + paramArrayOfFloat2[8] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[7] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[7] * paramArrayOfFloat3[4] + paramArrayOfFloat2[8] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[8] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[2] + paramArrayOfFloat2[7] * paramArrayOfFloat3[5] + paramArrayOfFloat2[8] * paramArrayOfFloat3[8]);
  }
  
  private float[] a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    return new float[] { paramArrayOfFloat1[0] * paramArrayOfFloat2[0] + paramArrayOfFloat1[1] * paramArrayOfFloat2[1] + paramArrayOfFloat1[2] * paramArrayOfFloat2[2], paramArrayOfFloat1[3] * paramArrayOfFloat2[0] + paramArrayOfFloat1[4] * paramArrayOfFloat2[1] + paramArrayOfFloat1[5] * paramArrayOfFloat2[2], paramArrayOfFloat1[6] * paramArrayOfFloat2[0] + paramArrayOfFloat1[7] * paramArrayOfFloat2[1] + paramArrayOfFloat1[8] * paramArrayOfFloat2[2] };
  }
  
  private void b(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[1] = ((float)-Math.sin(paramFloat));
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = ((float)Math.sin(paramFloat));
    paramArrayOfFloat[4] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[5] = 0.0F;
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = 0.0F;
    paramArrayOfFloat[8] = 1.0F;
  }
  
  private void h()
  {
    GLES20.glViewport(0, 0, this.n, this.m);
    a("viewport");
    int i1 = GLES20.glGetUniformLocation(this.q, "uFOVx");
    int i2 = GLES20.glGetUniformLocation(this.q, "uFOVy");
    if (this.n > this.m)
    {
      GLES20.glUniform1f(i1, 0.87266463F);
      GLES20.glUniform1f(i2, this.m * 0.87266463F / this.n);
      return;
    }
    GLES20.glUniform1f(i1, this.n * 0.87266463F / this.m);
    GLES20.glUniform1f(i2, 0.87266463F);
  }
  
  private int i()
  {
    int i1 = a(35633, k());
    if (i1 == 0) {}
    int i2;
    do
    {
      return 0;
      i2 = a(35632, l());
    } while (i2 == 0);
    int i3 = GLES20.glCreateProgram();
    a("createProgram");
    if (i3 != 0)
    {
      GLES20.glAttachShader(i3, i1);
      a("attachShader");
      GLES20.glAttachShader(i3, i2);
      a("attachShader");
      GLES20.glLinkProgram(i3);
      a("linkProgram");
      int[] arrayOfInt = new int[1];
      GLES20.glGetProgramiv(i3, 35714, arrayOfInt, 0);
      a("getProgramiv");
      if (arrayOfInt[0] != 1)
      {
        Log.e("SphericalVideoRenderer", "Could not link program: ");
        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(i3));
        GLES20.glDeleteProgram(i3);
        a("deleteProgram");
        return 0;
      }
      GLES20.glValidateProgram(i3);
      a("validateProgram");
    }
    return i3;
  }
  
  @Nullable
  private EGLConfig j()
  {
    int[] arrayOfInt = new int[1];
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    if (!this.w.eglChooseConfig(this.x, new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344 }, arrayOfEGLConfig, 1, arrayOfInt)) {
      return null;
    }
    if (arrayOfInt[0] > 0) {
      return arrayOfEGLConfig[0];
    }
    return null;
  }
  
  private String k()
  {
    ub localub = uf.aD;
    if (!((String)localub.c()).equals(localub.b())) {
      return (String)localub.c();
    }
    return "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
  }
  
  private String l()
  {
    ub localub = uf.aE;
    if (!((String)localub.c()).equals(localub.b())) {
      return (String)localub.c();
    }
    return "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
  }
  
  public void a()
  {
    synchronized (this.v)
    {
      this.v.notifyAll();
      return;
    }
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    float f1;
    if (this.n > this.m)
    {
      paramFloat1 = 1.7453293F * paramFloat1 / this.n;
      f1 = 1.7453293F * paramFloat2 / this.n;
      paramFloat2 = paramFloat1;
      paramFloat1 = f1;
    }
    for (;;)
    {
      this.k -= paramFloat2;
      this.l -= paramFloat1;
      if (this.l < -1.5707964F) {
        this.l = -1.5707964F;
      }
      if (this.l > 1.5707964F) {
        this.l = 1.5707964F;
      }
      return;
      f1 = 1.7453293F * paramFloat1 / this.m;
      paramFloat1 = 1.7453293F * paramFloat2 / this.m;
      paramFloat2 = f1;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    synchronized (this.v)
    {
      this.n = paramInt1;
      this.m = paramInt2;
      this.A = true;
      this.v.notifyAll();
      return;
    }
  }
  
  public void a(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.n = paramInt1;
    this.m = paramInt2;
    this.p = paramSurfaceTexture;
  }
  
  public void b()
  {
    synchronized (this.v)
    {
      this.B = true;
      this.p = null;
      this.v.notifyAll();
      return;
    }
  }
  
  public SurfaceTexture c()
  {
    if (this.p == null) {
      return null;
    }
    try
    {
      this.u.await();
      return this.o;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  void d()
  {
    while (this.s > 0)
    {
      this.o.updateTexImage();
      this.s -= 1;
    }
    if (this.b.b(this.c))
    {
      if (Float.isNaN(this.j)) {
        this.j = (-a(this.c));
      }
      b(this.h, this.j + this.k);
    }
    for (;;)
    {
      a(this.d, 1.5707964F);
      a(this.e, this.h, this.d);
      a(this.f, this.c, this.e);
      a(this.g, this.l);
      a(this.i, this.g, this.f);
      GLES20.glUniformMatrix3fv(this.r, 1, false, this.i, 0);
      GLES20.glDrawArrays(5, 0, 4);
      a("drawArrays");
      GLES20.glFinish();
      this.w.eglSwapBuffers(this.x, this.z);
      return;
      a(this.c, -1.5707964F);
      b(this.h, this.k);
    }
  }
  
  int e()
  {
    this.q = i();
    GLES20.glUseProgram(this.q);
    a("useProgram");
    int i1 = GLES20.glGetAttribLocation(this.q, "aPosition");
    GLES20.glVertexAttribPointer(i1, 3, 5126, false, 12, this.t);
    a("vertexAttribPointer");
    GLES20.glEnableVertexAttribArray(i1);
    a("enableVertexAttribArray");
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    a("genTextures");
    i1 = arrayOfInt[0];
    GLES20.glBindTexture(36197, i1);
    a("bindTextures");
    GLES20.glTexParameteri(36197, 10240, 9729);
    a("texParameteri");
    GLES20.glTexParameteri(36197, 10241, 9729);
    a("texParameteri");
    GLES20.glTexParameteri(36197, 10242, 33071);
    a("texParameteri");
    GLES20.glTexParameteri(36197, 10243, 33071);
    a("texParameteri");
    this.r = GLES20.glGetUniformLocation(this.q, "uVMat");
    GLES20.glUniformMatrix3fv(this.r, 1, false, new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F }, 0);
    return i1;
  }
  
  boolean f()
  {
    this.w = ((EGL10)EGLContext.getEGL());
    this.x = this.w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    if (this.x == EGL10.EGL_NO_DISPLAY) {
      return false;
    }
    Object localObject = new int[2];
    if (!this.w.eglInitialize(this.x, (int[])localObject)) {
      return false;
    }
    localObject = j();
    if (localObject == null) {
      return false;
    }
    this.y = this.w.eglCreateContext(this.x, (EGLConfig)localObject, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
    if ((this.y == null) || (this.y == EGL10.EGL_NO_CONTEXT)) {
      return false;
    }
    this.z = this.w.eglCreateWindowSurface(this.x, (EGLConfig)localObject, this.p, null);
    if ((this.z == null) || (this.z == EGL10.EGL_NO_SURFACE)) {
      return false;
    }
    return this.w.eglMakeCurrent(this.x, this.z, this.z, this.y);
  }
  
  boolean g()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.z != null)
    {
      bool1 = bool2;
      if (this.z != EGL10.EGL_NO_SURFACE)
      {
        bool1 = this.w.eglMakeCurrent(this.x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false | this.w.eglDestroySurface(this.x, this.z);
        this.z = null;
      }
    }
    bool2 = bool1;
    if (this.y != null)
    {
      bool2 = bool1 | this.w.eglDestroyContext(this.x, this.y);
      this.y = null;
    }
    bool1 = bool2;
    if (this.x != null)
    {
      bool1 = bool2 | this.w.eglTerminate(this.x);
      this.x = null;
    }
    return bool1;
  }
  
  public void onFrameAvailable(SurfaceTexture arg1)
  {
    this.s += 1;
    synchronized (this.v)
    {
      this.v.notifyAll();
      return;
    }
  }
  
  public void run()
  {
    int i1 = 1;
    if (this.p == null)
    {
      abr.b("SphericalVideoProcessor started with no output texture.");
      this.u.countDown();
      return;
    }
    boolean bool = f();
    int i2 = e();
    if (this.q != 0)
    {
      if ((bool) && (i1 != 0)) {
        break label139;
      }
      ??? = String.valueOf(GLUtils.getEGLErrorString(this.w.eglGetError()));
      if (((String)???).length() == 0) {
        break label124;
      }
    }
    label124:
    for (??? = "EGL initialization failed: ".concat((String)???);; ??? = new String("EGL initialization failed: "))
    {
      abr.b((String)???);
      u.i().a(new Throwable((String)???), "SphericalVideoProcessor.run.1");
      g();
      this.u.countDown();
      return;
      i1 = 0;
      break;
    }
    label139:
    this.o = new SurfaceTexture(i2);
    this.o.setOnFrameAvailableListener(this);
    this.u.countDown();
    this.b.b();
    try
    {
      this.A = true;
      for (;;)
      {
        if (!this.B)
        {
          d();
          if (this.A)
          {
            h();
            this.A = false;
          }
          try
          {
            synchronized (this.v)
            {
              if ((!this.B) && (!this.A) && (this.s == 0)) {
                this.v.wait();
              }
            }
          }
          catch (InterruptedException localInterruptedException) {}
        }
      }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      abr.d("SphericalVideoProcessor halted unexpectedly.");
      return;
    }
    catch (Throwable localThrowable)
    {
      abr.b("SphericalVideoProcessor died.", localThrowable);
      u.i().a(localThrowable, "SphericalVideoProcessor.run.2");
      return;
    }
    finally
    {
      this.b.c();
      this.o.setOnFrameAvailableListener(null);
      this.o = null;
      g();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */