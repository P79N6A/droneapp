.class Lcom/fimi/soul/utils/ar$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/android/volley/toolbox/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/utils/ar;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/utils/ar;


# direct methods
.method constructor <init>(Lcom/fimi/soul/utils/ar;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ar$2;->a:Lcom/fimi/soul/utils/ar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/toolbox/k$c;Z)V
    .locals 4

    invoke-virtual {p1}, Lcom/android/volley/toolbox/k$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/utils/ar$2;->a:Lcom/fimi/soul/utils/ar;

    invoke-static {v1}, Lcom/fimi/soul/utils/ar;->d(Lcom/fimi/soul/utils/ar;)Lcom/fimi/soul/utils/ar$b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/utils/ar$2;->a:Lcom/fimi/soul/utils/ar;

    invoke-static {v1}, Lcom/fimi/soul/utils/ar;->d(Lcom/fimi/soul/utils/ar;)Lcom/fimi/soul/utils/ar$b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/fimi/soul/utils/ar$b;->a(Landroid/graphics/Bitmap;)V

    :cond_0
    const-class v1, Lcom/fimi/soul/utils/ar;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u83b7\u53d6\u5230\u56fe\u7247\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/fimi/kernel/utils/k;->a(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/android/volley/u;)V
    .locals 0

    return-void
.end method
