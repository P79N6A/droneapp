.class public Lcom/fimi/soul/drone/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/drone/a$a;
    }
.end annotation


# instance fields
.field private final A:Lcom/fimi/soul/drone/h/r;

.field private final B:Lcom/fimi/soul/drone/h/af;

.field private final C:Lcom/fimi/soul/drone/h/aq;

.field private final D:Lcom/fimi/soul/drone/h/s;

.field private final E:Lcom/fimi/soul/drone/h/ar;

.field private final F:Lcom/fimi/soul/drone/h/ao;

.field private final G:Lcom/fimi/soul/drone/h/c;

.field private final H:Lcom/fimi/soul/drone/h/at;

.field private final I:Lcom/fimi/soul/drone/h/az;

.field private final J:Lcom/fimi/soul/drone/h/ay;

.field private final K:Lcom/fimi/soul/drone/h/ax;

.field private final L:Lcom/fimi/soul/drone/h/av;

.field private final M:Lcom/fimi/soul/drone/h/aw;

.field private final N:Lcom/fimi/soul/drone/h/an;

.field private final O:Lcom/fimi/soul/drone/h/ap;

.field private final P:Lcom/fimi/soul/drone/h/x;

.field private final Q:Lcom/fimi/soul/drone/h/w;

.field private final R:Lcom/fimi/soul/drone/h/ac;

.field private final S:Lcom/fimi/soul/drone/h/ah;

.field private final T:Lcom/fimi/soul/drone/droneconnection/connection/f$a;

.field private U:Lcom/fimi/soul/drone/h/f;

.field private V:Lcom/fimi/soul/drone/h/q;

.field private W:Z

.field private X:D

.field private Y:J

.field private Z:J

.field a:Landroid/content/SharedPreferences;

.field private aa:Lcom/google/android/gms/maps/c;

.field private ab:Z

.field private ac:Z

.field private ad:D

.field private ae:Z

.field private af:Lcom/fimi/soul/drone/h/m;

.field private final ag:Lcom/fimi/soul/drone/h/a/e;

.field private ah:Z

.field private ai:Lcom/fimi/soul/drone/h/g;

.field private aj:Lcom/google/android/gms/maps/model/LatLng;

.field private ak:F

.field private al:Z

.field private am:I

.field private an:Landroid/location/Location;

.field private ao:Z

.field private ap:Lcom/fimi/soul/drone/h/j;

.field private aq:Lcom/fimi/soul/drone/h/a/b;

.field private ar:Lcom/fimi/soul/drone/h/ad;

.field private as:Lcom/fimi/soul/drone/h/ae;

.field private at:Lcom/fimi/soul/drone/h/o;

.field private au:Lcom/fimi/soul/drone/h/p;

.field private av:Lcom/fimi/soul/drone/h/n;

.field private aw:Lcom/fimi/soul/drone/h/a/a;

.field private volatile ax:Lcom/fimi/soul/drone/a$a;

.field private ay:Lcom/fimi/soul/view/MapWrapperLayout;

.field b:Lcom/fimi/soul/utils/FlyLogTools;

.field public c:Lcom/fimi/soul/drone/c/a;

.field public d:Landroid/content/Context;

.field private final e:Lcom/fimi/soul/drone/b;

.field private final f:Lcom/fimi/soul/drone/h/u;

.field private final g:Lcom/fimi/soul/drone/h/l;

.field private final h:Lcom/fimi/soul/drone/h/al;

.field private final i:Lcom/fimi/soul/drone/h/am;

.field private final j:Lcom/fimi/soul/drone/h/aj;

.field private final k:Lcom/fimi/soul/drone/h/as;

.field private final l:Lcom/fimi/soul/drone/h/ak;

.field private final m:Lcom/fimi/soul/drone/h/y;

.field private final n:Lcom/fimi/soul/drone/h/v;

.field private final o:Lcom/fimi/soul/drone/h/ai;

.field private final p:Lcom/fimi/soul/drone/h/ag;

.field private final q:Lcom/fimi/soul/drone/h/z;

.field private final r:Lcom/fimi/soul/drone/h/d;

.field private final s:Lcom/fimi/soul/drone/h/aa;

.field private final t:Lcom/fimi/soul/drone/h/ab;

.field private final u:Lcom/fimi/soul/drone/h/k;

.field private final v:Lcom/fimi/soul/drone/h/a/c;

.field private final w:Lcom/fimi/soul/drone/h/t;

