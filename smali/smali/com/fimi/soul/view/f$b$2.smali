.class Lcom/fimi/soul/view/f$b$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/view/f$b;->a()Lcom/fimi/soul/view/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/fimi/soul/view/f$b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/view/f$b;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    iput-object p2, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 10

    const v7, 0x7f0a038c

    const/4 v2, 0x6

    const-wide/high16 v8, 0x4018000000000000L    # 6.0

    const v6, 0x7f0a03d6

    const v3, 0x7f0a03d5

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->m()Z

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v1}, Lcom/fimi/soul/view/f$b;->a(Lcom/fimi/soul/view/f$b;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v1}, Lcom/fimi/soul/view/f$b;->b(Lcom/fimi/soul/view/f$b;)I

    move-result v1

    add-int/2addr v1, p2

    if-eqz v0, :cond_2

    int-to-double v2, v1

    invoke-static {v8, v9}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a038d

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v0}, Lcom/fimi/soul/view/f$b;->e(Lcom/fimi/soul/view/f$b;)Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onProgressChanged(Landroid/widget/SeekBar;IZ)V

    return-void

    :cond_0
    int-to-double v2, v1

    invoke-static {v8, v9}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_1

    int-to-double v2, v1

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a038e

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    if-gt v1, v2, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a038d

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_3
    if-le v1, v2, :cond_4

    const/16 v0, 0xa

    if-gt v1, v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a038e

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_5
    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->b(Lcom/fimi/soul/view/f$b;)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->c(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a0166

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->b(Lcom/fimi/soul/view/f$b;)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v2}, Lcom/fimi/soul/view/f$b;->d(Lcom/fimi/soul/view/f$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v0}, Lcom/fimi/soul/view/f$b;->e(Lcom/fimi/soul/view/f$b;)Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStartTrackingTouch(Landroid/widget/SeekBar;)V

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b$2;->b:Lcom/fimi/soul/view/f$b;

    invoke-static {v0}, Lcom/fimi/soul/view/f$b;->e(Lcom/fimi/soul/view/f$b;)Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    return-void
.end method
