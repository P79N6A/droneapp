.class public Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I

.field b:I

.field private final c:I

.field private d:Lcom/google/android/gms/fitness/data/DataSource;

.field private e:Lcom/google/android/gms/fitness/data/DataType;

.field private f:Lcom/google/android/gms/fitness/data/y;

.field private final g:J

.field private final h:J

.field private final i:Landroid/app/PendingIntent;

.field private final j:J

.field private final k:I

.field private final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final m:J

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/internal/ClientIdentity;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lcom/google/android/gms/internal/alq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/am;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/am;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/os/IBinder;IIJJLandroid/app/PendingIntent;JILjava/util/List;JLandroid/os/IBinder;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            "Landroid/os/IBinder;",
            "IIJJ",
            "Landroid/app/PendingIntent;",
            "JI",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;J",
            "Landroid/os/IBinder;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->c:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    if-nez p4, :cond_2

    const/4 v2, 0x0

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->f:Lcom/google/android/gms/fitness/data/y;

    const-wide/16 v2, 0x0

    cmp-long v2, p7, v2

    if-nez v2, :cond_0

    int-to-long p7, p5

    :cond_0
    iput-wide p7, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    move-wide/from16 v0, p12

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    const-wide/16 v2, 0x0

    cmp-long v2, p9, v2

    if-nez v2, :cond_1

    int-to-long p9, p6

    :cond_1
    iput-wide p9, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->l:Ljava/util/List;

    move-object/from16 v0, p11

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->i:Landroid/app/PendingIntent;

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->k:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->n:Ljava/util/List;

    move-wide/from16 v0, p16

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->m:J

    invoke-static/range {p18 .. p18}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->o:Lcom/google/android/gms/internal/alq;

    return-void

    :cond_2
    invoke-static {p4}, Lcom/google/android/gms/fitness/data/y$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/data/y;

    move-result-object v2

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;JJJILjava/util/List;Ljava/util/List;JLcom/google/android/gms/internal/alq;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            "Lcom/google/android/gms/fitness/data/y;",
            "Landroid/app/PendingIntent;",
            "JJJI",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/internal/ClientIdentity;",
            ">;J",
            "Lcom/google/android/gms/internal/alq;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v2, 0x6

    iput v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->c:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->f:Lcom/google/android/gms/fitness/data/y;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->i:Landroid/app/PendingIntent;

    iput-wide p5, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    iput-wide p7, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    iput-wide p9, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    iput p11, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->k:I

    iput-object p12, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->l:Ljava/util/List;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->n:Ljava/util/List;

    move-wide/from16 v0, p14

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->m:J

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->o:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alq;)V
    .locals 20

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/c;->a()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/c;->b()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/request/c;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/request/c;->b(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v10

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/request/c;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/c;->c()I

    move-result v14

    const/4 v15, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/c;->d()J

    move-result-wide v17

    move-object/from16 v3, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v19, p4

    invoke-direct/range {v3 .. v19}, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;JJJILjava/util/List;Ljava/util/List;JLcom/google/android/gms/internal/alq;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->k:I

    iget v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->k:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->l:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->l:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public c()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->i:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->a(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    return-wide v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->l:Ljava/util/List;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->k:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->f:Lcom/google/android/gms/fitness/data/y;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->l:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->m:J

    return-wide v0
.end method

.method public j()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->o:Lcom/google/android/gms/internal/alq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->o:Lcom/google/android/gms/internal/alq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->c:I

    return v0
.end method

.method l()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->f:Lcom/google/android/gms/fitness/data/y;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->f:Lcom/google/android/gms/fitness/data/y;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/data/y;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const-string v0, "SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->e:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->d:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->j:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->h:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/am;->a(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;Landroid/os/Parcel;I)V

    return-void
.end method