.field private final x:Lcom/fimi/soul/drone/h/a/g;

.field private final y:Lcom/fimi/soul/drone/h/e;

.field private final z:Lcom/fimi/soul/drone/h/au;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/droneconnection/connection/f$a;Landroid/content/Context;Landroid/os/Handler;)V
    .locals 4

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v2, p0, Lcom/fimi/soul/drone/a;->X:D

    iput-wide v0, p0, Lcom/fimi/soul/drone/a;->Y:J

    iput-wide v0, p0, Lcom/fimi/soul/drone/a;->Z:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/drone/a;->ac:Z

    iput-wide v2, p0, Lcom/fimi/soul/drone/a;->ad:D

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->a:Landroid/content/SharedPreferences;

    sget-object v0, Lcom/fimi/soul/drone/a$a;->b:Lcom/fimi/soul/drone/a$a;

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ax:Lcom/fimi/soul/drone/a$a;

    iput-object p2, p0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->T:Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    new-instance v0, Lcom/fimi/soul/drone/h/u;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/u;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->f:Lcom/fimi/soul/drone/h/u;

    new-instance v0, Lcom/fimi/soul/drone/h/l;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/l;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->g:Lcom/fimi/soul/drone/h/l;

    new-instance v0, Lcom/fimi/soul/drone/h/al;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/al;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->h:Lcom/fimi/soul/drone/h/al;

    new-instance v0, Lcom/fimi/soul/drone/h/am;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/am;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->i:Lcom/fimi/soul/drone/h/am;

    new-instance v0, Lcom/fimi/soul/drone/h/aj;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/aj;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->j:Lcom/fimi/soul/drone/h/aj;

    new-instance v0, Lcom/fimi/soul/drone/h/as;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/as;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->k:Lcom/fimi/soul/drone/h/as;

    new-instance v0, Lcom/fimi/soul/drone/h/ak;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ak;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->l:Lcom/fimi/soul/drone/h/ak;

    new-instance v0, Lcom/fimi/soul/drone/h/y;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/y;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->m:Lcom/fimi/soul/drone/h/y;

    new-instance v0, Lcom/fimi/soul/drone/h/v;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/v;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->n:Lcom/fimi/soul/drone/h/v;

    new-instance v0, Lcom/fimi/soul/drone/h/ai;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ai;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->o:Lcom/fimi/soul/drone/h/ai;

    new-instance v0, Lcom/fimi/soul/drone/h/ag;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ag;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->p:Lcom/fimi/soul/drone/h/ag;

    new-instance v0, Lcom/fimi/soul/drone/h/z;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/z;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->q:Lcom/fimi/soul/drone/h/z;

    new-instance v0, Lcom/fimi/soul/drone/h/d;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/d;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->r:Lcom/fimi/soul/drone/h/d;

    new-instance v0, Lcom/fimi/soul/drone/h/aa;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/aa;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->s:Lcom/fimi/soul/drone/h/aa;

    new-instance v0, Lcom/fimi/soul/drone/h/ab;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ab;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->t:Lcom/fimi/soul/drone/h/ab;

    new-instance v0, Lcom/fimi/soul/drone/h/k;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/k;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->u:Lcom/fimi/soul/drone/h/k;

    new-instance v0, Lcom/fimi/soul/drone/h/a/c;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/a/c;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->v:Lcom/fimi/soul/drone/h/a/c;

    new-instance v0, Lcom/fimi/soul/drone/h/t;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/t;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->w:Lcom/fimi/soul/drone/h/t;

    new-instance v0, Lcom/fimi/soul/drone/h/a/g;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/a/g;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->x:Lcom/fimi/soul/drone/h/a/g;

    new-instance v0, Lcom/fimi/soul/drone/h/e;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/e;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->y:Lcom/fimi/soul/drone/h/e;

    new-instance v0, Lcom/fimi/soul/drone/h/au;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/au;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->z:Lcom/fimi/soul/drone/h/au;

    new-instance v0, Lcom/fimi/soul/drone/h/r;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/r;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->A:Lcom/fimi/soul/drone/h/r;

    new-instance v0, Lcom/fimi/soul/drone/h/af;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/af;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->B:Lcom/fimi/soul/drone/h/af;

    new-instance v0, Lcom/fimi/soul/drone/h/aq;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/aq;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->C:Lcom/fimi/soul/drone/h/aq;

    new-instance v0, Lcom/fimi/soul/drone/h/s;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/s;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->D:Lcom/fimi/soul/drone/h/s;

    new-instance v0, Lcom/fimi/soul/drone/h/ar;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ar;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->E:Lcom/fimi/soul/drone/h/ar;

    new-instance v0, Lcom/fimi/soul/drone/h/ao;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ao;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->F:Lcom/fimi/soul/drone/h/ao;

    new-instance v0, Lcom/fimi/soul/drone/h/c;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/c;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->G:Lcom/fimi/soul/drone/h/c;

    new-instance v0, Lcom/fimi/soul/drone/h/at;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/at;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->H:Lcom/fimi/soul/drone/h/at;

    new-instance v0, Lcom/fimi/soul/drone/h/az;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/az;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->I:Lcom/fimi/soul/drone/h/az;

    new-instance v0, Lcom/fimi/soul/drone/h/ay;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ay;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->J:Lcom/fimi/soul/drone/h/ay;

    new-instance v0, Lcom/fimi/soul/drone/h/ax;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ax;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->K:Lcom/fimi/soul/drone/h/ax;

    new-instance v0, Lcom/fimi/soul/drone/h/av;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/av;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->L:Lcom/fimi/soul/drone/h/av;

    new-instance v0, Lcom/fimi/soul/drone/h/aw;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/aw;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->M:Lcom/fimi/soul/drone/h/aw;

    new-instance v0, Lcom/fimi/soul/drone/h/x;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/x;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->P:Lcom/fimi/soul/drone/h/x;

    new-instance v0, Lcom/fimi/soul/drone/b;

    invoke-direct {v0, p0, p3}, Lcom/fimi/soul/drone/b;-><init>(Lcom/fimi/soul/drone/a;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->e:Lcom/fimi/soul/drone/b;

    new-instance v0, Lcom/fimi/soul/drone/h/f;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/f;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->U:Lcom/fimi/soul/drone/h/f;

    new-instance v0, Lcom/fimi/soul/drone/h/an;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/an;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->N:Lcom/fimi/soul/drone/h/an;

    new-instance v0, Lcom/fimi/soul/drone/h/ap;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ap;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->O:Lcom/fimi/soul/drone/h/ap;

    new-instance v0, Lcom/fimi/soul/drone/h/q;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/q;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->V:Lcom/fimi/soul/drone/h/q;

    new-instance v0, Lcom/fimi/soul/drone/h/m;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/m;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->af:Lcom/fimi/soul/drone/h/m;

    new-instance v0, Lcom/fimi/soul/drone/h/a/b;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/a/b;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->aq:Lcom/fimi/soul/drone/h/a/b;

    new-instance v0, Lcom/fimi/soul/drone/h/j;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/j;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ap:Lcom/fimi/soul/drone/h/j;

    new-instance v0, Lcom/fimi/soul/drone/h/a/e;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/a/e;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ag:Lcom/fimi/soul/drone/h/a/e;

    new-instance v0, Lcom/fimi/soul/drone/h/w;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/w;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->Q:Lcom/fimi/soul/drone/h/w;

    new-instance v0, Lcom/fimi/soul/drone/h/ac;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ac;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->R:Lcom/fimi/soul/drone/h/ac;

    new-instance v0, Lcom/fimi/soul/drone/h/ad;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ad;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ar:Lcom/fimi/soul/drone/h/ad;

    new-instance v0, Lcom/fimi/soul/drone/h/ae;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ae;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->as:Lcom/fimi/soul/drone/h/ae;

    new-instance v0, Lcom/fimi/soul/drone/h/n;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/n;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->av:Lcom/fimi/soul/drone/h/n;

    new-instance v0, Lcom/fimi/soul/drone/h/a/a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/a/a;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->aw:Lcom/fimi/soul/drone/h/a/a;

    new-instance v0, Lcom/fimi/soul/drone/h/p;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/p;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->au:Lcom/fimi/soul/drone/h/p;

    new-instance v0, Lcom/fimi/soul/drone/h/o;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/o;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->at:Lcom/fimi/soul/drone/h/o;

    invoke-static {p2}, Lcom/fimi/soul/utils/FlyLogTools;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/FlyLogTools;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->b:Lcom/fimi/soul/utils/FlyLogTools;

    new-instance v0, Lcom/fimi/soul/drone/h/ah;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/h/ah;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->S:Lcom/fimi/soul/drone/h/ah;

    return-void
.end method

.method private a(JD)V
    .locals 7

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/NetUtil;->a(Landroid/content/Context;)Z

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/fimi/soul/utils/t;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/t;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/utils/u;

    invoke-direct {v2}, Lcom/fimi/soul/utils/u;-><init>()V

    invoke-virtual {v2, p3, p4}, Lcom/fimi/soul/utils/u;->a(D)V

    const-wide/16 v4, 0x3e8

    div-long v4, p1, v4

    invoke-virtual {v2, v4, v5}, Lcom/fimi/soul/utils/u;->a(J)V

    iget-object v3, p0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v3}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/utils/u;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/module/update/a/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/utils/u;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/fimi/soul/utils/t;->a(Lcom/fimi/soul/utils/u;)V

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->b:Lcom/fimi/soul/utils/FlyLogTools;

    invoke-virtual {v0}, Lcom/fimi/soul/utils/FlyLogTools;->a()V

    :cond_0
    return-void
