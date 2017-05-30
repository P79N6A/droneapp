.class Lcom/fimi/soul/module/droneFragment/k$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/view/MyEditView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/k;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/k;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k$4;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$4;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->a(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/MyEditView;->clearFocus()V

    return-void
.end method
