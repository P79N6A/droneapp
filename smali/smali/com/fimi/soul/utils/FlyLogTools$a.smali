.class Lcom/fimi/soul/utils/FlyLogTools$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/utils/FlyLogTools;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/utils/FlyLogTools;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/utils/FlyLogTools;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/FlyLogTools$a;->a:Lcom/fimi/soul/utils/FlyLogTools;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/fimi/soul/utils/FlyLogTools$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 2

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/FlyLogTools$a;->a:Lcom/fimi/soul/utils/FlyLogTools;

    iget-object v0, v0, Lcom/fimi/soul/utils/FlyLogTools;->b:Lcom/fimi/soul/utils/t;

    if-eqz v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/fimi/soul/utils/FlyLogTools$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/utils/FlyLogTools$a;->a:Lcom/fimi/soul/utils/FlyLogTools;

    iget-object v0, v0, Lcom/fimi/soul/utils/FlyLogTools;->b:Lcom/fimi/soul/utils/t;

    iget-object v1, p0, Lcom/fimi/soul/utils/FlyLogTools$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/utils/t;->b(Ljava/lang/String;)Z

    goto :goto_0
.end method