.end method

.method private a(JJ)V
    .locals 3

    const-wide/32 v0, 0x1b7740

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-wide v0, p0, Lcom/fimi/soul/drone/a;->ad:D

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/fimi/soul/drone/a;->a(JD)V

    goto :goto_0
.end method


# virtual methods
.method public A()Lcom/fimi/soul/drone/h/a/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->v:Lcom/fimi/soul/drone/h/a/c;

    return-object v0
.end method

.method public B()Lcom/fimi/soul/drone/h/t;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->w:Lcom/fimi/soul/drone/h/t;

    return-object v0
.end method

.method public C()Lcom/fimi/soul/drone/h/a/g;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->x:Lcom/fimi/soul/drone/h/a/g;

    return-object v0
.end method

.method public D()Lcom/fimi/soul/drone/h/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->y:Lcom/fimi/soul/drone/h/e;

    return-object v0
.end method

.method public E()Lcom/fimi/soul/drone/h/au;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->z:Lcom/fimi/soul/drone/h/au;

    return-object v0
.end method

.method public F()Lcom/fimi/soul/drone/h/r;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->A:Lcom/fimi/soul/drone/h/r;

    return-object v0
.end method

.method public G()Lcom/fimi/soul/drone/h/af;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->B:Lcom/fimi/soul/drone/h/af;

    return-object v0
