.class public Lcom/google/android/gms/gcm/OneoffTask$a;
.super Lcom/google/android/gms/gcm/Task$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/gcm/OneoffTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private i:J

.field private j:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0}, Lcom/google/android/gms/gcm/Task$a;-><init>()V

    iput-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->i:J

    iput-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->e:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/gcm/OneoffTask$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->i:J

    return-wide v0
.end method

.method static synthetic b(Lcom/google/android/gms/gcm/OneoffTask$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    return-wide v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->a:I

    return-object p0
.end method

.method public a(JJ)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->i:J

    iput-wide p3, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    return-object p0
.end method

.method public a(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->h:Landroid/os/Bundle;

    return-object p0
.end method

.method public a(Ljava/lang/Class;)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/gcm/GcmTaskService;",
            ">;)",
            "Lcom/google/android/gms/gcm/OneoffTask$a;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->f:Z

    return-object p0
.end method

.method protected a()V
    .locals 4

    const-wide/16 v2, -0x1

    invoke-super {p0}, Lcom/google/android/gms/gcm/Task$a;->a()V

    iget-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->i:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must specify an execution window using setExecutionWindow."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->i:J

    iget-wide v2, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Window start must be shorter than window end."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public b(Z)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->e:Z

    return-object p0
.end method

.method public b()Lcom/google/android/gms/gcm/OneoffTask;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/gcm/OneoffTask$a;->a()V

    new-instance v0, Lcom/google/android/gms/gcm/OneoffTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/gcm/OneoffTask;-><init>(Lcom/google/android/gms/gcm/OneoffTask$a;Lcom/google/android/gms/gcm/OneoffTask$1;)V

    return-object v0
.end method

.method public synthetic b(I)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->a(I)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->a(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Class;)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->a(Ljava/lang/Class;)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/String;)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->a(Ljava/lang/String;)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Lcom/google/android/gms/gcm/OneoffTask$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/gcm/OneoffTask$a;->d:Z

    return-object p0
.end method

.method public synthetic c()Lcom/google/android/gms/gcm/Task;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/gcm/OneoffTask$a;->b()Lcom/google/android/gms/gcm/OneoffTask;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Z)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->b(Z)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e(Z)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->c(Z)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic f(Z)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/OneoffTask$a;->a(Z)Lcom/google/android/gms/gcm/OneoffTask$a;

    move-result-object v0

    return-object v0
.end method
