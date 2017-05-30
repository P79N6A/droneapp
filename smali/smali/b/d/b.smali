.class public Lb/d/b;
.super Lb/c/a;


# static fields
.field public static final e:I = 0x0

.field public static final f:I = 0x1

.field public static final g:I = 0x2


# instance fields
.field private h:Lb/d/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {p0, v0}, Lb/d/b;-><init>(Ljava/io/PrintStream;)V

    return-void
.end method

.method public constructor <init>(Lb/d/a;)V
    .locals 0

    invoke-direct {p0}, Lb/c/a;-><init>()V

    iput-object p1, p0, Lb/d/b;->h:Lb/d/a;

    return-void
.end method

.method public constructor <init>(Ljava/io/PrintStream;)V
    .locals 1

    new-instance v0, Lb/d/a;

    invoke-direct {v0, p1}, Lb/d/a;-><init>(Ljava/io/PrintStream;)V

    invoke-direct {p0, v0}, Lb/d/b;-><init>(Lb/d/a;)V

    return-void
.end method

.method public static a(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lb/b/j;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lb/b/n;

    invoke-direct {v0, p0}, Lb/b/n;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Lb/d/b;->c(Lb/b/i;)Lb/b/m;

    return-void
.end method

.method public static b([Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lb/d/b;

    invoke-direct {v0}, Lb/d/b;-><init>()V

    :try_start_0
    invoke-virtual {v0, p0}, Lb/d/b;->c([Ljava/lang/String;)Lb/b/m;

    move-result-object v0

    invoke-virtual {v0}, Lb/b/m;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    goto :goto_0
.end method

.method public static c(Lb/b/i;)Lb/b/m;
    .locals 1

    new-instance v0, Lb/d/b;

    invoke-direct {v0}, Lb/d/b;-><init>()V

    invoke-virtual {v0, p0}, Lb/d/b;->e(Lb/b/i;)Lb/b/m;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lb/b/i;)V
    .locals 2

    new-instance v0, Lb/d/b;

    invoke-direct {v0}, Lb/d/b;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lb/d/b;->a(Lb/b/i;Z)Lb/b/m;

    return-void
.end method


# virtual methods
.method public a(Lb/b/i;Z)Lb/b/m;
    .locals 6

    invoke-virtual {p0}, Lb/d/b;->f()Lb/b/m;

    move-result-object v0

    iget-object v1, p0, Lb/d/b;->h:Lb/d/a;

    invoke-virtual {v0, v1}, Lb/b/m;->a(Lb/b/l;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p1, v0}, Lb/b/i;->a(Lb/b/m;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    iget-object v1, p0, Lb/d/b;->h:Lb/d/a;

    invoke-virtual {v1, v0, v2, v3}, Lb/d/a;->a(Lb/b/m;J)V

    invoke-virtual {p0, p2}, Lb/d/b;->b(Z)V

    return-object v0
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;Z)Lb/b/m;
    .locals 2

    invoke-virtual {p0, p1}, Lb/d/b;->g(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lb/b/j;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p2}, Lb/b/n;->a(Ljava/lang/Class;Ljava/lang/String;)Lb/b/i;

    move-result-object v0

    invoke-virtual {p0, v0, p3}, Lb/d/b;->a(Lb/b/i;Z)Lb/b/m;

    move-result-object v0

    return-object v0
.end method

.method public a(ILb/b/i;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public a(Lb/d/a;)V
    .locals 0

    iput-object p1, p0, Lb/d/b;->h:Lb/d/a;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected b(Z)V
    .locals 1

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lb/d/b;->h:Lb/d/a;

    invoke-virtual {v0}, Lb/d/a;->a()V

    :try_start_0
    sget-object v0, Ljava/lang/System;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c([Ljava/lang/String;)Lb/b/m;
    .locals 8

    const/4 v4, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v4

    move v1, v4

    :goto_0
    array-length v5, p1

    if-ge v0, v5, :cond_4

    aget-object v5, p1, v0

    const-string v6, "-wait"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v1, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    aget-object v5, p1, v0

    const-string v6, "-c"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    add-int/lit8 v0, v0, 0x1

    aget-object v3, p1, v0

    invoke-virtual {p0, v3}, Lb/d/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    aget-object v5, p1, v0

    const-string v6, "-m"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    add-int/lit8 v0, v0, 0x1

    aget-object v2, p1, v0

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    aget-object v5, p1, v0

    const-string v6, "-v"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "JUnit "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Lb/c/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " by Kent Beck and Erich Gamma"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    aget-object v3, p1, v0

    goto :goto_1

    :cond_4
    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :try_start_0
    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0, v3, v2, v1}, Lb/d/b;->a(Ljava/lang/String;Ljava/lang/String;Z)Lb/b/m;

    move-result-object v0

    :goto_2
    return-object v0

    :cond_6
    invoke-virtual {p0, v3}, Lb/d/b;->c(Ljava/lang/String;)Lb/b/i;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lb/d/b;->a(Lb/b/i;Z)Lb/b/m;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create and run test suite: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public e(Lb/b/i;)Lb/b/m;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lb/d/b;->a(Lb/b/i;Z)Lb/b/m;

    move-result-object v0

    return-object v0
.end method

.method protected f()Lb/b/m;
    .locals 1

    new-instance v0, Lb/b/m;

    invoke-direct {v0}, Lb/b/m;-><init>()V

    return-object v0
.end method

.method protected f(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method
