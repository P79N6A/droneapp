.class Lcom/fimi/soul/module/droneFragment/f$11;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/f;-><init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/f;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->d(Lcom/fimi/soul/module/droneFragment/f;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    mul-int/2addr v1, v2

    int-to-double v2, v1

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    div-double/2addr v2, v4

    double-to-int v1, v2

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;I)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->p(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->i(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->i(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;I)I

    :cond_0
    return-void
.end method

.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;IZ)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->o(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->p(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-gt p2, v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->p(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result p2

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ge p2, v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result p2

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "m"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setRidus(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->k(Lcom/fimi/soul/module/droneFragment/f;)V

    :cond_2
    return-void
.end method

.method public b(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 6

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->d(Lcom/fimi/soul/module/droneFragment/f;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->l(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    mul-double/2addr v0, v4

    invoke-virtual {p1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    invoke-virtual {p1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v3

    mul-int/2addr v2, v3

    int-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->l(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    mul-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    if-lt v1, v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$11;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->j(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "m/s"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
