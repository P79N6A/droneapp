.class Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/module/flyplannermedia/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->b(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/fimi/soul/module/flyplannermedia/a$a",
        "<",
        "Lcom/fimi/soul/biz/camera/entity/X11FileInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/biz/camera/entity/X11FileInfo;)Z
    .locals 7

    const/4 v6, 0x1

    invoke-virtual {p1}, Lcom/fimi/soul/biz/camera/entity/X11FileInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/entity/WifiDistanceFile;->getFileType(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-static {v1}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->e(Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;)I

    if-ne v0, v6, :cond_0

    invoke-static {p1}, Lcom/fimi/soul/biz/camera/b;->a(Lcom/fimi/soul/biz/camera/entity/X11FileInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/biz/camera/b;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "file://%s"

    new-array v3, v6, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v1}, Lcom/fimi/soul/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-static {v2, p1, v1}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->a(Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;Lcom/fimi/soul/biz/camera/entity/X11FileInfo;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-static {v1}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->f(Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;)Lcom/fimi/soul/module/flyplannermedia/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/flyplannermedia/a;->b()Z

    :cond_0
    :goto_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-static {v0, v6}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->a(Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->m()Lcom/fimi/soul/biz/camera/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->s()Lcom/fimi/soul/biz/camera/c/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fimi/soul/biz/camera/entity/X11FileInfo;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/d;->g(Ljava/lang/String;)V

    :cond_1
    return v6

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a:Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;

    invoke-virtual {v1}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment;->m()Lcom/fimi/soul/biz/camera/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->s()Lcom/fimi/soul/biz/camera/c/d;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fimi/soul/biz/camera/entity/X11FileInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/fimi/soul/biz/camera/entity/X11FileInfo;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/fimi/soul/biz/camera/entity/X11FileInfo;->getCreateDate()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/fimi/soul/biz/camera/c/d$a;->a:Lcom/fimi/soul/biz/camera/c/d$a;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/fimi/soul/biz/camera/c/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fimi/soul/biz/camera/c/d$a;)V

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lcom/fimi/soul/biz/camera/entity/X11FileInfo;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/flyplannermedia/DroneOnlineFragment$4;->a(Lcom/fimi/soul/biz/camera/entity/X11FileInfo;)Z

    move-result v0

    return v0
.end method
