.class public Lcom/xiaomi/mistatistic/sdk/data/e;
.super Lcom/xiaomi/mistatistic/sdk/data/a;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/xiaomi/mistatistic/sdk/data/a;-><init>()V

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/xiaomi/mistatistic/sdk/data/h;
    .locals 4

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/h;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/data/h;-><init>()V

    iget-object v1, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->c:Ljava/lang/String;

    iget-wide v2, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->a:J

    iput-wide v2, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->b:J

    iget-object v1, p0, Lcom/xiaomi/mistatistic/sdk/data/e;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->e:Ljava/lang/String;

    const-string v1, "property"

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->d:Ljava/lang/String;

    return-object v0
.end method