.end method

.method public H()Lcom/fimi/soul/drone/h/aq;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->C:Lcom/fimi/soul/drone/h/aq;

    return-object v0
.end method

.method public I()Lcom/fimi/soul/drone/h/s;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->D:Lcom/fimi/soul/drone/h/s;

    return-object v0
.end method

.method public J()Lcom/fimi/soul/drone/h/ar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->E:Lcom/fimi/soul/drone/h/ar;

    return-object v0
.end method

.method public K()Lcom/fimi/soul/drone/h/ao;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->F:Lcom/fimi/soul/drone/h/ao;

    return-object v0
.end method

.method public L()Lcom/fimi/soul/drone/h/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->G:Lcom/fimi/soul/drone/h/c;

    return-object v0
.end method

.method public M()Lcom/fimi/soul/drone/h/at;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->H:Lcom/fimi/soul/drone/h/at;

    return-object v0
.end method

.method public N()Lcom/fimi/soul/drone/h/az;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->I:Lcom/fimi/soul/drone/h/az;

    return-object v0
.end method

.method public O()Lcom/fimi/soul/drone/h/ay;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->J:Lcom/fimi/soul/drone/h/ay;

    return-object v0
.end method

.method public P()Lcom/fimi/soul/drone/h/ax;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->K:Lcom/fimi/soul/drone/h/ax;

    return-object v0
.end method

.method public Q()Lcom/fimi/soul/drone/h/av;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->L:Lcom/fimi/soul/drone/h/av;

    return-object v0
.end method

.method public R()Lcom/fimi/soul/drone/h/aw;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->M:Lcom/fimi/soul/drone/h/aw;

    return-object v0
.end method

.method public S()Lcom/fimi/soul/drone/h/x;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->P:Lcom/fimi/soul/drone/h/x;

    return-object v0
.end method

.method public T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->T:Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    return-object v0
.end method

.method public U()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->al:Z

    return v0
.end method

.method public V()V
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->ab:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/a$a;->c:Lcom/fimi/soul/drone/a$a;

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ax:Lcom/fimi/soul/drone/a$a;

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->ab()V

    :cond_0
    return-void
.end method

.method public W()Z
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v0

    return v0
.end method

.method public X()Lcom/fimi/soul/drone/h/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->U:Lcom/fimi/soul/drone/h/f;

    return-object v0
