.class Lcom/fimi/soul/module/droneFragment/b$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/media/player/IMediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/b;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/b$2;->a:Lcom/fimi/soul/module/droneFragment/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Lcom/fimi/soul/media/player/IMediaPlayer;)V
    .locals 2

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/b;->i()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
