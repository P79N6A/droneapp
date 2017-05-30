.class public Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Landroid/widget/ImageView;

.field private C:Lcom/fimi/soul/view/f$a;

.field private D:Landroid/app/Dialog;

.field private a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private h:Landroid/widget/ImageButton;

.field private i:Landroid/content/Context;

.field private j:Lcom/fimi/soul/base/DroidPlannerApp;

.field private k:Lcom/fimi/soul/drone/a;

.field private l:Lcom/fimi/soul/module/b/d;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:I

.field private u:I

.field private v:Landroid/widget/ImageView;

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/widget/ImageView;

.field private y:Landroid/widget/ImageView;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/16 v0, 0x14

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->u:I

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)Lcom/fimi/soul/module/b/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->l:Lcom/fimi/soul/module/b/d;

    return-object v0
.end method

.method private a(II)V
    .locals 9

    const/4 v8, 0x3

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-eqz v0, :cond_1

    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    invoke-virtual {p0, v7, v4, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    const v0, 0x3e99999a    # 0.3f

    new-array v1, v6, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->y:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->m:Landroid/widget/TextView;

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    :goto_0
    const v0, 0x3e99999a    # 0.3f

    const/16 v1, 0xc

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->z:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->A:Landroid/widget/ImageView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->o:Landroid/widget/TextView;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    aput-object v2, v1, v8

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->w:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->x:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->v:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->B:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    invoke-virtual {p0, v7, v4, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    new-array v0, v8, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->y:Landroid/widget/ImageView;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->m:Landroid/widget/TextView;

    aput-object v1, v0, v6

    invoke-virtual {p0, v7, v5, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    goto :goto_0

    :cond_2
    const v0, 0x3e99999a    # 0.3f

    new-array v1, v6, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->y:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->m:Landroid/widget/TextView;

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    invoke-virtual {p0, v7, v4, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x3e99999a    # 0.3f

    new-array v1, v6, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->z:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    invoke-virtual {p0, v7, v4, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    :goto_2
    const v0, 0x3e99999a    # 0.3f

    const/16 v1, 0xa

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->w:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->x:Landroid/widget/ImageView;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    aput-object v2, v1, v8

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->v:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->A:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->o:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->B:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    invoke-virtual {p0, v7, v4, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    goto/16 :goto_1

    :cond_4
    new-array v0, v8, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->z:Landroid/widget/ImageView;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    aput-object v1, v0, v6

    invoke-virtual {p0, v7, v5, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    goto :goto_2

    :cond_5
    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->A:Landroid/widget/ImageView;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->o:Landroid/widget/TextView;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->z:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-virtual {p0, v7, v5, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->judgeNoAction()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->c()Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v0, 0xc

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->v:Landroid/widget/ImageView;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    aput-object v1, v0, v6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->w:Landroid/widget/ImageView;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->x:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->B:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-virtual {p0, v7, v5, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    goto/16 :goto_1

    :cond_6
    const v0, 0x3e99999a    # 0.3f

    const/16 v1, 0x8

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->w:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->x:Landroid/widget/ImageView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    aput-object v2, v1, v8

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->v:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->B:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    const/4 v0, 0x4

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v1, v0, v8

    invoke-virtual {p0, v7, v4, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    goto/16 :goto_1
.end method


# virtual methods
.method public a()V
    .locals 9

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x7

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v1, v7

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v2, v1, v8

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    const v0, 0x3e99999a    # 0.3f

    const/4 v1, 0x7

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->z:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->y:Landroid/widget/ImageView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->A:Landroid/widget/ImageView;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->m:Landroid/widget/TextView;

    aput-object v2, v1, v7

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->o:Landroid/widget/TextView;

    aput-object v2, v1, v8

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    const v0, 0x3e99999a    # 0.3f

    const/4 v1, 0x7

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->v:Landroid/widget/ImageView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->w:Landroid/widget/ImageView;

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->x:Landroid/widget/ImageView;

    aput-object v2, v1, v7

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    aput-object v2, v1, v8

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->B:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v4, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(FZ[Landroid/view/View;)V

    return-void
.end method

.method public varargs a(FZ[Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_2

    aget-object v1, p3, v0

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpl-float v2, v2, p1

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eq v1, p2, :cond_1

    aget-object v1, p3, v0

    invoke-virtual {v1, p2}, Landroid/view/View;->setEnabled(Z)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public b()V
    .locals 4

    const/4 v3, 0x0

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/e;->b()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v1, 0x766

    if-ge v0, v1, :cond_1

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/view/e$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0a01b6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/e$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/e$a;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/e$a;->a(Z)Lcom/fimi/soul/view/e$a;

    const v1, 0x7f0a01cb

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$7;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$7;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/e$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/e$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/e$a;->a()Lcom/fimi/soul/view/e;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->i:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->j:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->j:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10

    const v9, 0x7f0a017f

    const v8, 0x7f0a0103

    const/16 v7, 0x7d0

    const/4 v1, 0x0

    const/16 v6, 0xbb8

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->u:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a040b

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    invoke-virtual {p0, v9}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$2;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {p0, v8}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$1;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a040a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0468

    invoke-static {v0, v1, v7}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0468

    invoke-static {v0, v1, v7}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_2

    :sswitch_2
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a026c

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    invoke-virtual {p0, v9}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$4;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {p0, v8}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$3;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0466

    invoke-static {v0, v1, v7}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_3

    :sswitch_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/ag;->f()D

    move-result-wide v2

    const-wide v4, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a0204

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    invoke-virtual {p0, v9}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$6;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$6;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {p0, v8}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$5;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$5;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :goto_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0272

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0467

    invoke-static {v0, v1, v7}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_4

    :sswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isGps()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/d;->a(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0107

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :sswitch_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isGps()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/d;->a(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0109

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :sswitch_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isGps()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/d;->a(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0106

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isGps()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a015f

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->t()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a01fd

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_b
    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a02ce

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_c
    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->c:Lcom/fimi/soul/drone/c/a;

    check-cast v0, Lcom/fimi/soul/drone/h/g;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->f()Lcom/fimi/soul/drone/h/g$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/g$a;->f:Lcom/fimi/soul/drone/h/g$a;

    if-ne v1, v2, :cond_e

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a041a

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :cond_d
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_e
    :try_start_1
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->f()Lcom/fimi/soul/drone/h/g$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/g$a;->g:Lcom/fimi/soul/drone/h/g$a;

    if-ne v1, v2, :cond_f

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0415

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_f
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->f()Lcom/fimi/soul/drone/h/g$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/g$a;->d:Lcom/fimi/soul/drone/h/g$a;

    if-ne v1, v2, :cond_10

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0416

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_10
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->f()Lcom/fimi/soul/drone/h/g$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/h/g$a;->l:Lcom/fimi/soul/drone/h/g$a;

    if-ne v0, v1, :cond_d

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0417

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :cond_11
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0108

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f0f027b -> :sswitch_0
        0x7f0f027c -> :sswitch_1
        0x7f0f027f -> :sswitch_2
        0x7f0f0282 -> :sswitch_3
        0x7f0f0285 -> :sswitch_4
        0x7f0f0288 -> :sswitch_7
        0x7f0f028b -> :sswitch_5
        0x7f0f028e -> :sswitch_6
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    new-instance v0, Lcom/fimi/soul/view/f$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v1, 0x0

    const v0, 0x7f04005f

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f0f0288

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f028a

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    const v0, 0x7f0f0289

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->B:Landroid/widget/ImageView;

    const v0, 0x7f0f027b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->h:Landroid/widget/ImageButton;

    const v0, 0x7f0f027c

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f027f

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f0282

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f0285

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f028b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f028e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/16 v0, 0x8

    new-array v3, v0, [Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->g:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v0, v3, v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v0, v3, v6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->b:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v0, v3, v7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->c:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v0, v3, v8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->d:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v0, v3, v9

    const/4 v0, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v4, v3, v0

    const/4 v0, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->f:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    aput-object v4, v3, v0

    const/4 v0, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->h:Landroid/widget/ImageButton;

    aput-object v4, v3, v0

    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->l:Lcom/fimi/soul/module/b/d;

    const v0, 0x7f0f027e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->m:Landroid/widget/TextView;

    const v0, 0x7f0f0284

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->o:Landroid/widget/TextView;

    const v0, 0x7f0f0281

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    const v0, 0x7f0f0287

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    const v0, 0x7f0f028d

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    const v0, 0x7f0f0290

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Landroid/view/View;

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->m:Landroid/widget/TextView;

    aput-object v4, v3, v1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->o:Landroid/widget/TextView;

    aput-object v1, v3, v6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->p:Landroid/widget/TextView;

    aput-object v1, v3, v7

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->q:Landroid/widget/TextView;

    aput-object v1, v3, v8

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->r:Landroid/widget/TextView;

    aput-object v1, v3, v9

    const/4 v1, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->s:Landroid/widget/TextView;

    aput-object v4, v3, v1

    const/4 v1, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->n:Landroid/widget/TextView;

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const v0, 0x7f0f027d

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->y:Landroid/widget/ImageView;

    const v0, 0x7f0f0280

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->z:Landroid/widget/ImageView;

    const v0, 0x7f0f0283

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->A:Landroid/widget/ImageView;

    const v0, 0x7f0f0286

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->v:Landroid/widget/ImageView;

    const v0, 0x7f0f028c

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->w:Landroid/widget/ImageView;

    const v0, 0x7f0f028f

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->x:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a()V

    return-object v2
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->D:Landroid/app/Dialog;

    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->C:Lcom/fimi/soul/view/f$a;

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment$8;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->t:I

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->d()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->u:I

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->t:I

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->u:I

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a(II)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->a()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneControlFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method