.end method

.method public Y()Lcom/fimi/soul/drone/h/an;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->N:Lcom/fimi/soul/drone/h/an;

    return-object v0
.end method

.method public Z()Lcom/fimi/soul/drone/h/ap;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->O:Lcom/fimi/soul/drone/h/ap;

    return-object v0
.end method

.method public a()Lcom/fimi/soul/drone/h/g;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->ai:Lcom/fimi/soul/drone/h/g;

    return-object v0
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/drone/a;->ak:F

    return-void
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->af:Lcom/fimi/soul/drone/h/m;

    iget-object v1, p0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/h/m;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->an:Landroid/location/Location;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/d$a;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->e:Lcom/fimi/soul/drone/b;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/drone/b;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/d$b;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->e:Lcom/fimi/soul/drone/b;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/drone/b;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->aq:Lcom/fimi/soul/drone/h/a/b;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/g;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->ai:Lcom/fimi/soul/drone/h/g;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/j;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->ap:Lcom/fimi/soul/drone/h/j;

    return-void
.end method

.method public a(Lcom/fimi/soul/view/MapWrapperLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->ay:Lcom/fimi/soul/view/MapWrapperLayout;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->aa:Lcom/google/android/gms/maps/c;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/a;->aj:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/a;->ao:Z

    return-void
.end method

.method public aa()Lcom/google/android/gms/maps/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->aa:Lcom/google/android/gms/maps/c;

    return-object v0
.end method

.method public ab()V
    .locals 7

    const/4 v6, 0x1

    const-wide/16 v4, 0x0

    invoke-static {}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a()Lcom/fimi/soul/drone/droneconnection/connection/c;

    sget-object v0, Lcom/fimi/soul/drone/a$1;->a:[I

    iget-object v1, p0, Lcom/fimi/soul/drone/a;->ax:Lcom/fimi/soul/drone/a$a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->ac:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/drone/a;->X:D

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/drone/a;->ac:Z

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/a;->Z:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/soul/drone/a;->Z:J

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/h/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/y;->a()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/a;->ad:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fimi/soul/drone/a;->ad:D

    goto :goto_0

    :pswitch_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-double v0, v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/a;->X:D

    sub-double/2addr v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/drone/a;->Y:J

    iget-wide v0, p0, Lcom/fimi/soul/drone/a;->Y:J

    iget-wide v2, p0, Lcom/fimi/soul/drone/a;->ad:D

    double-to-long v2, v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/fimi/soul/drone/a;->a(JJ)V

    iput-wide v4, p0, Lcom/fimi/soul/drone/a;->X:D

    iput-wide v4, p0, Lcom/fimi/soul/drone/a;->ad:D

    iput-boolean v6, p0, Lcom/fimi/soul/drone/a;->ac:Z

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public ac()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->ab:Z

    return v0
.end method

.method public ad()Lcom/fimi/soul/drone/h/q;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->V:Lcom/fimi/soul/drone/h/q;

    return-object v0
.end method

.method public ae()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/a;->ak:F

    return v0
.end method

.method public af()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->ae:Z

    return v0
.end method

.method public ag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->af:Lcom/fimi/soul/drone/h/m;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/m;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ah()Lcom/fimi/soul/drone/b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->e:Lcom/fimi/soul/drone/b;

    return-object v0
.end method

.method public ai()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->aj:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public aj()Lcom/fimi/soul/drone/h/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->ag:Lcom/fimi/soul/drone/h/a/e;

    return-object v0
.end method

.method public ak()Lcom/fimi/soul/drone/h/w;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->Q:Lcom/fimi/soul/drone/h/w;

    return-object v0
.end method

.method public al()Lcom/fimi/soul/drone/h/ac;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->R:Lcom/fimi/soul/drone/h/ac;

    return-object v0
.end method

.method public am()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->W:Z

    return v0
.end method

.method public an()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/a;->am:I

    return v0
.end method

.method public ao()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->ah:Z

    return v0
.end method

.method public ap()Lcom/fimi/soul/drone/h/a/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->aw:Lcom/fimi/soul/drone/h/a/a;

    return-object v0
.end method

.method public aq()Lcom/fimi/soul/view/MapWrapperLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->ay:Lcom/fimi/soul/view/MapWrapperLayout;

    return-object v0
.end method

.method public ar()Lcom/fimi/soul/drone/h/ah;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->S:Lcom/fimi/soul/drone/h/ah;

    return-object v0
.end method

.method public b()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->an:Landroid/location/Location;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/drone/a;->am:I

    return-void
.end method

.method public b(Lcom/fimi/soul/drone/d$b;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->e:Lcom/fimi/soul/drone/b;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/drone/b;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/a;->al:Z

    return-void
.end method

.method public c(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/fimi/soul/drone/a;->ab:Z

    if-eqz p1, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/a$a;->a:Lcom/fimi/soul/drone/a$a;

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ax:Lcom/fimi/soul/drone/a$a;

    :goto_0
    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->ab()V

    return-void

    :cond_0
    sget-object v0, Lcom/fimi/soul/drone/a$a;->b:Lcom/fimi/soul/drone/a$a;

    iput-object v0, p0, Lcom/fimi/soul/drone/a;->ax:Lcom/fimi/soul/drone/a$a;

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/a;->ao:Z

    return v0
.end method

.method public d()Lcom/fimi/soul/drone/h/o;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->at:Lcom/fimi/soul/drone/h/o;

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/a;->ae:Z

    return-void
.end method

.method public e()Lcom/fimi/soul/drone/h/ae;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->as:Lcom/fimi/soul/drone/h/ae;

    return-object v0
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/a;->W:Z

    return-void
.end method

.method public f()Lcom/fimi/soul/drone/h/p;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->au:Lcom/fimi/soul/drone/h/p;

    return-object v0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/a;->ah:Z

    return-void
.end method

.method public g()Lcom/fimi/soul/drone/h/ad;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->ar:Lcom/fimi/soul/drone/h/ad;

    return-object v0
.end method

.method public h()Lcom/fimi/soul/drone/h/a/b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->aq:Lcom/fimi/soul/drone/h/a/b;

    return-object v0
.end method

.method public i()Lcom/fimi/soul/drone/h/j;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->ap:Lcom/fimi/soul/drone/h/j;

    return-object v0
.end method

.method public j()Lcom/fimi/soul/drone/h/u;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->f:Lcom/fimi/soul/drone/h/u;

    return-object v0
.end method

.method public k()Lcom/fimi/soul/drone/h/l;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->g:Lcom/fimi/soul/drone/h/l;

    return-object v0
.end method

.method public l()Lcom/fimi/soul/drone/h/al;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->h:Lcom/fimi/soul/drone/h/al;

    return-object v0
.end method

.method public m()Lcom/fimi/soul/drone/h/am;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->i:Lcom/fimi/soul/drone/h/am;

    return-object v0
.end method

.method public n()Lcom/fimi/soul/drone/h/aj;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->j:Lcom/fimi/soul/drone/h/aj;

    return-object v0
.end method

.method public o()Lcom/fimi/soul/drone/h/as;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->k:Lcom/fimi/soul/drone/h/as;

    return-object v0
.end method

.method public p()Lcom/fimi/soul/drone/h/n;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->av:Lcom/fimi/soul/drone/h/n;

    return-object v0
.end method

.method public q()Lcom/fimi/soul/drone/h/ak;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->l:Lcom/fimi/soul/drone/h/ak;

    return-object v0
.end method

.method public r()Lcom/fimi/soul/drone/h/y;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->m:Lcom/fimi/soul/drone/h/y;

    return-object v0
.end method

.method public s()Lcom/fimi/soul/drone/h/v;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->n:Lcom/fimi/soul/drone/h/v;

    return-object v0
.end method

.method public t()Lcom/fimi/soul/drone/h/ai;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->o:Lcom/fimi/soul/drone/h/ai;

    return-object v0
.end method

.method public u()Lcom/fimi/soul/drone/h/ag;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->p:Lcom/fimi/soul/drone/h/ag;

    return-object v0
.end method

.method public v()Lcom/fimi/soul/drone/h/z;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->q:Lcom/fimi/soul/drone/h/z;

    return-object v0
.end method

.method public w()Lcom/fimi/soul/drone/h/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->r:Lcom/fimi/soul/drone/h/d;

    return-object v0
.end method

.method public x()Lcom/fimi/soul/drone/h/aa;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->s:Lcom/fimi/soul/drone/h/aa;

    return-object v0
.end method

.method public y()Lcom/fimi/soul/drone/h/ab;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->t:Lcom/fimi/soul/drone/h/ab;

    return-object v0
.end method

.method public z()Lcom/fimi/soul/drone/h/k;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/a;->u:Lcom/fimi/soul/drone/h/k;

    return-object v0
.end method
