.class Lcom/fimi/soul/module/droneFragment/a$6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/a;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 6

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/a;->i(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/a;->d(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/a;->j(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/module/droneFragment/a;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$6;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/module/droneFragment/a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0
.end method
