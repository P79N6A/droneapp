.class final Lcom/xiaomi/mistatistic/sdk/a/c;
.super Ljava/io/InputStream;


# instance fields
.field private a:Ljava/io/InputStream;

.field private b:Lcom/xiaomi/mistatistic/sdk/a/a;

.field private c:Lcom/xiaomi/mistatistic/sdk/a/b;

.field private d:I


# direct methods
.method public constructor <init>(Lcom/xiaomi/mistatistic/sdk/a/a;Ljava/io/InputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    iput-object p2, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    return-void
.end method

.method public constructor <init>(Lcom/xiaomi/mistatistic/sdk/a/b;Ljava/io/InputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    iput-object p2, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    return-void
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    invoke-virtual {v0, p1}, Lcom/xiaomi/mistatistic/sdk/a/a;->a(Ljava/lang/Exception;)V

    :cond_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    invoke-virtual {v0, p1}, Lcom/xiaomi/mistatistic/sdk/a/b;->a(Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I

    return v0
.end method

.method public available()I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/a/a;->a()V

    :cond_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/a/b;->a()V

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public mark(I)V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public read([B)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public read([BII)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public declared-synchronized reset()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public skip(J)J
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/c;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/c;->a(Ljava/lang/Exception;)V

    throw v0
.end method
