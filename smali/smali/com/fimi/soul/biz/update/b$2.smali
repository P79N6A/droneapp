.class Lcom/fimi/soul/biz/update/b$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/market/sdk/XiaomiUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/update/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b$2;->a:Lcom/fimi/soul/biz/update/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onUpdateReturned(ILcom/xiaomi/market/sdk/UpdateResponse;)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$2;->a:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->c(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$a;

    move-result-object v0

    iget v1, p2, Lcom/xiaomi/market/sdk/UpdateResponse;->versionCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/biz/update/b$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
